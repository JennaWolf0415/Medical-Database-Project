//Name: Jenna Wolf
//Class: CS 440-740, Database
//Professor: CS 440-740, Database
//project: Medical Equipment Rental Database Project
//file: editRentals.java
//purpose: panel used for adding, deleting, or changing rows in the rentals table
package databaseproject;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class editRentals extends javax.swing.JFrame {

    public editRentals() {
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
        RIDData = new javax.swing.JTextField();
        CIDData = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CIDBox = new javax.swing.JCheckBox();
        paidData = new javax.swing.JCheckBox();
        ViewRentalsTable = new javax.swing.JButton();
        ViewClientIDS = new javax.swing.JButton();
        EIDBox = new javax.swing.JCheckBox();
        EIDData = new javax.swing.JTextField();
        QuanData = new javax.swing.JTextField();
        PriceData = new javax.swing.JTextField();
        SDateBox = new javax.swing.JCheckBox();
        EDateBox = new javax.swing.JCheckBox();
        quanBox = new javax.swing.JCheckBox();
        priceBox = new javax.swing.JCheckBox();
        paidBox = new javax.swing.JCheckBox();
        EDateData = new com.toedter.calendar.JDateChooser();
        SDateData = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(235, 253, 235));
        jPanel2.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Sitka Banner", 1, 36)); // NOI18N
        jLabel2.setText("Edit Rentals Table");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        deleteEntry.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        deleteEntry.setText("Delete entry");
        deleteEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEntryActionPerformed(evt);
            }
        });
        jPanel2.add(deleteEntry, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 200, 50));

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
        jPanel2.add(addNewEntry, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 200, 50));

        changeEntryInfo.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        changeEntryInfo.setText("Change entry information");
        changeEntryInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeEntryInfoActionPerformed(evt);
            }
        });
        jPanel2.add(changeEntryInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 240, 50));
        jPanel2.add(RIDData, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 140, 40));
        jPanel2.add(CIDData, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 140, 40));

        jLabel4.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
        jLabel4.setText("Rental ID:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, -1, -1));

        CIDBox.setBackground(new java.awt.Color(235, 253, 235));
        CIDBox.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
        CIDBox.setText("Client ID:");
        jPanel2.add(CIDBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, -1));

        paidData.setBackground(new java.awt.Color(235, 253, 235));
        paidData.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
        paidData.setText("Is Paid");
        paidData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paidDataActionPerformed(evt);
            }
        });
        jPanel2.add(paidData, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, -1, -1));

        ViewRentalsTable.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        ViewRentalsTable.setText("View Current Rentals Table");
        ViewRentalsTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewRentalsTableActionPerformed(evt);
            }
        });
        jPanel2.add(ViewRentalsTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 260, 30));

        ViewClientIDS.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        ViewClientIDS.setText("View Client ID's");
        ViewClientIDS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewClientIDSActionPerformed(evt);
            }
        });
        jPanel2.add(ViewClientIDS, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 260, 30));

        EIDBox.setBackground(new java.awt.Color(235, 253, 235));
        EIDBox.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
        EIDBox.setText("Equipment ID:");
        EIDBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EIDBoxActionPerformed(evt);
            }
        });
        jPanel2.add(EIDBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));
        jPanel2.add(EIDData, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 140, 40));
        jPanel2.add(QuanData, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 140, 40));
        jPanel2.add(PriceData, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 140, 40));

        SDateBox.setBackground(new java.awt.Color(235, 253, 235));
        SDateBox.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
        SDateBox.setText("Start Date:");
        SDateBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SDateBoxActionPerformed(evt);
            }
        });
        jPanel2.add(SDateBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, -1, -1));

        EDateBox.setBackground(new java.awt.Color(235, 253, 235));
        EDateBox.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
        EDateBox.setText("End Date:");
        EDateBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDateBoxActionPerformed(evt);
            }
        });
        jPanel2.add(EDateBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, -1, -1));

        quanBox.setBackground(new java.awt.Color(235, 253, 235));
        quanBox.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
        quanBox.setText("Quantity:");
        quanBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quanBoxActionPerformed(evt);
            }
        });
        jPanel2.add(quanBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, -1, -1));

        priceBox.setBackground(new java.awt.Color(235, 253, 235));
        priceBox.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
        priceBox.setText("Total Price:");
        priceBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceBoxActionPerformed(evt);
            }
        });
        jPanel2.add(priceBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, -1, -1));

        paidBox.setBackground(new java.awt.Color(235, 253, 235));
        paidBox.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
        paidBox.setText("Paid:");
        paidBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paidBoxActionPerformed(evt);
            }
        });
        jPanel2.add(paidBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, -1, -1));
        jPanel2.add(EDateData, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 140, 40));
        jPanel2.add(SDateData, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 140, 40));

        jLabel5.setFont(new java.awt.Font("Sitka Banner", 1, 14)); // NOI18N
        jLabel5.setText("Boxes only need to be checked when you want to change");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, 30));

        jLabel6.setFont(new java.awt.Font("Sitka Banner", 1, 14)); // NOI18N
        jLabel6.setText("that columns data property using the Change button!");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        jLabel3.setFont(new java.awt.Font("Sitka Banner", 1, 14)); // NOI18N
        jLabel3.setText("The only data you need filled in when deleting a row is equipment ID!");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        

    private void deleteEntryActionPerformed(java.awt.event.ActionEvent evt) {                                            
        try {
            String idTest = RIDData.getText();  //gets the data from the text box
            
            //makes sure the text box wasn't empty
            if(idTest == null || idTest.isEmpty()) {
                JOptionPane.showMessageDialog(null, "ERROR: You need to provide an rental ID to delete an entry!");
                return;
            }
            
            //creates the id, checks to make sure the variable is a number.
            int id = 0;
            try {
                id = Integer.parseInt(idTest);
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "ERROR: You must provide a number for rental id!");
                return;
            }
            
            //connects to the database and querys for the reantl_id value from the rental table
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MedicalEquipment", "root","Love34#");
            String query = "SELECT rental_id FROM rentals;";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            //creates the match and current variables.
            //checks to see if there is an id that matches the inputed id value.
            boolean match = false;
            int current = 0;
            while(rs.next()) {
                current = rs.getInt("rental_id");
                if(current == id) {
                    match = true;
                    break;
                }
            }   //if no match is found, an error message is output
            if(!match){
                JOptionPane.showMessageDialog(null, "ERROR: You need to enter an rental ID that matches an entry!");
                return;
            }
            
            //creates and executes a query that deletes the row matching the id entered
            PreparedStatement pstmt = con.prepareStatement("DELETE FROM rentals WHERE rental_id = ?;");
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
            String idTest = RIDData.getText();
            String CIDTest = CIDData.getText();
            String EIDTest = EIDData.getText();
            java.util.Date sDate = SDateData.getDate();
            java.util.Date eDate = EDateData.getDate();
            String quanTest = QuanData.getText();
            String priceTest = PriceData.getText();
            boolean paid = paidData.isSelected();
        
            //creates the con and pstmt variables
            Connection con = null;
            PreparedStatement pstmt = null;
        
            //makes sure every textbox has data
            if(idTest == null || idTest.isEmpty() || 
                    CIDTest == null || CIDTest.isEmpty() ||
                    EIDTest == null || EIDTest.isEmpty() ||
                    sDate == null || eDate == null ||
                    quanTest == null || quanTest.isEmpty() ||
                    priceTest == null || priceTest.isEmpty()) {
                JOptionPane.showMessageDialog(null, "ERROR: You need to provide data to all feilds!");
                return;
            }
            
            //creates the id, cid, and eid, quan, and rentPrice variables.
            //checks to make sure these variables are numbers.
            int id = 0;
            int cid = 0;
            int eid = 0;
            int quan = 0;
            double rentPrice = 0;
            try {
                id = Integer.parseInt(idTest);
                cid = Integer.parseInt(CIDTest);
                eid = Integer.parseInt(EIDTest);
                quan = Integer.parseInt(quanTest);
                rentPrice = Double.parseDouble(priceTest);
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "ERROR: You must provide a number for rental_id/client_id/equipment_id/quantity/rentPrice!");
                return;
            }
        
            //checks to make sure id is between 1100 and 2999
            if(id < 1100 || id > 2999) {
                JOptionPane.showMessageDialog(null, "ERROR: You need a number between 1200 and 2999 for a rental id!");
                return;
            }
            
            //checks to make sure cid is between 200 and 399
            if(cid < 200 || cid > 399) {
                JOptionPane.showMessageDialog(null, "ERROR: You need a number between 200 and 399 for a client id!");
                return;
            }
            
            //checks to make sure eid is between 100 and 999
            if(eid < 100 || eid > 999) {
                JOptionPane.showMessageDialog(null, "ERROR: You need a number between 100 and 999 for a equipment id!");
                return;
            }
        
            //checks to make sure rentPrice is more than 0
            if(rentPrice < 0) {
                JOptionPane.showMessageDialog(null, "ERROR: You need a positive number for your total price!");
                return;
            }
        
            //checks to make sure rentPrice is more than 0
            if(quan < 1) {
                JOptionPane.showMessageDialog(null, "ERROR: You need a positive number greater than 1 for your quantity!");
                return;
            }
            
            //connects to the database and querys for the rental_id value from the rental table
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MedicalEquipment", "root","Love34#");
            String query = "SELECT rental_id FROM rentals;";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            //creates the match and current variables.
            //checks to see if there is an id that matches the inputed id value.
            boolean match = false;
            int current = 0;
            while(rs.next()) {
                current = rs.getInt("rental_id");
                if(current == id) {
                    match = true;
                    break;
                }
            }   //if there is a match, an error message is shown
            if(match){
                JOptionPane.showMessageDialog(null, "ERROR: You need to enter a rental ID that hasn't been used yet!");
                return;
            }
            
            //querys for the client_id value from the rentals table
            query = "SELECT client_id FROM clients;";
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            
            //resets match and current, checks to see if there is an id that matches the inputed id value.
            match = false;
            current = 0;
            while(rs.next()) {
                current = rs.getInt("client_id");
                if(current == cid) {
                    match = true;
                    break;
                }
            }   //if there is a match, an error message is shown
            if(!match){
                JOptionPane.showMessageDialog(null, "ERROR: You need to enter a client ID that matches an entry!");
                return;
            }
            
            //querys for the equipment_id value from the equipment table
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
                JOptionPane.showMessageDialog(null, "ERROR: You need to enter a equipment ID that matches an entry!");
                return;
            }
            
            //changes the start and end date to one that matches the sql code
            java.sql.Date sqlSDate = new java.sql.Date(sDate.getTime());
            java.sql.Date sqlEDate = new java.sql.Date(eDate.getTime());
            
            //creates and executes a query that inserts the entered values into stock.
            pstmt = con.prepareStatement("insert into rentals values (?,?,?,?,?,?,?,?);");
            pstmt.setInt(1, id);
            pstmt.setInt(2, cid);
            pstmt.setInt(3, eid);
            pstmt.setDate(4, sqlSDate);
            pstmt.setDate(5, sqlEDate);
            pstmt.setInt(6, quan);
            pstmt.setDouble(7, rentPrice);
            pstmt.setBoolean(8, paid);
            int i = pstmt.executeUpdate();
            if(i > 0)
                JOptionPane.showMessageDialog(null, "New rental Was Added");
            else
                JOptionPane.showMessageDialog(null, "New rental Was Not Added! check your data feilds!");
        }
        catch(Exception e){
            //sends an error message to the consol if error occurs
            JOptionPane.showMessageDialog(null, e);
        }
    }                                           

    private void changeEntryInfoActionPerformed(java.awt.event.ActionEvent evt) {                                                
        try {
            //gets data from all text boxes and check boxes
            String idTest = RIDData.getText();
            boolean checkCID = CIDBox.isSelected();
            boolean checkEID = EIDBox.isSelected();
            boolean checkSDate = SDateBox.isSelected();
            boolean checkEDate = EDateBox.isSelected();
            boolean checkQuan = quanBox.isSelected();
            boolean checkPrice = priceBox.isSelected();
            boolean checkPaid = paidBox.isSelected();
        
            //makes sure the id text box has data
            if(idTest == null || idTest.isEmpty()) {
                JOptionPane.showMessageDialog(null, "ERROR: You need to provide an rental ID!");
                return;
            }
        
            //creates the id, checks to make sure these variables are numbers.
            int id = 0;
            try {
                id = Integer.parseInt(idTest);
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "ERROR: You must provide a number for rental id!");
                return;
            }
        
            //connects to the database and querys for the rental_id value from the rentals table
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MedicalEquipment", "root","Love34#");
            String query = "SELECT rental_id FROM rentals;";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            //creates the match and current variables.
            //checks to see if there is an id that matches the inputed id value.
            boolean match = false;
            int current = 0;
            while(rs.next()) {
                current = rs.getInt("rental_id");
                if(current == id) {
                    match = true;
                    break;
                }
            }   //if no match is found, an error message is output
            if(!match){
                JOptionPane.showMessageDialog(null, "ERROR: You need to enter an rental ID that matches an entry!");
                return;
            }
            
            //creates the cid variable, gets data from textbox, makes sure there is data in the text box,
            //makes sure the data is a number, makes sure the id matches one in the table
            int cid = 0;
            if(checkCID) {
                String cidTest = CIDData.getText();
                if(cidTest == null || cidTest.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "ERROR: You need to provide an client ID since the box is checked!");
                    return;
                }
                try {
                    cid = Integer.parseInt(cidTest);
                }
                catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "ERROR: You must provide a number for client ID!");
                    return;
                }
                query = "SELECT client_id FROM clients;";
                stmt = con.createStatement();
                rs = stmt.executeQuery(query);
            
                match = false;
                current = 0;
                while(rs.next()) {
                    current = rs.getInt("client_id");
                    if(current == cid) {
                        match = true;
                        break;
                    }
                }
                if(!match){
                    JOptionPane.showMessageDialog(null, "ERROR: You need to enter an client ID that matches an entry!");
                    return;
                }
            }
            
            //creates the eid variable, gets data from textbox, makes sure there is data in the text box,
            //makes sure the data is a number, makes sure the id matches one in the table
            int eid = 0;
            if(checkEID) {
                String eidTest = EIDData.getText();
                if(eidTest == null || eidTest.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "ERROR: You need to provide an Equipment ID since the box is checked!");
                    return;
                }
                try {
                    eid = Integer.parseInt(eidTest);
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
                    if(current == eid) {
                        match = true;
                        break;
                    }
                }
                if(!match){
                    JOptionPane.showMessageDialog(null, "ERROR: You need to enter an equipment ID that matches an entry!");
                    return;
                }
            }
            
            //creates the sDate variable, gets data from textbox, makes sure there is data in the text box.
            java.util.Date sDate = SDateData.getDate(); 
            if(checkSDate) {
                if(sDate == null) {
                    JOptionPane.showMessageDialog(null, "ERROR: You need to provide an start date since the box is checked!");
                    return;
                }
            }
            
            //creates the eDate variable, gets data from textbox, makes sure there is data in the text box.
            java.util.Date eDate = EDateData.getDate();
            if(checkSDate) {
                if(eDate == null) {
                    JOptionPane.showMessageDialog(null, "ERROR: You need to provide an end date since the box is checked!");
                    return;
                }
            }
            
            //creates the quan variable, gets data from textbox, makes sure there is data in the text box,
            //makes sure the data is a number, makes sure the number is greater than 0
            int quan = 0;
            if(checkQuan) {
                String quanTest = QuanData.getText();
                if(quanTest == null || quanTest.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "ERROR: You need to provide an quantity since the box is checked!");
                    return;
                }
                try {
                    quan = Integer.parseInt(quanTest);
                }
                catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "ERROR: You must provide a number for Quantity!");
                    return;
                }
                if(quan < 1) {
                    JOptionPane.showMessageDialog(null, "ERROR: You need a positive number greater than 0 for your quantity!");
                    return;
                }
            }
            
            //creates the price variable, gets data from textbox, makes sure there is data in the text box,
            //makes sure the data is a number, makes sure the price is greater than 0
            double price = 0;
            if(checkPrice) {
                String priceTest = PriceData.getText();
                if(priceTest == null || priceTest.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "ERROR: You need to provide an Total Price since the box is checked!");
                    return;
                }
                try {
                    price = Double.parseDouble(priceTest);
                }
                catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "ERROR: You must provide a number for Total Price!");
                    return;
                }
                if(price < 0) {
                    JOptionPane.showMessageDialog(null, "ERROR: You need a positive number for your Total Price!");
                    return;
                }
        
            }
            
            //if the box was selected, then it updates the client_id of the row matching the id number
            if(checkCID) {
                PreparedStatement pstmt = con.prepareStatement("UPDATE rentals SET client_id = ? WHERE rental_id = ?;");
                pstmt.setInt(1, cid);
                pstmt.setInt(2, id);
                int i = pstmt.executeUpdate();
                if(i > 0)
                    JOptionPane.showMessageDialog(null, "Entry client ID was changed!");
                else
                    JOptionPane.showMessageDialog(null, "Entry client ID was not changed, please check your data and try again!");
            }
            
            //if the box was selected, then it updates the equipment_id of the row matching the id number
            if(checkEID) {
                PreparedStatement pstmt = con.prepareStatement("UPDATE rentals SET equipment_id = ? WHERE rental_id = ?;");
                pstmt.setInt(1, eid);
                pstmt.setInt(2, id);
                int i = pstmt.executeUpdate();
                if(i > 0)
                    JOptionPane.showMessageDialog(null, "Entry equipment ID was changed!");
                else
                    JOptionPane.showMessageDialog(null, "Entry equipment ID was not changed, please check your data and try again!");
            }
            
            //if the box was selected, then it updates the start date of the row matching the id number
            if(checkSDate) {
                java.sql.Date sqlSDate = new java.sql.Date(sDate.getTime());
                PreparedStatement pstmt = con.prepareStatement("UPDATE rentals SET startDate = ? WHERE rental_id = ?;");
                pstmt.setDate(1, sqlSDate);
                pstmt.setInt(2, id);
                int i = pstmt.executeUpdate();
                if(i > 0)
                    JOptionPane.showMessageDialog(null, "Entry start date was changed!");
                else
                    JOptionPane.showMessageDialog(null, "Entry start date was not changed, please check your data and try again!");
            }
            
            //if the box was selected, then it updates the end date of the row matching the id number
            if(checkEDate) {
                java.sql.Date sqlEDate = new java.sql.Date(eDate.getTime());
                PreparedStatement pstmt = con.prepareStatement("UPDATE rentals SET endDate = ? WHERE rental_id = ?;");
                pstmt.setDate(1, sqlEDate);
                pstmt.setInt(2, id);
                int i = pstmt.executeUpdate();
                if(i > 0)
                    JOptionPane.showMessageDialog(null, "Entry end date was changed!");
                else
                    JOptionPane.showMessageDialog(null, "Entry end date was not changed, please check your data and try again!");
            }
            
            //if the box was selected, then it updates the quantity of the row matching the id number
            if(checkQuan) {
                PreparedStatement pstmt = con.prepareStatement("UPDATE rentals SET quantity = ? WHERE rental_id = ?;");
                pstmt.setInt(1, quan);
                pstmt.setInt(2, id);
                int i = pstmt.executeUpdate();
                if(i > 0)
                    JOptionPane.showMessageDialog(null, "Entry quantity was changed!");
                else
                    JOptionPane.showMessageDialog(null, "Entry quantity was not changed, please check your data and try again!");
            }
            
            //if the box was selected, then it updates the total price of the row matching the id number
            if(checkPrice) {
                PreparedStatement pstmt = con.prepareStatement("UPDATE rentals SET totalPrice = ? WHERE rental_id = ?;");
                pstmt.setDouble(1, price);
                pstmt.setInt(2, id);
                int i = pstmt.executeUpdate();
                if(i > 0)
                    JOptionPane.showMessageDialog(null, "Entry total price was changed!");
                else
                    JOptionPane.showMessageDialog(null, "Entry total price was not changed, please check your data and try again!");
            }
            
            //if the box was selected, then it updates the paid of the row matching the id number
            if(checkPaid) {
                boolean paid = paidData.isSelected();
                PreparedStatement pstmt = con.prepareStatement("UPDATE rentals SET paid = ? WHERE rental_id = ?;");
                pstmt.setBoolean(1, paid);
                pstmt.setInt(2, id);
                int i = pstmt.executeUpdate();
                if(i > 0)
                    JOptionPane.showMessageDialog(null, "Entry paid status was changed!");
                else
                    JOptionPane.showMessageDialog(null, "Entry paid status was not changed, please check your data and try again!");
            }
            
        }
        catch(Exception e){
            //sends an error message to the consol if error occurs
            JOptionPane.showMessageDialog(null, e);
        }
    }                                               

    private void paidDataActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void ViewRentalsTableActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        try {
            //connects to the database
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MedicalEquipment", "root","Love34#");
            
            //creates and executes a query that gets all information from the rentals table.
            String query = "SELECT * FROM rentals;";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            //creates a new jframe for the table
            JFrame courseWindow = new JFrame("Customer Information");
            courseWindow.setSize(1000, 500);
            JPanel data = new JPanel(new BorderLayout());
            courseWindow.add(data);
            
            //creates a table within the jframe with 8 columns
            JTable table = new JTable();
            DefaultTableModel window = new DefaultTableModel();
            window.addColumn("Rental ID");
            window.addColumn("Client ID");
            window.addColumn("Equipment ID");
            window.addColumn("Start Date");
            window.addColumn("End Date");
            window.addColumn("Quantity");
            window.addColumn("TotalPrice");
            window.addColumn("Paid");
            
            //adds each entry as a row to the table.      
            while (rs.next()) {
                int id = rs.getInt("rental_id");
                int Cid = rs.getInt("client_ID");
                int Eid = rs.getInt("equipment_id");
                Date sDate = rs.getDate("startDate");
                Date eDate = rs.getDate("endDate");
                int quan = rs.getInt("quantity");
                double price = rs.getDouble("totalPrice");
                boolean paid = rs.getBoolean("paid");
                String paidS;
                if(paid) {
                    paidS = "True";
                }
                else {
                    paidS = "False";
                }
                window.addRow(new Object[]{id, Cid, Eid, sDate, eDate, quan, price, paidS});
            }
            
            //sets the table to the jframe window, adds the data and shows the client the table
            table.setModel(window);
            JScrollPane scrollPane = new JScrollPane(table);
            data.add(scrollPane, BorderLayout.CENTER);
            courseWindow.setVisible(true);
        }
        catch (Exception e) {
            
            System.out.println("SQL select operation has been failed: " + e);
        }
    }                                                

    private void ViewClientIDSActionPerformed(java.awt.event.ActionEvent evt) {                                              
        try {
            //connects to the database
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MedicalEquipment", "root","Love34#");
            
            //creates and executes a query that gets the client_id and name from the rentals table.
            String query = "SELECT client_id, name FROM clients;";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            //creates a new jframe for the table
            JFrame courseWindow = new JFrame("Client ID Table");
            courseWindow.setSize(1000, 500);
            JPanel data = new JPanel(new BorderLayout());
            courseWindow.add(data);
            
            //creates a table within the jframe with 2 columns
            JTable table = new JTable();
            DefaultTableModel window = new DefaultTableModel();
            window.addColumn("Client ID");
            window.addColumn("Name");

            //adds each entry as a row to the table.
            while (rs.next()) {
                int cID = rs.getInt("client_id");
                String name = rs.getString("name");
                window.addRow(new Object[]{cID, name});
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

    private void EIDBoxActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void SDateBoxActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void EDateBoxActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void quanBoxActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void priceBoxActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void paidBoxActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editRentals().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JCheckBox CIDBox;
    private javax.swing.JTextField CIDData;
    private javax.swing.JCheckBox EDateBox;
    private com.toedter.calendar.JDateChooser EDateData;
    private javax.swing.JCheckBox EIDBox;
    private javax.swing.JTextField EIDData;
    private javax.swing.JTextField PriceData;
    private javax.swing.JTextField QuanData;
    private javax.swing.JTextField RIDData;
    private javax.swing.JCheckBox SDateBox;
    private com.toedter.calendar.JDateChooser SDateData;
    private javax.swing.JButton ViewClientIDS;
    private javax.swing.JButton ViewEquipmentIDS;
    private javax.swing.JButton ViewRentalsTable;
    private javax.swing.JButton addNewEntry;
    private javax.swing.JButton changeEntryInfo;
    private javax.swing.JButton deleteEntry;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JCheckBox paidBox;
    private javax.swing.JCheckBox paidData;
    private javax.swing.JCheckBox priceBox;
    private javax.swing.JCheckBox quanBox;
    // End of variables declaration                   
}
