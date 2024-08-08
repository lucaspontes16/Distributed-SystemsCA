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


public class IoTIntegrationServiceClient {

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8082)
                .usePlaintext()
                .build();

        IoTIntegrationServiceGrpc.IoTIntegrationServiceBlockingStub stub = IoTIntegrationServiceGrpc.newBlockingStub(channel);

        // Monitorar sensor
        IoTDevMonitoringRequest monitoringRequest = IoTDevMonitoringRequest.newBuilder()
                .setSensorId("sensor1")
                .build();
        IoTDevMonitoringResponse monitoringResponse = stub.ioTDevMonitoringServ(monitoringRequest);
        System.out.println("Sensor ID: " + monitoringResponse.getSensorId());
        System.out.println("Sensor Type: " + monitoringResponse.getSensorType());
        System.out.println("Temperature: " + monitoringResponse.getTempValue());
        System.out.println("Light Value: " + monitoringResponse.getLightValue());
        System.out.println("Noise Level: " + monitoringResponse.getNoiseLevel());

        // Controle de dispositivo
        DeviceControlRequest controlRequest = DeviceControlRequest.newBuilder()
                .setDeviceId("door1")
                .setAction("open_door")
                .build();
        DeviceControlResponse controlResponse = stub.deviceControl(controlRequest);
        System.out.println(controlResponse.getMessage());
        System.out.println("Door Status: " + controlResponse.getDoorStatus());

        channel.shutdown();
    }
    public static void main1(String[] args) throws IOException, InterruptedException {
        // Descobrir o serviço com JmDNS usando a classe JmDNSManager
        JmDNSManager jmDNSManager = new JmDNSManager();
        ServiceInfo serviceInfo = jmDNSManager.discoverService("IoTIntegrationService");

        if (serviceInfo != null) {
            String host = serviceInfo.getHostAddresses()[0];
            int port = serviceInfo.getPort();

            // Conectar ao servidor gRPC descoberto
            ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port)
                    .usePlaintext()
                    .build();

            IoTIntegrationServiceGrpc.IoTIntegrationServiceBlockingStub stub = IoTIntegrationServiceGrpc.newBlockingStub(channel);

            // Faça chamadas gRPC como de costume...

            channel.shutdown();
        } else {
            System.out.println("Service not found");
        }

        jmDNSManager.close();
    }
}