//Name: Jenna Wolf
//Class: CS 440-740, Database
//Professor: CS 440-740, Database
//project: Medical Equipment Rental Database Project
//file: editSuppliers.java
//purpose: panel used for adding, deleting, or changing rows in the suppliers table
package databaseproject;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class editSuppliers extends javax.swing.JFrame {

    public editSuppliers() {
        initComponents();
        setDefaultCloseOperation(clientLogIn.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        deleteEntry = new javax.swing.JButton();
        viewSupplierTable = new javax.swing.JButton();
        addNewEntry = new javax.swing.JButton();
        changeEntryInfo = new javax.swing.JButton();
        SIDData = new javax.swing.JTextField();
        nameData = new javax.swing.JTextField();
        addData = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nameBox = new javax.swing.JCheckBox();
        addBox = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(235, 253, 235));
        jPanel2.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Sitka Banner", 1, 36)); // NOI18N
        jLabel2.setText("Edit Supplier Table");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        deleteEntry.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        deleteEntry.setText("Delete entry");
        deleteEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEntryActionPerformed(evt);
            }
        });
        jPanel2.add(deleteEntry, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 200, 50));

        viewSupplierTable.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        viewSupplierTable.setText("View Current Supplier Table");
        viewSupplierTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewSupplierTableActionPerformed(evt);
            }
        });
        jPanel2.add(viewSupplierTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 260, 30));

        addNewEntry.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        addNewEntry.setText("Add new entry");
        addNewEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewEntryActionPerformed(evt);
            }
        });
        jPanel2.add(addNewEntry, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 200, 50));

        changeEntryInfo.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        changeEntryInfo.setText("Change entry information");
        changeEntryInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeEntryInfoActionPerformed(evt);
            }
        });
        jPanel2.add(changeEntryInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 240, 50));
        jPanel2.add(SIDData, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 140, 40));
        jPanel2.add(nameData, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 140, 40));
        jPanel2.add(addData, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 140, 40));

        jLabel4.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
        jLabel4.setText("Supplier ID:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        nameBox.setBackground(new java.awt.Color(235, 253, 235));
        nameBox.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
        nameBox.setText("Name:");
        jPanel2.add(nameBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        addBox.setBackground(new java.awt.Color(235, 253, 235));
        addBox.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
        addBox.setText("Address:");
        addBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBoxActionPerformed(evt);
            }
        });
        jPanel2.add(addBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Sitka Banner", 1, 14)); // NOI18N
        jLabel5.setText("Boxes only need to be checked when you want to change");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, 30));

        jLabel6.setFont(new java.awt.Font("Sitka Banner", 1, 14)); // NOI18N
        jLabel6.setText("that columns data property using the Change button!");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, 20));

        jLabel3.setFont(new java.awt.Font("Sitka Banner", 1, 14)); // NOI18N
        jLabel3.setText("The only data you need filled in when deleting a row is equipment ID!");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void deleteEntryActionPerformed(java.awt.event.ActionEvent evt) {                                            
        try {
            String idTest = SIDData.getText();  //gets the data from the text box
            
            //makes sure the text box wasn't empty
            if(idTest == null || idTest.isEmpty()) {
                JOptionPane.showMessageDialog(null, "ERROR: You need to provide an supplier ID to delete an entry!");
                return;
            }
            
            //creates the id, checks to make sure the variable is a number.
            int id = 0;
            try {
                id = Integer.parseInt(idTest);
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "ERROR: You must provide a number for supplier id!");
                return;
            }
            
            //connects to the database and querys for the id value from the equipment table
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MedicalEquipment", "root","Love34#");
            String query = "SELECT sup_id FROM suppliers;";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            //creates the supMatch and currentSup variables.
            //checks to see if there is an id that matches the inputed id value.
            boolean supMatch = false;
            int currentSup = 0;
            while(rs.next()) {
                currentSup = rs.getInt("sup_id");
                if(currentSup == id) {
                    supMatch = true;
                    break;
                }
            }   //if no match is found, an error message is output
            if(!supMatch){
                JOptionPane.showMessageDialog(null, "ERROR: You need to enter an supplier ID that matches an entry!");
                return;
            }
            
            //creates and executes a query that deletes the row matching the id entered
            PreparedStatement pstmt = con.prepareStatement("DELETE FROM suppliers WHERE sup_id = ?;");
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

    private void viewSupplierTableActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        try {
            //connects to the database
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MedicalEquipment", "root","Love34#");
            
            //creates and executes a query that gets all information from the equipment table.
            String query = "SELECT * FROM suppliers;";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            //creates a new jframe for the table
            JFrame courseWindow = new JFrame("Suppliers Table");
            courseWindow.setSize(1000, 500);
            JPanel data = new JPanel(new BorderLayout());
            courseWindow.add(data);
            
            //creates a table within the jframe with 3 columns
            JTable table = new JTable();
            DefaultTableModel window = new DefaultTableModel();
            window.addColumn("Supplier ID");
            window.addColumn("Name");
            window.addColumn("Address");
            
                 
            //adds each entry as a row to the table.
            while (rs.next()) {
                int id = rs.getInt("sup_id");
                String name = rs.getString("name");
                String add = rs.getString("address");
                window.addRow(new Object[]{id, name, add});
            }
            
            //adds each entry as a row to the table.
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
            String idTest = SIDData.getText();
            String name = nameData.getText();
            String address = addData.getText();
        
            //creates the con and pstmt variables
            Connection con = null;
            PreparedStatement pstmt = null;
        
            //makes sure every textbox has data
            if(name == null || name.isEmpty() || 
                    idTest == null || idTest.isEmpty() || 
                    address == null || address.isEmpty()) {
                JOptionPane.showMessageDialog(null, "ERROR: You need to provide data to all feilds!");
                return;
            }
            
            //creates the id variable, checks to make sure these variables are numbers.
            int id = 0;
            try {
                id = Integer.parseInt(idTest);
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "ERROR: You must provide a number for supplier id!");
                return;
            }
        
            //checks to make sure id is between 1000 and 1999
            if(id < 1000 || id > 1999) {
                JOptionPane.showMessageDialog(null, "ERROR: You need a number between 1000 and 1999 for a supplier id!");
                return;
            }
            
            //connects to the database and querys for the id value from the suppliers table
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MedicalEquipment", "root","Love34#");
            String query = "SELECT sup_id FROM suppliers;";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            //creates the supMatch and currentSup variables.
            //checks to see if there is an id that matches the inputed id value.
            boolean supMatch = false;
            int currentSup = 0;
            while(rs.next()) {
                currentSup = rs.getInt("sup_id");
                if(currentSup == id) {
                    supMatch = true;
                    break;
                }
            }   //if there is a match, an error message is shown
            if(supMatch){
                JOptionPane.showMessageDialog(null, "ERROR: You need to enter a supplier ID that hasn't been used yet!");
                return;
            }
            
            //creates and executes a query that inserts the entered values into suppliers.
            pstmt = con.prepareStatement("insert into suppliers values (?,?,?);");
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setString(3, address);
            int i = pstmt.executeUpdate();
            if(i > 0)
                JOptionPane.showMessageDialog(null, "New Supplier Was Added");
            else
                JOptionPane.showMessageDialog(null, "New Supplier Was Not Added! check your data feilds!");
        }
        catch(Exception e){
            //sends an error message to the consol if error occurs
            JOptionPane.showMessageDialog(null, e);
        }

    }                                           

    private void changeEntryInfoActionPerformed(java.awt.event.ActionEvent evt) {                                                
        try {
            //gets data from all text boxes and check boxes
            String idTest = SIDData.getText();
            boolean checkName = nameBox.isSelected();
            boolean checkAdd = addBox.isSelected();
        
            //makes sure the id text box has data
            if(idTest == null || idTest.isEmpty()) {
                JOptionPane.showMessageDialog(null, "ERROR: You need to provide an supplier ID!");
                return;
            }
        
            //makes sure the id text box has data
            int id = 0;
            try {
                id = Integer.parseInt(idTest);
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "ERROR: You must provide a number for id!");
                return;
            }
        
            //connects to the database and querys for the id value from the equipment table
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MedicalEquipment", "root","Love34#");
            String query = "SELECT sup_id FROM suppliers;";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            //creates the supMatch and currentSup variables.
            //checks to see if there is an id that matches the inputed id value.
            boolean supMatch = false;
            int currentSup = 0;
            while(rs.next()) {
                currentSup = rs.getInt("sup_id");
                if(currentSup == id) {
                    supMatch = true;
                    break;
                }
            }   //if no match is found, an error message is output
            if(!supMatch){
                JOptionPane.showMessageDialog(null, "ERROR: You need to enter an supplier ID that matches an entry!");
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
        
            //if the box was selected, then it updates the name of the row matching the id number
            if(checkName) {
                PreparedStatement pstmt = con.prepareStatement("UPDATE suppliers SET name = ? WHERE sup_id = ?;");
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
                PreparedStatement pstmt = con.prepareStatement("UPDATE suppliers SET address = ? WHERE sup_id = ?;");
                pstmt.setString(1, add);
                pstmt.setInt(2, id);
                int i = pstmt.executeUpdate();
                if(i > 0)
                    JOptionPane.showMessageDialog(null, "Entry address was changed!");
                else
                    JOptionPane.showMessageDialog(null, "Entry address was not changed, please check your data and try again!");
            }
            
        }
        catch(Exception e){
            //sends an error message to the consol if error occurs
            JOptionPane.showMessageDialog(null, e);
        }
    }                                               

    private void addBoxActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editSuppliers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField SIDData;
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
    private javax.swing.JButton viewSupplierTable;
    // End of variables declaration                   
}
