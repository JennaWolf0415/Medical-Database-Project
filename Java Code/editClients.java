//Name: Jenna Wolf
//Class: CS 440-740, Database
//Professor: CS 440-740, Database
//project: Medical Equipment Rental Database Project
//file: editClients.java
//purpose: panel used for adding, deleting, or changing rows in the clients table
package databaseproject;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class editClients extends javax.swing.JFrame {

    public editClients() {
        initComponents();
        setDefaultCloseOperation(clientLogIn.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        deleteEntry = new javax.swing.JButton();
        viewClientsTable = new javax.swing.JButton();
        addNewEntry = new javax.swing.JButton();
        changeEntryInfo = new javax.swing.JButton();
        nameData = new javax.swing.JTextField();
        addData = new javax.swing.JTextField();
        numData = new javax.swing.JTextField();
        CIDData = new javax.swing.JTextField();
        passData = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nameBox = new javax.swing.JCheckBox();
        phoneBox = new javax.swing.JCheckBox();
        addBox = new javax.swing.JCheckBox();
        passBox = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(235, 253, 235));
        jPanel2.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Sitka Banner", 1, 36)); // NOI18N
        jLabel2.setText("Edit Clients Table");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        deleteEntry.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        deleteEntry.setText("Delete entry");
        deleteEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEntryActionPerformed(evt);
            }
        });
        jPanel2.add(deleteEntry, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 200, 50));

        viewClientsTable.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        viewClientsTable.setText("View Current Clients Table");
        viewClientsTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewClientsTableActionPerformed(evt);
            }
        });
        jPanel2.add(viewClientsTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 260, 30));

        addNewEntry.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        addNewEntry.setText("Add new entry");
        addNewEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewEntryActionPerformed(evt);
            }
        });
        jPanel2.add(addNewEntry, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 200, 50));

        changeEntryInfo.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        changeEntryInfo.setText("Change entry information");
        changeEntryInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeEntryInfoActionPerformed(evt);
            }
        });
        jPanel2.add(changeEntryInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 240, 50));
        jPanel2.add(nameData, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 140, 40));
        jPanel2.add(addData, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 140, 40));
        jPanel2.add(numData, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 140, 40));

        CIDData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CIDDataActionPerformed(evt);
            }
        });
        jPanel2.add(CIDData, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 140, 40));
        jPanel2.add(passData, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 140, 40));

        jLabel4.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
        jLabel4.setText("Client ID:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        nameBox.setBackground(new java.awt.Color(235, 253, 235));
        nameBox.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
        nameBox.setText("Name:");
        jPanel2.add(nameBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        phoneBox.setBackground(new java.awt.Color(235, 253, 235));
        phoneBox.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
        phoneBox.setText("Phone Number:");
        phoneBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneBoxActionPerformed(evt);
            }
        });
        jPanel2.add(phoneBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, -1, -1));

        addBox.setBackground(new java.awt.Color(235, 253, 235));
        addBox.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
        addBox.setText("Address:");
        addBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBoxActionPerformed(evt);
            }
        });
        jPanel2.add(addBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        passBox.setBackground(new java.awt.Color(235, 253, 235));
        passBox.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
        passBox.setText("Password:");
        passBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passBoxActionPerformed(evt);
            }
        });
        jPanel2.add(passBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        jLabel5.setFont(new java.awt.Font("Sitka Banner", 1, 14)); // NOI18N
        jLabel5.setText("Boxes only need to be checked when you want to change");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, -1, 30));

        jLabel6.setFont(new java.awt.Font("Sitka Banner", 1, 14)); // NOI18N
        jLabel6.setText("that columns data property using the Change button!");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, -1, 20));

        jLabel3.setFont(new java.awt.Font("Sitka Banner", 1, 14)); // NOI18N
        jLabel3.setText("The only data you need filled in when deleting a row is equipment ID!");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void deleteEntryActionPerformed(java.awt.event.ActionEvent evt) {                                            
        try {
            String idTest = CIDData.getText();  //gets the data from the text box
            
            //makes sure the text box wasn't empty
            if(idTest == null || idTest.isEmpty()) {
                JOptionPane.showMessageDialog(null, "ERROR: You need to provide an client ID to delete an entry!");
                return;
            }
            
            //creates the id, checks to make sure the variable is a number.
            int id = 0;
            try {
                id = Integer.parseInt(idTest);
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "ERROR: You must provide a number for client id!");
                return;
            }
            
            //connects to the database and querys for the id value from the equipment table
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MedicalEquipment", "root","Love34#");
            String query = "SELECT client_id FROM clients;";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            //creates the match and current variables.
            //checks to see if there is an id that matches the inputed id value.
            boolean match = false;
            int current = 0;
            while(rs.next()) {
                current = rs.getInt("client_id");
                if(current == id) {
                    match = true;
                    break;
                }
            }   //if no match is found, an error message is output
            if(!match){
                JOptionPane.showMessageDialog(null, "ERROR: You need to enter an client ID that matches an entry!");
                return;
            }
            
            //creates and executes a query that deletes the row matching the id entered
            PreparedStatement pstmt = con.prepareStatement("DELETE FROM clients WHERE client_id = ?;");
            pstmt.setInt(1, id);
            int i = pstmt.executeUpdate();
            if(i > 0)
                JOptionPane.showMessageDialog(null, "Entry was deleted!");
            else
                JOptionPane.showMessageDialog(null, "Entry was not delted, please check your rows and try again!");
        }
        catch (Exception e) {
            //sends an error message to the consol if error occurs
            System.out.println("SQL select operation has been failed: " + e);
        }
    }                                           

    private void viewClientsTableActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        try {
            //connects to the database
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MedicalEquipment", "root","Love34#");
            
            //creates and executes a query that gets all information from the clients table.
            String query = "SELECT * FROM clients;";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            //creates a new jframe for the table
            JFrame courseWindow = new JFrame("Client Information");
            courseWindow.setSize(1000, 500);
            JPanel data = new JPanel(new BorderLayout());
            courseWindow.add(data);
            
            //creates a table within the jframe with 5 columns
            JTable table = new JTable();
            DefaultTableModel window = new DefaultTableModel();
            window.addColumn("Name");
            window.addColumn("Address");
            window.addColumn("Phone Number");
            window.addColumn("Client ID");
            window.addColumn("Password");
            
            //adds each entry as a row to the table.       
            while (rs.next()) {
                String name = rs.getString("name");
                String address = rs.getString("address");
                String phone = rs.getString("phone");
                int id = rs.getInt("client_ID");
                String pass = rs.getString("password");
                window.addRow(new Object[]{name, address, phone, id, pass});
            }
            
            //sets the table to the jframe window, adds the data and shows the client the table
            table.setModel(window);
            JScrollPane scrollPane = new JScrollPane(table);
            data.add(scrollPane, BorderLayout.CENTER);
            courseWindow.setVisible(true);
        }
        catch (Exception e) {
            //sends an error message to the consol if error occurs
            System.out.println("SQL select operation has been failed: " + e);
        }
    }                                                

    private void addNewEntryActionPerformed(java.awt.event.ActionEvent evt) {                                            
        try{
            //gets data from all the text boxes.
            String name = nameData.getText();
            String address = addData.getText();
            String phone = numData.getText();
            String idTest = CIDData.getText();
            String pass = passData.getText();
        
            //creates the con and pstmt variables
            Connection con = null;
            PreparedStatement pstmt = null;
        
            //makes sure every textbox has data
            if(name == null || name.isEmpty() || 
                    address == null || address.isEmpty() ||
                    phone == null || phone.isEmpty() ||
                    idTest == null || idTest.isEmpty() || 
                    pass == null || pass.isEmpty()) {
                JOptionPane.showMessageDialog(null, "ERROR: You need to provide data to all feilds!");
                return;
            }
            
            //creates the id variable, checks to make sure these variables are numbers.
            int id = 0;
            try {
                id = Integer.parseInt(idTest);
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "ERROR: You must provide a number for client id!");
                return;
            }
        //checks to make sure id is between 200 and 399
            if(id < 200 || id > 399) {
                JOptionPane.showMessageDialog(null, "ERROR: You need a number between 200 and 399 for a client id!");
                return;
            }
            
            //connects to the database and querys for the id value from the client table
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MedicalEquipment", "root","Love34#");
            String query = "SELECT client_id FROM clients;";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            //creates the match and current variables.
            //checks to see if there is an id that matches the inputed id value.
            boolean match = false;
            int current = 0;
            while(rs.next()) {
                current = rs.getInt("client_id");
                if(current == id) {
                    match = true;
                    break;
                }
            }   //if there is a match, an error message is shown
            if(match){
                JOptionPane.showMessageDialog(null, "ERROR: You need to enter a client ID that hasn't been used yet!");
                return;
            }
            
            //creates and executes a query that inserts the entered values into clients.
            pstmt = con.prepareStatement("insert into clients values (?,?,?,?,?);");
            pstmt.setString(1, name);
            pstmt.setString(2, address);
            pstmt.setString(3, phone);
            pstmt.setInt(4, id);
            pstmt.setString(5, pass);
            int i = pstmt.executeUpdate();
            if(i > 0)
                JOptionPane.showMessageDialog(null, "New client Was Added");
            else
                JOptionPane.showMessageDialog(null, "New client Was Not Added! check your data feilds!");
        }
        catch(Exception e){
            //sends an error message to the consol if error occurs
            JOptionPane.showMessageDialog(null, e);
        }
    }                                           

    private void changeEntryInfoActionPerformed(java.awt.event.ActionEvent evt) {                                                
        try {
            //gets data from all text boxes and check boxes
            boolean checkName = nameBox.isSelected();
            boolean checkAdd = addBox.isSelected();
            boolean checkPhone = phoneBox.isSelected();
            String idTest = CIDData.getText();
            boolean checkPass = passBox.isSelected();
        
            //makes sure the id text box has data
            if(idTest == null || idTest.isEmpty()) {
                JOptionPane.showMessageDialog(null, "ERROR: You need to provide an client ID!");
                return;
            }
        
            //creates the id, checks to make sure these variables are numbers.
            int id = 0;
            try {
                id = Integer.parseInt(idTest);
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "ERROR: You must provide a number for client id!");
                return;
            }
        
            //connects to the database and querys for the id value from the client table
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MedicalEquipment", "root","Love34#");
            String query = "SELECT client_id FROM clients;";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            //creates the match and current variables.
            //checks to see if there is an id that matches the inputed id value.
            boolean match = false;
            int current = 0;
            while(rs.next()) {
                current = rs.getInt("client_id");
                if(current == id) {
                    match = true;
                    break;
                }
            }   //if no match is found, an error message is output
            if(!match){
                JOptionPane.showMessageDialog(null, "ERROR: You need to enter a client ID that matches an entry!");
                return;
            }
            
            //creates the name variable, gets data from textbox, makes sure there is data in the text box.
            String name = null;
            if(checkName) {
                name = nameData.getText();
                if(name == null || name.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "ERROR: You need to provide an name since the box is checked!");
                    return;
                }
                
            }
        
            //creates the add variable, gets data from textbox, makes sure there is data in the text box.
            String add = null;
            if(checkAdd) {
                add = addData.getText();
                if(add == null || add.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "ERROR: You need to provide an address since the box is checked!");
                    return;
                }
            }
            
            //creates the phone variable, gets data from textbox, makes sure there is data in the text box.
            String phone = null;
            if(checkPhone) {
                phone = numData.getText();
                if(phone == null || phone.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "ERROR: You need to provide an phone number since the box is checked!");
                    return;
                }
            }
            
            //creates the pass variable, gets data from textbox, makes sure there is data in the text box.
            String pass = null;
            if(checkPass) {
                pass = passData.getText();
                if(pass == null || pass.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "ERROR: You need to provide an password since the box is checked!");
                    return;
                }
            }
        
            //if the box was selected, then it updates the name of the row matching the id number
            if(checkName) {
                PreparedStatement pstmt = con.prepareStatement("UPDATE clients SET name = ? WHERE client_id = ?;");
                pstmt.setString(1, name);
                pstmt.setInt(2, id);
                int i = pstmt.executeUpdate();
                if(i > 0)
                    JOptionPane.showMessageDialog(null, "Entry name was changed!");
                else
                    JOptionPane.showMessageDialog(null, "Entry name was not changed, please check your data and try again!");
            }
            
            //if the box was selected, then it updates the address of the row matching the id number
            if(checkAdd) {
                PreparedStatement pstmt = con.prepareStatement("UPDATE clients SET address = ? WHERE client_id = ?;");
                pstmt.setString(1, add);
                pstmt.setInt(2, id);
                int i = pstmt.executeUpdate();
                if(i > 0)
                    JOptionPane.showMessageDialog(null, "Entry address was changed!");
                else
                    JOptionPane.showMessageDialog(null, "Entry address was not changed, please check your data and try again!");
            }
            
            //if the box was selected, then it updates the phone of the row matching the id number
            if(checkPhone) {
                PreparedStatement pstmt = con.prepareStatement("UPDATE clients SET phone = ? WHERE client_id = ?;");
                pstmt.setString(1, phone);
                pstmt.setInt(2, id);
                int i = pstmt.executeUpdate();
                if(i > 0)
                    JOptionPane.showMessageDialog(null, "Entry phone number was changed!");
                else
                    JOptionPane.showMessageDialog(null, "Entry phone number was not changed, please check your data and try again!");
            }
            
            //if the box was selected, then it updates the password of the row matching the id number
            if(checkPass) {
                PreparedStatement pstmt = con.prepareStatement("UPDATE clients SET password = ? WHERE client_id = ?;");
                pstmt.setString(1, pass);
                pstmt.setInt(2, id);
                int i = pstmt.executeUpdate();
                if(i > 0)
                    JOptionPane.showMessageDialog(null, "Entry password was changed!");
                else
                    JOptionPane.showMessageDialog(null, "Entry password was not changed, please check your data and try again!");
            }
            
        }
        catch(Exception e){
            //sends an error message to the consol if error occurs
            JOptionPane.showMessageDialog(null, e);
        }
    }                                               

    private void CIDDataActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void phoneBoxActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void addBoxActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void passBoxActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editClients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField CIDData;
    private javax.swing.JCheckBox addBox;
    private javax.swing.JTextField addData;
    private javax.swing.JButton addNewEntry;
    private javax.swing.JButton changeEntryInfo;
    private javax.swing.JButton deleteEntry;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JCheckBox nameBox;
    private javax.swing.JTextField nameData;
    private javax.swing.JTextField numData;
    private javax.swing.JCheckBox passBox;
    private javax.swing.JTextField passData;
    private javax.swing.JCheckBox phoneBox;
    private javax.swing.JButton viewClientsTable;
    // End of variables declaration                   
}
