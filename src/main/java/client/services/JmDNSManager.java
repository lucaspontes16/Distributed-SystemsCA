package client.services;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.io.IOException;
import java.net.InetAddress;

public class JmDNSManager {

    private JmDNS jmdns;

    // Service register method
    public void registerService(String serviceName, int port) throws IOException {
        jmdns = JmDNS.create(InetAddress.getLocalHost());
        ServiceInfo serviceInfo = ServiceInfo.create("_grpc._tcp.local.", serviceName, port, "gRPC service");
        jmdns.registerService(serviceInfo);
        System.out.println(serviceName + " registered with JmDNS at port " + port);
    }

    // Método para descobrir o serviço
    public ServiceInfo discoverService(String serviceName) throws IOException {
        jmdns = JmDNS.create(InetAddress.getLocalHost());
        ServiceInfo serviceInfo = jmdns.getServiceInfo("_grpc._tcp.local.", serviceName);
        if (serviceInfo != null) {
            System.out.println(serviceName + " found: " + serviceInfo.getHostAddresses()[0] + ":" + serviceInfo.getPort());
        } else {
            System.out.println(serviceName + " not found.");
        }
        return serviceInfo;
    }

    // Método para encerrar o JmDNS
    public void close() throws IOException {
        if (jmdns != null) {
            jmdns.unregisterAllServices();
            jmdns.close();
        }
    }
}