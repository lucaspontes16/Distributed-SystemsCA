package services.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import com.example.iot.DeviceControlRequest;
import com.example.iot.DeviceControlResponse;
import com.example.iot.IoTDevMonitoringRequest;
import com.example.iot.IoTDevMonitoringResponse;
import com.example.iot.IoTIntegrationServiceGrpc;

import client.services.JmDNSManager;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

// Class that implements the IoTIntegrationServiceGrpc interface
public class IoTIntegrationServiceImpl extends IoTIntegrationServiceGrpc.IoTIntegrationServiceImplBase {

	// Map to store the sensor data, sensor ID as key and the sensor data as value
    private final Map<String, IoTDevMonitoringResponse> sensorsData = new HashMap<>();
 // Map to store the status device , device ID as key and the device status as value
    private final Map<String, String> deviceStatuses = new HashMap<>();

    //constructor to initialize the sensor data and device status
    public IoTIntegrationServiceImpl() {
        // Initialize the sample sensors data 
        sensorsData.put("sensor1", IoTDevMonitoringResponse.newBuilder()
                .setSensorId("sensor1")
                .setSensorType("Temperature")
                .setSensorStatus("Active")
                .setTempValue(22.5)
                .setLightValue(300)
                .setNoiseLevel(50)
                .build());
        
        sensorsData.put("sensor2", IoTDevMonitoringResponse.newBuilder()
                .setSensorId("sensor2")
                .setSensorType("Light")
                .setSensorStatus("Inactive")
                .setTempValue(0)
                .setLightValue(500)
                .setNoiseLevel(30)
                .build());
        
        // Initialize the devices 
        deviceStatuses.put("door1", "DoorClose");
    }

    //method called when a costumer resquest to monitor a device 
    @Override
    public void ioTDevMonitoringServ(IoTDevMonitoringRequest request, StreamObserver<IoTDevMonitoringResponse> responseObserver) {
        IoTDevMonitoringResponse sensorData = sensorsData.get(request.getSensorId());

        // send it to the client if the sensor is found 
        if (sensorData != null) {
            responseObserver.onNext(sensorData);
        } else {
        	// Sends a message "not found" if the sensor is not found 
            responseObserver.onNext(IoTDevMonitoringResponse.newBuilder()
                    .setSensorId(request.getSensorId())
                    .setSensorStatus("Not Found")
                    .build());
        }
        
        // the respose is completed 
        responseObserver.onCompleted();
    }

    //Method called when a client requests to control a device 
    @Override
    public void deviceControl(DeviceControlRequest request, StreamObserver<DeviceControlResponse> responseObserver) {
        // Get the device status from the map
        String doorStatus = deviceStatuses.get(request.getDeviceId());
        // switch case to determine the action to take based on request 
        String message;
        switch (request.getAction()) {
            case "turn_on":
                message = "Device turned on successfully";
                break;
            case "turn_off":
                message = "Device turned off successfully";
                break;
            case "set_temp":
                message = "Temperature set to " + request.getValue() + " degrees";
                break;
            case "open_door":
                doorStatus = "DoorOpen";
                deviceStatuses.put(request.getDeviceId(), doorStatus);
                message = "Door opened successfully";
                break;
            case "close_door":
                doorStatus = "DoorClose";
                deviceStatuses.put(request.getDeviceId(), doorStatus);
                message = "Door closed successfully";
                break;
            case "lock_door":
                doorStatus = "DoorLock";
                deviceStatuses.put(request.getDeviceId(), doorStatus);
                message = "Door locked successfully";
                break;
            default:
                message = "Unknown action";
        }
        
        // Action response message 
        DeviceControlResponse response = DeviceControlResponse.newBuilder()
                .setMessage(message)
                .setDoorStatus(doorStatus != null ? doorStatus : "Unknown")
                .build();

        // Sends the response to the client 
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
    
    //Main method to starts the server 
    public static void main(String[] args) throws IOException, InterruptedException {
        //Creates the server on port 8082
    	Server server = ServerBuilder.forPort(8082)
                .addService(new IoTIntegrationServiceImpl())
                .build();

    	//Starts the server 
        server.start();
        System.out.println("IoT Integration Service started at " + server.getPort());

        // Register the service with JmDNS using the JmDNSManager class
        JmDNSManager jmDNSManager = new JmDNSManager();
        jmDNSManager.registerService("IoTIntegrationService", 8082);

        //wait to the server termination
        server.awaitTermination();

        // Close the JmDNS service
        jmDNSManager.close();
    }
        
    }
           
    

