//Name: Jenna Wolf
//Class: CS 440-740, Database
//Professor: CS 440-740, Database
//project: Medical Equipment Rental Database Project
//file: editStock.java
//purpose: panel used for adding, deleting, or changing rows in the stock table
package databaseproject;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class editStock extends javax.swing.JFrame {

    public editStock() {
        initComponents();
        setDefaultCloseOperation(clientLogIn.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        deleteEntry = new javax.swing.JButton();
        ViewEquipmentIDS = new javax.swing.JButton();
        addNewEntry = new javax.swing.JButton();
        changeEntryInfo = new javax.swing.JButton();
        StockIDData = new javax.swing.JTextField();
        SIDData = new javax.swing.JTextField();
        EIDData = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        SIDBOX = new javax.swing.JCheckBox();
        EIDBox = new javax.swing.JCheckBox();
        viewStockTable = new javax.swing.JButton();
        viewSupplierIDS = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(235, 253, 235));
        jPanel2.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Sitka Banner", 1, 36)); // NOI18N
        jLabel2.setText("Edit Stock Table");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        deleteEntry.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        deleteEntry.setText("Delete entry");
        deleteEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEntryActionPerformed(evt);
            }
        });
        jPanel2.add(deleteEntry, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 200, 50));

        ViewEquipmentIDS.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        ViewEquipmentIDS.setText("View Equipment ID's");
        ViewEquipmentIDS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewEquipmentIDSActionPerformed(evt);
            }
        });
        jPanel2.add(ViewEquipmentIDS, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 260, 30));

        addNewEntry.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        addNewEntry.setText("Add new entry");
        addNewEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewEntryActionPerformed(evt);
            }
        });
        jPanel2.add(addNewEntry, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 200, 50));

        changeEntryInfo.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        changeEntryInfo.setText("Change entry information");
        changeEntryInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeEntryInfoActionPerformed(evt);
            }
        });
        jPanel2.add(changeEntryInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 240, 50));
        jPanel2.add(StockIDData, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 140, 40));
        jPanel2.add(SIDData, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 140, 40));
        jPanel2.add(EIDData, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 140, 40));

        jLabel4.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
        jLabel4.setText("Stock ID:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        SIDBOX.setBackground(new java.awt.Color(235, 253, 235));
        SIDBOX.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
        SIDBOX.setText("Supplier ID:");
        jPanel2.add(SIDBOX, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        EIDBox.setBackground(new java.awt.Color(235, 253, 235));
        EIDBox.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
        EIDBox.setText("Equipment ID:");
        EIDBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EIDBoxActionPerformed(evt);
            }
        });
        jPanel2.add(EIDBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        viewStockTable.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        viewStockTable.setText("View Current Stock Table");
        viewStockTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewStockTableActionPerformed(evt);
            }
        });
        jPanel2.add(viewStockTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 260, 30));

        viewSupplierIDS.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        viewSupplierIDS.setText("View Supplier ID's");
        viewSupplierIDS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewSupplierIDSActionPerformed(evt);
            }
        });
        jPanel2.add(viewSupplierIDS, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 260, 30));

        jLabel5.setFont(new java.awt.Font("Sitka Banner", 1, 14)); // NOI18N
        jLabel5.setText("Boxes only need to be checked when you want to change");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, -1, 30));

        jLabel6.setFont(new java.awt.Font("Sitka Banner", 1, 14)); // NOI18N
        jLabel6.setText("that columns data property using the Change button!");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, -1, 20));

        jLabel3.setFont(new java.awt.Font("Sitka Banner", 1, 14)); // NOI18N
        jLabel3.setText("The only data you need filled in when deleting a row is equipment ID!");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void deleteEntryActionPerformed(java.awt.event.ActionEvent evt) {                                            
        try {
            String idTest = StockIDData.getText();  //gets the data from the text box
            
            //makes sure the text box wasn't empty
            if(idTest == null || idTest.isEmpty()) {
                JOptionPane.showMessageDialog(null, "ERROR: You need to provide an stock ID to delete an entry!");
                return;
            }
            
            //creates the id, checks to make sure the variable is a number.
            int id = 0;
            try {
                id = Integer.parseInt(idTest);
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "ERROR: You must provide a number for stock id!");
                return;
            }
            
            //connects to the database and querys for the id value from the stock table
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MedicalEquipment", "root","Love34#");
            String query = "SELECT stock_id FROM stock;";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            //creates the match and current variables.
            //checks to see if there is an id that matches the inputed id value.
            boolean match = false;
            int current = 0;
            while(rs.next()) {
                current = rs.getInt("stock_id");
                if(current == id) {
                    match = true;
                    break;
                }
            }   //if no match is found, an error message is output
            if(!match){
                JOptionPane.showMessageDialog(null, "ERROR: You need to enter an stock ID that matches an entry!");
                return;
            }
            
            //creates and executes a query that deletes the row matching the id entered
            PreparedStatement pstmt = con.prepareStatement("DELETE FROM stock WHERE stock_id = ?;");
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

    private void ViewEquipmentIDSActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        try {
            //connects to the database
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MedicalEquipment", "root","Love34#");
            
            //creates and executes a query that gets the id and name from the equipment table.
            String query = "SELECT id, name FROM equipment;";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            //creates a new jframe for the table
            JFrame courseWindow = new JFrame("Equipment ID Table");
            courseWindow.setSize(1000, 500);
            JPanel data = new JPanel(new BorderLayout());
            courseWindow.add(data);
            
            //creates a table within the jframe with 2 columns
            JTable table = new JTable();
            DefaultTableModel window = new DefaultTableModel();
            window.addColumn("Equipment ID");
            window.addColumn("Name");

            //adds each entry as a row to the table.     
            while (rs.next()) {
                int eID = rs.getInt("id");
                String name = rs.getString("name");
                window.addRow(new Object[]{eID, name});
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
            String idTest = StockIDData.getText();
            String sidTest = SIDData.getText();
            String eidTest = EIDData.getText();
        
            //creates the con and pstmt variables
            Connection con = null;
            PreparedStatement pstmt = null;
        
            //makes sure every textbox has data
            if(idTest == null || idTest.isEmpty() || 
                    sidTest == null || sidTest.isEmpty() || 
                    eidTest == null || eidTest.isEmpty()) {
                JOptionPane.showMessageDialog(null, "ERROR: You need to provide data to all feilds!");
                return;
            }
            
            //creates the id, sid, and eid variables.
            //checks to make sure these variables are numbers.
            int id = 0;
            int sid = 0;
            int eid = 0;
            try {
                id = Integer.parseInt(idTest);
                sid = Integer.parseInt(sidTest);
                eid = Integer.parseInt(eidTest);
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "ERROR: You must provide a number for stock id/supplier id/ equipment id!");
                return;
            }
        
            //checks to make sure id is between 399 and 1000
            if(id < 399 || id > 1000) {
                JOptionPane.showMessageDialog(null, "ERROR: You need a number between 399 and 1000 for a stock id!");
                return;
            }
            
            //checks to make sure sid is between 1000 and 1999
            if(sid < 1000 || sid > 1999) {
                JOptionPane.showMessageDialog(null, "ERROR: You need a number between 1000 and 1999 for a supplier id!");
                return;
            }
            
            //checks to make sure id is between 100 and 999
            if(eid < 100 || eid > 999) {
                JOptionPane.showMessageDialog(null, "ERROR: You need a number between 100 and 999 for a equipment id!");
                return;
            }
            
            //connects to the database and querys for the stock_id value from the stock table
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MedicalEquipment", "root","Love34#");
            String query = "SELECT stock_id FROM stock;";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            //creates the match and current variables.
            //checks to see if there is an id that matches the inputed id value.
            boolean match = false;
            int current = 0;
            while(rs.next()) {
                current = rs.getInt("stock_id");
                if(current == id) {
                    match = true;
                    break;
                }
            }   //if there is a match, an error message is shown
            if(match){
                JOptionPane.showMessageDialog(null, "ERROR: You need to enter a stock ID that hasn't been used yet!");
                return;
            }
            
            //querys for the sup_id value from the stock table
            query = "SELECT sup_id FROM suppliers;";
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            
            //resets match and current, checks to see if there is an id that matches the inputed id value.
            match = false;
            current = 0;
            while(rs.next()) {
                current = rs.getInt("sup_id");
                if(current == sid) {
                    match = true;
                    break;
                }
            }   //if there is a match, an error message is shown
            if(!match){
                JOptionPane.showMessageDialog(null, "ERROR: You need to enter a supplier ID that matches an entry!");
                return;
            }
            
            //querys for the equip_id value from the stock table
            query = "SELECT id FROM equipment;";
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            
            //resets match and current, checks to see if there is an id that matches the inputed id value.
            match = false;
            current = 0;
            while(rs.next()) {
                current = rs.getInt("id");
                if(current == eid) {
                    match = true;
                    break;
                }
            }   //if there is a match, an error message is shown
            if(!match){
                JOptionPane.showMessageDialog(null, "ERROR: You need to enter an equipment ID that matches an entry!");
                return;
            }
            
            //creates and executes a query that inserts the entered values into stock.
            pstmt = con.prepareStatement("insert into stock values (?,?,?);");
            pstmt.setInt(1, id);
            pstmt.setInt(2, sid);
            pstmt.setInt(3, eid);
            int i = pstmt.executeUpdate();
            if(i > 0)
                JOptionPane.showMessageDialog(null, "New Stock Was Added");
            else
                JOptionPane.showMessageDialog(null, "New Stock Was Not Added! check your data feilds!");
        }
        catch(Exception e){
            //sends an error message to the consol if error occurs
            JOptionPane.showMessageDialog(null, e);
        }
    }                                           

    private void changeEntryInfoActionPerformed(java.awt.event.ActionEvent evt) {                                                
        try {
            //gets data from all text boxes and check boxes
            String idTest = StockIDData.getText();
            boolean checkSID = SIDBOX.isSelected();
            boolean checkEID = EIDBox.isSelected();
            
            //makes sure the id text box has data
            if(idTest == null || idTest.isEmpty()) {
                JOptionPane.showMessageDialog(null, "ERROR: You need to provide an stock ID!");
                return;
            }
        
            //creates the id, checks to make sure these variables are numbers.
            int id = 0;
            try {
                id = Integer.parseInt(idTest);
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "ERROR: You must provide a number for stock id!");
                return;
            }
            
            //connects to the database and querys for the id value from the stock table
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MedicalEquipment", "root","Love34#");
            String query = "SELECT stock_id FROM stock;";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            //creates the match and current variables.
            //checks to see if there is an id that matches the inputed id value.
            boolean match = false;
            int current = 0;
            while(rs.next()) {
                current = rs.getInt("stock_id");
                if(current == id) {
                    match = true;
                    break;
                }
            }   //if no match is found, an error message is output
            if(!match){
                JOptionPane.showMessageDialog(null, "ERROR: You need to enter an stock ID that matches an entry!");
                return;
            }
            
            //creates the SID variable, gets data from textbox, makes sure there is data in the text box,
            //makes sure the data is a number, makes sure the id matches one in the table
            int SID = 0;
            if(checkSID) {
                String SIDtest = SIDData.getText();
                if(SIDtest == null || SIDtest.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "ERROR: You need to provide an supplier ID since the box is checked!");
                    return;
                }
                try {
                    SID = Integer.parseInt(SIDtest);
                }
                catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "ERROR: You must provide a number for supplier ID!");
                    return;
                }
                
                query = "SELECT sup_id FROM suppliers;";
                stmt = con.createStatement();
                rs = stmt.executeQuery(query);
            
                match = false;
                current = 0;
                while(rs.next()) {
                    current = rs.getInt("sup_id");
                    if(current == SID) {
                        match = true;
                        break;
                    }
                }
                if(!match){
                    JOptionPane.showMessageDialog(null, "ERROR: You need to enter a supplier ID that matches an entry!");
                    return;
                }
            }
                
            
            //creates the EID variable, gets data from textbox, makes sure there is data in the text box,
            //makes sure the data is a number, makes sure the id matches one in the table
            int EID = 0;
            if(checkEID) {
                String EIDtest = EIDData.getText();
                if(EIDtest == null || EIDtest.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "ERROR: You need to provide an equipment ID since the box is checked!");
                    return;
                }
                try {
                    EID = Integer.parseInt(EIDtest);
                }
                catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "ERROR: You must provide a number for equipment ID!");
                    return;
                }
                
                query = "SELECT id FROM equipment;";
                stmt = con.createStatement();
                rs = stmt.executeQuery(query);
            
                match = false;
                current = 0;
                while(rs.next()) {
                    current = rs.getInt("id");
                    if(current == EID) {
                        match = true;
                        break;
                    }
                }
                if(!match){
                    JOptionPane.showMessageDialog(null, "ERROR: You need to enter a equipment ID that matches an entry!");
                    return;
                }
            }
            
            //if the box was selected, then it updates the supplier id of the row matching the id number
            if(checkSID) {
                PreparedStatement pstmt = con.prepareStatement("UPDATE stock SET sup_id = ? WHERE stock_id = ?;");
                pstmt.setInt(1, SID);
                pstmt.setInt(2, id);
                int i = pstmt.executeUpdate();
                if(i > 0)
                    JOptionPane.showMessageDialog(null, "Entry supplier ID was changed!");
                else
                    JOptionPane.showMessageDialog(null, "Entry supplier ID was not changed, please check your data and try again!");
            }
            
            //if the box was selected, then it updates the equipment id of the row matching the id number
            if(checkEID) {
                PreparedStatement pstmt = con.prepareStatement("UPDATE stock SET equip_id = ? WHERE stock_id = ?;");
                pstmt.setInt(1, EID);
                pstmt.setInt(2, id);
                int i = pstmt.executeUpdate();
                if(i > 0)
                    JOptionPane.showMessageDialog(null, "Entry equipment ID was changed!");
                else
                    JOptionPane.showMessageDialog(null, "Entry equipment ID was not changed, please check your data and try again!");
            }
        }
        catch(Exception e){
            //sends an error message to the consol if error occurs
            JOptionPane.showMessageDialog(null, e);
        }
            
    }                                               

    private void EIDBoxActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void viewStockTableActionPerformed(java.awt.event.ActionEvent evt) {                                               
        try {
            //connects to the database
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MedicalEquipment", "root","Love34#");
            
            //creates and executes a query that gets all information from the stock table.
            String query = "SELECT * FROM stock;";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            //creates a new jframe for the table
            JFrame courseWindow = new JFrame("Stock Table");
            courseWindow.setSize(1000, 500);
            JPanel data = new JPanel(new BorderLayout());
            courseWindow.add(data);
            
            //creates a table within the jframe with 3 columns
            JTable table = new JTable();
            DefaultTableModel window = new DefaultTableModel();
            window.addColumn("Stock ID");
            window.addColumn("Supplier ID");
            window.addColumn("Equipment ID");
            
            //adds each entry as a row to the table.      
            while (rs.next()) {
                int stockid = rs.getInt("stock_id");
                int supID = rs.getInt("sup_id");
                int equipID = rs.getInt("equip_id");
                window.addRow(new Object[]{stockid, supID, equipID});
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

    private void viewSupplierIDSActionPerformed(java.awt.event.ActionEvent evt) {                                                
        try {
            //connects to the database
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MedicalEquipment", "root","Love34#");
            
            //creates and executes a query that gets the sup_id and name from the suppliers table.
            String query = "SELECT sup_id, name FROM suppliers;";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            //creates a new jframe for the table
            JFrame courseWindow = new JFrame("Supplier ID Table");
            courseWindow.setSize(1000, 500);
            JPanel data = new JPanel(new BorderLayout());
            courseWindow.add(data);
            
            //creates a table within the jframe with 2 columns
            JTable table = new JTable();
            DefaultTableModel window = new DefaultTableModel();
            window.addColumn("Supplier ID");
            window.addColumn("Name");

            //adds each entry as a row to the table.
            while (rs.next()) {
                int supID = rs.getInt("sup_id");
                String name = rs.getString("name");
                window.addRow(new Object[]{supID, name});
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

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editStock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JCheckBox EIDBox;
    private javax.swing.JTextField EIDData;
    private javax.swing.JCheckBox SIDBOX;
    private javax.swing.JTextField SIDData;
    private javax.swing.JTextField StockIDData;
    private javax.swing.JButton ViewEquipmentIDS;
    private javax.swing.JButton addNewEntry;
    private javax.swing.JButton changeEntryInfo;
    private javax.swing.JButton deleteEntry;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton viewStockTable;
    private javax.swing.JButton viewSupplierIDS;
    // End of variables declaration                   
}
