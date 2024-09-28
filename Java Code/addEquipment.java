//Name: Jenna Wolf
//Class: CS 440-740, Database
//Professor: CS 440-740, Database
//project: Medical Equipment Rental Database Project
//file: addEquipment.java
//purpose: panel used for managers to add a new piece of equipment to the database
package databaseproject;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class addEquipment extends javax.swing.JFrame {

    public addEquipment() {
        initComponents();
        setDefaultCloseOperation(clientLogIn.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        quanData = new javax.swing.JTextField();
        nameData = new javax.swing.JTextField();
        IDData = new javax.swing.JTextField();
        manData = new javax.swing.JTextField();
        descriptData = new javax.swing.JTextField();
        rentData = new javax.swing.JTextField();
        addEquipment = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(235, 253, 235));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
        jLabel1.setText("Add a New Piece of Equipment");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));
        jPanel1.add(quanData, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 100, 30));
        jPanel1.add(nameData, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 100, 30));

        IDData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDDataActionPerformed(evt);
            }
        });
        jPanel1.add(IDData, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 100, 30));
        jPanel1.add(manData, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 100, 30));
        jPanel1.add(descriptData, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 100, 30));
        jPanel1.add(rentData, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 100, 30));

        addEquipment.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addEquipment.setText("Add new piece of equipment");
        addEquipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEquipmentActionPerformed(evt);
            }
        });
        jPanel1.add(addEquipment, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jLabel2.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        jLabel2.setText("Quantity:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        jLabel3.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        jLabel3.setText("Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        jLabel4.setText("ID:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        jLabel5.setText("Manufacturer:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        jLabel6.setText("Description:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        jLabel7.setText("Rent Price:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void IDDataActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void addEquipmentActionPerformed(java.awt.event.ActionEvent evt) {                                             
        try{
            //gets data from all the text boxes.
            String name = nameData.getText();
            String idTest = IDData.getText();
            String man = manData.getText();
            String descript = descriptData.getText();
            String rentPriceTest = rentData.getText();
            String quanTest = quanData.getText();
        
        
            //creates the con and pstmt variables
            Connection con = null;
            PreparedStatement pstmt = null;
        
            //makes sure every textbox has data
            if(name == null || name.isEmpty() || 
                    idTest == null || idTest.isEmpty() || 
                    man == null || man.isEmpty() ||
                    descript == null || descript.isEmpty() ||
                    rentPriceTest == null || rentPriceTest.isEmpty() ||
                    quanTest == null || quanTest.isEmpty()) {
                JOptionPane.showMessageDialog(null, "ERROR: You need to provide data to all feilds!");
                return;
            }
            
            //creates the id, rentprice, and quan variables.
            //checks to make sure these variables are numbers.
            int id = 0;
            double rentPrice = 0;
            int quan = 0;
            try {
                id = Integer.parseInt(idTest);
                rentPrice = Double.parseDouble(rentPriceTest);
                quan = Integer.parseInt(quanTest);
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "ERROR: You must provide a number for id/rentPrice/quantity!");
                return;
            }
        
            //checks to make sure id is between 100 and 999
            if(id < 100 || id > 999) {
                JOptionPane.showMessageDialog(null, "ERROR: You need a number between 100 and 999 for a equipment id!");
                return;
            }
        
            //checks to make sure rentPrice is greater than 0
            if(rentPrice < 0) {
                JOptionPane.showMessageDialog(null, "ERROR: You need a positive number for your rentPrice!");
                return;
            }
        
            //checks to make sure quan is greater than 0
            if(quan < 1) {
                JOptionPane.showMessageDialog(null, "ERROR: You need a positive number greater than 1 for your quantity!");
                return;
            }
            
            //connects to the database and querys for the id value from the equipment table
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MedicalEquipment", "root","Love34#");
            String query = "SELECT id FROM equipment;";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            //creates the equipMatch and currentEquip variables.
            //checks to see if there is an id that matches the inputed id value.
            boolean equipMatch = false;
            int currentEquip = 0;
            while(rs.next()) {
                currentEquip = rs.getInt("id");
                if(currentEquip == id) {
                    equipMatch = true;
                    break;
                }
            }   //if there is a match, and error message is shown
            if(equipMatch){
                JOptionPane.showMessageDialog(null, "ERROR: You need to enter a equipment ID that hasn't been used yet!");
                return;
            }
            
            //creates and executes a query that inserts the entered values into equipment.
            pstmt = con.prepareStatement("insert into equipment values (?,?,?,?,?,?)");
            pstmt.setString(1, name);
            pstmt.setInt(2, id);
            pstmt.setString(3, man);
            pstmt.setString(4, descript);
            pstmt.setDouble(5, rentPrice);
            pstmt.setInt(6, quan);
            int i = pstmt.executeUpdate();
            if(i > 0)
                JOptionPane.showMessageDialog(null, "New Equipment Was Added");
            else
                JOptionPane.showMessageDialog(null, "New Equipment Was Not Added! check your data feilds!");
        }
        catch(Exception e){
            //sends an error message to the consol if error occurs
            JOptionPane.showMessageDialog(null, e);
        }
    }                                            

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addEquipment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField IDData;
    private javax.swing.JButton addEquipment;
    private javax.swing.JTextField descriptData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField manData;
    private javax.swing.JTextField nameData;
    private javax.swing.JTextField quanData;
    private javax.swing.JTextField rentData;
    // End of variables declaration                   
}
