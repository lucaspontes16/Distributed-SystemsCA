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

public class IoTIntegrationServiceImpl extends IoTIntegrationServiceGrpc.IoTIntegrationServiceImplBase {

    private final Map<String, IoTDevMonitoringResponse> sensorsData = new HashMap<>();
    private final Map<String, String> deviceStatuses = new HashMap<>();

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

    @Override
    public void ioTDevMonitoringServ(IoTDevMonitoringRequest request, StreamObserver<IoTDevMonitoringResponse> responseObserver) {
        IoTDevMonitoringResponse sensorData = sensorsData.get(request.getSensorId());

        if (sensorData != null) {
            responseObserver.onNext(sensorData);
        } else {
            responseObserver.onNext(IoTDevMonitoringResponse.newBuilder()
                    .setSensorId(request.getSensorId())
                    .setSensorStatus("Not Found")
                    .build());
        }

        responseObserver.onCompleted();
    }

    @Override
    public void deviceControl(DeviceControlRequest request, StreamObserver<DeviceControlResponse> responseObserver) {
        String message;
        String doorStatus = deviceStatuses.get(request.getDeviceId());

        if ("turn_on".equals(request.getAction())) {
            message = "Device turned on successfully";
        } else if ("turn_off".equals(request.getAction())) {
            message = "Device turned off successfully";
        } else if ("set_temp".equals(request.getAction())) {
            message = "Temperature set to " + request.getValue() + " degrees";
        } else if ("open_door".equals(request.getAction())) {
            doorStatus = "DoorOpen";
            deviceStatuses.put(request.getDeviceId(), doorStatus);
            message = "Door opened successfully";
        } else if ("close_door".equals(request.getAction())) {
            doorStatus = "DoorClose";
            deviceStatuses.put(request.getDeviceId(), doorStatus);
            message = "Door closed successfully";
        } else if ("lock_door".equals(request.getAction())) {
            doorStatus = "DoorLock";
            deviceStatuses.put(request.getDeviceId(), doorStatus);
            message = "Door locked successfully";
        } else {
            message = "Unknown action";
        }

        DeviceControlResponse response = DeviceControlResponse.newBuilder()
                .setMessage(message)
                .setDoorStatus(doorStatus != null ? doorStatus : "Unknown")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(8082)
                .addService(new IoTIntegrationServiceImpl())
                .build();

        server.start();
        System.out.println("IoT Integration Service started at " + server.getPort());
        server.awaitTermination();
        
    }
    


    public static void main1(String[] args) throws IOException, InterruptedException {
        //Initialize the GRPC server 
        Server server = ServerBuilder.forPort(8082)
                .addService(new IoTIntegrationServiceImpl())
                .build();

        server.start();
        System.out.println("IoT Integration Service started at " + server.getPort());

        // Registrar o serviço com JmDNS usando a classe JmDNSManager
        JmDNSManager jmDNSManager = new JmDNSManager();
        jmDNSManager.registerService("IoTIntegrationService", 8082);

        server.awaitTermination();

        // Encerrar o serviço JmDNS ao parar o servidor
        jmDNSManager.close();
    }
}
