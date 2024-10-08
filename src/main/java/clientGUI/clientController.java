/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clientGUI;

import com.example.usermanager.PermissionCheckRequest;
import com.example.usermanager.PermissionCheckResponse;
import com.example.usermanager.UserManagerServiceGrpc;

import client.services.JmDNSManager;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.io.IOException;
import javax.jmdns.ServiceInfo;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class clientController extends javax.swing.JFrame {

	private ManagedChannel channel;
    private UserManagerServiceGrpc.UserManagerServiceBlockingStub stub;
    
    public clientController() {
        initComponents();
        initGrpcClient(); // Initialize gRPC client
    }

    private void initGrpcClient() {
        try {
            JmDNSManager jmDNSManager = new JmDNSManager();
            ServiceInfo serviceInfo = jmDNSManager.discoverService("UserManagerService");

            if (serviceInfo != null) {
                channel = ManagedChannelBuilder.forAddress(serviceInfo.getHostAddresses()[0], serviceInfo.getPort())
                        .usePlaintext()
                        .build();

                stub = UserManagerServiceGrpc.newBlockingStub(channel);
            } else {
                responseLabel.append("Service not found.\n");
            }
        } catch (IOException e) {
            responseLabel.append("Error discovering service with JmDNS: " + e.getMessage() + "\n");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        username = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        password = new javax.swing.JLabel();
        passwordField = new javax.swing.JTextField();
        authenticateButton = new javax.swing.JButton();
        permissionCheckButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        responseLabel = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        username.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        username.setText("Username");

        password.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        password.setText("Password");

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });

        authenticateButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        authenticateButton.setText("Authenticate");

        permissionCheckButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        permissionCheckButton.setText("Permission check");

        responseLabel.setColumns(20);
        responseLabel.setRows(5);
        jScrollPane1.setViewportView(responseLabel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username)
                    .addComponent(password)
                    .addComponent(authenticateButton)
                    .addComponent(permissionCheckButton)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(username)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(authenticateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(permissionCheckButton)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //GEN-LAST:event_passwordFieldActionPerformed

    private void permissionCheckActionPerformed(java.awt.event.ActionEvent evt) {
        String username = usernameField.getText();
        
        if (stub == null) {
            JOptionPane.showMessageDialog(this, "gRPC client not initialized.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        PermissionCheckRequest permRequest = PermissionCheckRequest.newBuilder()
                .setUserName(username)
                .setResource("read")
                .build();

        PermissionCheckResponse permResponse = stub.permissionCheck(permRequest);
        responseLabel.append("Permission Check: " + permResponse.getMessage() + "\n");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    	java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new clientController().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton authenticateButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel password;
    private javax.swing.JTextField passwordField;
    private javax.swing.JButton permissionCheckButton;
    private javax.swing.JTextArea responseLabel;
    private javax.swing.JLabel username;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
