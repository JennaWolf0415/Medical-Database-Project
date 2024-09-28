//Name: Jenna Wolf
//Class: CS 440-740, Database
//Professor: CS 440-740, Database
//project: Medical Equipment Rental Database Project
//file: clientLogIn.java
//purpose: panel used for clients to log into so they can make orders

package databaseproject;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class clientLogIn extends javax.swing.JFrame {
    
    public clientLogIn() {
        initComponents();
        setDefaultCloseOperation(clientLogIn.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        clientIdBox = new javax.swing.JTextField();
        passwordBox = new javax.swing.JTextField();
        goBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        loginButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(253, 227, 227));
        jPanel2.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        jLabel1.setText("Password:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));
        jPanel2.add(clientIdBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 61, 161, -1));
        jPanel2.add(passwordBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 101, 161, -1));

        goBack.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        goBack.setText("Go Back");
        goBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackActionPerformed(evt);
            }
        });
        jPanel2.add(goBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Sitka Display", 0, 24)); // NOI18N
        jLabel2.setText("Client Log In:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 18, -1, -1));

        jLabel3.setFont(new java.awt.Font("Sitka Display", 0, 18)); // NOI18N
        jLabel3.setText("Client ID:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        loginButton1.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        loginButton1.setText("Log In");
        loginButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(loginButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 135, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void goBackActionPerformed(java.awt.event.ActionEvent evt) {                                       
        new LoginInterface().setVisible(true);
        dispose();
    }                                      

    private void loginButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        try {
            //takes info from text boxes
            String idNumTest = clientIdBox.getText();  
            String password = passwordBox.getText();
            
            //makes sure text boxes had data, if not error message is displayed
            if(idNumTest == null || idNumTest.isEmpty() || password == null || password.isEmpty()) {
                JOptionPane.showMessageDialog(null, "ERROR: You need to provide an ID number and password!");
                return;
            }
            
            //makes sure a number is entered for the client id, if not error message is displayed
            int idNum = 0;
            try {
                idNum = Integer.parseInt(idNumTest);
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "ERROR: You must provide a number for client id!");
                return;
            }
            
            //connects to the database
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MedicalEquipment", "root","Love34#");
            
            //creates ad executes a query to check and see if client id and password match a client entry
            String query = "SELECT * FROM Clients WHERE client_id = ? AND password = ?;";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, idNum);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            
            //if the client id and password match, the clientPage panel starts and this panel is closed.
            //if not, an error message is displayed
            if(rs.next()) {
                new clientPage(idNum).setVisible(true);
                dispose();
            }
            else {
                 JOptionPane.showMessageDialog(null, "Error: The wrong username or password was entered.");
            }
        }
        catch (Exception e) {
            //sends an error message to the consol if error occurs
            System.out.println("SQL select operation has been failed: " + e);
        }
    }                                            


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new clientLogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField clientIdBox;
    private javax.swing.JButton goBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginButton1;
    private javax.swing.JTextField passwordBox;
    // End of variables declaration                   
}
