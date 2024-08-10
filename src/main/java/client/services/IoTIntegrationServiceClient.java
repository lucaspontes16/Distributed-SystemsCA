package client.services;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.io.IOException;

import javax.jmdns.ServiceInfo;

import com.example.iot.DeviceControlRequest;
import com.example.iot.DeviceControlResponse;
import com.example.iot.IoTDevMonitoringRequest;
import com.example.iot.IoTDevMonitoringResponse;
import com.example.iot.IoTIntegrationServiceGrpc;


// The client class
public class IoTIntegrationServiceClient {
    private final ManagedChannel channel;
    private final IoTIntegrationServiceGrpc.IoTIntegrationServiceBlockingStub stub;
    public IoTIntegrationServiceClient() {
        this.channel = ManagedChannelBuilder.forAddress("localhost", 8082).usePlaintext().build();
        this.stub = IoTIntegrationServiceGrpc.newBlockingStub(channel);
    }

    public IoTDevMonitoringResponse monitorSensor(IoTDevMonitoringRequest request) {
        return stub.ioTDevMonitoringServ(request);
    }

    public void shutdown() {
        channel.shutdown();
    }
	// Main method that demonstrates how to use the client 
    public static void main(String[] args) {
    	//Create a channel to the server 
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8082)
                .usePlaintext()
                .build();

        try {
        	//Create a blocking stub for the service 
            IoTIntegrationServiceGrpc.IoTIntegrationServiceBlockingStub stub = IoTIntegrationServiceGrpc.newBlockingStub(channel);

            // Resquest for Sensor monitoring 
            IoTDevMonitoringRequest monitoringRequest = IoTDevMonitoringRequest.newBuilder()
                    .setSensorId("sensor1")
                    .build();
            //Call the sensor monitoring service 
            IoTDevMonitoringResponse monitoringResponse = stub.ioTDevMonitoringServ(monitoringRequest);
            //the response printing 
            System.out.println("Sensor ID: " + monitoringResponse.getSensorId());
            System.out.println("Sensor Type: " + monitoringResponse.getSensorType());
            System.out.println("Temperature: " + monitoringResponse.getTempValue());
            System.out.println("Light Value: " + monitoringResponse.getLightValue());
            System.out.println("Noise Level: " + monitoringResponse.getNoiseLevel());

            // Request Device control
            DeviceControlRequest controlRequest = DeviceControlRequest.newBuilder()
                    .setDeviceId("door1")
                    .setAction("open_door")
                    .build();
            //Call the device control service 
            DeviceControlResponse controlResponse = stub.deviceControl(controlRequest);
           //Prints the response 
            System.out.println(controlResponse.getMessage());
            System.out.println("Door Status: " + controlResponse.getDoorStatus());
        } finally {
        	//close the channel
            channel.shutdown();
        }
    }

    //Main method that demonstrate how to discover the service 
    public static void main1(String[] args) throws IOException, InterruptedException {
        // Create a JMDNS mananger 
        JmDNSManager jmDNSManager = new JmDNSManager();
        //Discover the service 
        ServiceInfo serviceInfo = jmDNSManager.discoverService("IoTIntegrationService");

        if (serviceInfo != null) {
        	//Get the service host and port 
            String host = serviceInfo.getHostAddresses()[0];
            int port = serviceInfo.getPort();

            // Conects to the GRPC server discoverd 
            ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port)
                    .usePlaintext()
                    .build();

            // GRPC calling 

            channel.shutdown();
        } else {
            System.out.println("Service not found");
        }

        //close the jmDNSManager
        jmDNSManager.close();
    }

    public DeviceControlResponse controlDevice(DeviceControlRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}