//Name: Jenna Wolf
//Class: CS 440-740, Database
//Professor: CS 440-740, Database
//project: Medical Equipment Rental Database Project
//file: editEquipment.java
//purpose: panel used for adding, deleting, or changing rows in the equipment table
package databaseproject;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class editEquipment extends javax.swing.JFrame {

    public editEquipment() {
        initComponents();
        setDefaultCloseOperation(clientLogIn.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        deleteEntry = new javax.swing.JButton();
        viewEquipmentTable = new javax.swing.JButton();
        addNewEntry = new javax.swing.JButton();
        changeEntryInfo = new javax.swing.JButton();
        quanData = new javax.swing.JTextField();
        nameData = new javax.swing.JTextField();
        EIDData = new javax.swing.JTextField();
        manData = new javax.swing.JTextField();
        desData = new javax.swing.JTextField();
        priceData = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        quanBox = new javax.swing.JCheckBox();
        nameBox = new javax.swing.JCheckBox();
        manBox = new javax.swing.JCheckBox();
        descBox = new javax.swing.JCheckBox();
        priceBox = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(235, 253, 235));
        jPanel2.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Sitka Banner", 1, 14)); // NOI18N
        jLabel3.setText("The only data you need filled in when deleting a row is equipment ID!");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, -1, 30));

        jLabel2.setFont(new java.awt.Font("Sitka Banner", 1, 36)); // NOI18N
        jLabel2.setText("Edit Equipment Table");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        deleteEntry.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        deleteEntry.setText("Delete entry");
        deleteEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEntryActionPerformed(evt);
            }
        });
        jPanel2.add(deleteEntry, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 520, 200, 50));

        viewEquipmentTable.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        viewEquipmentTable.setText("View Current Equipment Table");
        viewEquipmentTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewEquipmentTableActionPerformed(evt);
            }
        });
        jPanel2.add(viewEquipmentTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 290, 30));

        addNewEntry.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        addNewEntry.setText("Add new entry");
        addNewEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewEntryActionPerformed(evt);
            }
        });
        jPanel2.add(addNewEntry, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 200, 50));

        changeEntryInfo.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        changeEntryInfo.setText("Change entry information");
        changeEntryInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeEntryInfoActionPerformed(evt);
            }
        });
        jPanel2.add(changeEntryInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 240, 50));
        jPanel2.add(quanData, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 140, 40));
        jPanel2.add(nameData, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 140, 40));
        jPanel2.add(EIDData, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 140, 40));
        jPanel2.add(manData, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 140, 40));

        desData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desDataActionPerformed(evt);
            }
        });
        jPanel2.add(desData, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 140, 40));
        jPanel2.add(priceData, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 140, 40));

        jLabel4.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
        jLabel4.setText("Equipment ID:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        quanBox.setBackground(new java.awt.Color(235, 253, 235));
        quanBox.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
        quanBox.setText("Quantity:");
        quanBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quanBoxActionPerformed(evt);
            }
        });
        jPanel2.add(quanBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        nameBox.setBackground(new java.awt.Color(235, 253, 235));
        nameBox.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
        nameBox.setText("Name:");
        jPanel2.add(nameBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        manBox.setBackground(new java.awt.Color(235, 253, 235));
        manBox.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
        manBox.setText("Manufacturer:");
        manBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manBoxActionPerformed(evt);
            }
        });
        jPanel2.add(manBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        descBox.setBackground(new java.awt.Color(235, 253, 235));
        descBox.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
        descBox.setText("Description:");
        descBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descBoxActionPerformed(evt);
            }
        });
        jPanel2.add(descBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        priceBox.setBackground(new java.awt.Color(235, 253, 235));
        priceBox.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
        priceBox.setText("Rent Price:");
        priceBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceBoxActionPerformed(evt);
            }
        });
        jPanel2.add(priceBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jLabel5.setFont(new java.awt.Font("Sitka Banner", 1, 14)); // NOI18N
        jLabel5.setText("Boxes only need to be checked when you want to change");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, -1, -1));

        jLabel6.setFont(new java.awt.Font("Sitka Banner", 1, 14)); // NOI18N
        jLabel6.setText("that columns data property using the Change button!");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 600, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void deleteEntryActionPerformed(java.awt.event.ActionEvent evt) {                                            
        try {
            String idTest = EIDData.getText();  //gets the data from the text box
            
            //makes sure the text box wasn't empty
            if(idTest == null || idTest.isEmpty()) {
                JOptionPane.showMessageDialog(null, "ERROR: You need to provide an equipment ID to delete an entry!");
                return;
            }
            
            //creates the id, checks to make sure the variable is a number.
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
            }   //if no match is found, an error message is output
            if(!equipMatch){
                JOptionPane.showMessageDialog(null, "ERROR: You need to enter an equipment ID that matches an entry!");
                return;
            }
            
            //creates and executes a query that deletes the row matching the id entered
            PreparedStatement pstmt = con.prepareStatement("DELETE FROM equipment WHERE id = ?;");
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

    private void viewEquipmentTableActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        try {
            //connects to the database
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MedicalEquipment", "root","Love34#");
            
            //creates and executes a query that gets all information from the equipment table.
            String query = "SELECT * FROM equipment;";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            //creates a new jframe for the table
            JFrame courseWindow = new JFrame("Equipment Table");
            courseWindow.setSize(1000, 500);
            JPanel data = new JPanel(new BorderLayout());
            courseWindow.add(data);
            
            //creates a table within the jframe with 6 columns
            JTable table = new JTable();
            DefaultTableModel window = new DefaultTableModel();
            window.addColumn("Name");
            window.addColumn("Equipment ID");
            window.addColumn("Manufacturer");
            window.addColumn("Description");
            window.addColumn("Rent Price");
            window.addColumn("Quantity");
            
            //adds each entry as a row to the table. Also formats it so the description doesn't run off the side  
            while (rs.next()) {
                String name = rs.getString("name");
                int id = rs.getInt("ID");
                String man = rs.getString("Manufacturer");
                String description = rs.getString("description");
                description = "<html><body style='width: 125px'>" + description + "</body></html>";
                double price = rs.getDouble("rent_price");
                int quan = rs.getInt("quantity");
                window.addRow(new Object[]{name, id, man, description, price, quan});
            }
            //sets the table to the jframe window
            table.setModel(window);
            
            //makes the rows long enough vertically for the entire description to be seen
            for (int row = 0; row < table.getRowCount(); row++) {
                int maxRowHeight = table.getRowHeight();
                for (int column = 0; column < table.getColumnCount(); column++) {
                    String cellText = table.getValueAt(row, column).toString();
                    int lines = cellText.length() / 30 + 1;
                    int rowHeight = lines * table.getRowHeight();
                    if (rowHeight > maxRowHeight) {
                        maxRowHeight = rowHeight;
                    }
                }
                table.setRowHeight(row, maxRowHeight);
            }
            
            //adds the data and shows the client the table
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
            String idTest = EIDData.getText();
            String man = manData.getText();
            String descript = desData.getText();
            String rentPriceTest = priceData.getText();
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
            }   //if there is a match, an error message is shown
            if(equipMatch){
                JOptionPane.showMessageDialog(null, "ERROR: You need to enter a equipment ID that hasn't been used yet!");
                return;
            }
            
            //creates and executes a query that inserts the entered values into equipment.
            pstmt = con.prepareStatement("insert into equipment values (?,?,?,?,?,?);");
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

    private void changeEntryInfoActionPerformed(java.awt.event.ActionEvent evt) {                                                
        try {
            //gets data from all text boxes and check boxes
            String idTest = EIDData.getText();
            boolean checkName = nameBox.isSelected();
            boolean checkMan = manBox.isSelected();
            boolean checkDes = descBox.isSelected();
            boolean checkPrice = priceBox.isSelected();
            boolean checkQuan = quanBox.isSelected();
        
            //makes sure the id text box has data
            if(idTest == null || idTest.isEmpty()) {
                JOptionPane.showMessageDialog(null, "ERROR: You need to provide an equipment ID!");
                return;
            }
        
            //creates the id, checks to make sure these variables are numbers.
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
            }   //if no match is found, an error message is output
            if(!equipMatch){
                JOptionPane.showMessageDialog(null, "ERROR: You need to enter an equipment ID that matches an entry!");
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
        
            //creates the man variable, gets data from textbox, makes sure there is data in the text box.
            String man = null;
            if(checkMan) {
                man = manData.getText();
                if(man == null || man.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "ERROR: You need to provide an manufacturer since the box is checked!");
                    return;
                }
            }
        
            //creates the des variable, gets data from textbox, makes sure there is data in the text box.
            String des = null;
            if(checkDes) {
                des = desData.getText();
                if(des == null || des.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "ERROR: You need to provide an description since the box is checked!");
                    return;
                }
            }
        
            //creates the price variable, gets data from textbox, makes sure there is data in the text box,
            //makes sure the data is a number, makes sure the number is above 0
            double price = 0;
            if(checkPrice) {
                String priceTest = priceData.getText();
                if(priceTest == null || priceTest.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "ERROR: You need to provide an Rent Price since the box is checked!");
                    return;
                }
                try {
                    price = Double.parseDouble(priceTest);
                }
                catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "ERROR: You must provide a number for Rent Price!");
                    return;
                }
                if(price < 0) {
                    JOptionPane.showMessageDialog(null, "ERROR: You need a positive number for your rentPrice!");
                    return;
                }
        
            }
        
            //creates the quan variable, gets data from textbox, makes sure there is data in the text box,
            //makes sure the data is a number, makes sure the number is above 0
            int quan = 0;
            if(checkQuan) {
                String quanTest = quanData.getText();
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
                    JOptionPane.showMessageDialog(null, "ERROR: You need a positive number greater than 1 for your quantity!");
                    return;
                }
            }
            
            //if the box was selected, then it updates the name of the row matching the id number
            if(checkName) {
                PreparedStatement pstmt = con.prepareStatement("UPDATE equipment SET name = ? WHERE id = ?;");
                pstmt.setString(1, name);
                pstmt.setInt(2, id);
                int i = pstmt.executeUpdate();
                if(i > 0)
                    JOptionPane.showMessageDialog(null, "Entry name was changed!");
                else
                    JOptionPane.showMessageDialog(null, "Entry name was not changed, please check your data and try again!");
            }
            
            //if the box was selected, then it updates the manufacturer of the row matching the id number
            if(checkMan) {
                PreparedStatement pstmt = con.prepareStatement("UPDATE equipment SET manufacturer = ? WHERE id = ?;");
                pstmt.setString(1, man);
                pstmt.setInt(2, id);
                int i = pstmt.executeUpdate();
                if(i > 0)
                    JOptionPane.showMessageDialog(null, "Entry manufacturer was changed!");
                else
                    JOptionPane.showMessageDialog(null, "Entry manufacturer was not changed, please check your data and try again!");
            }
            
            //if the box was selected, then it updates the description of the row matching the id number
            if(checkDes) {
                PreparedStatement pstmt = con.prepareStatement("UPDATE equipment SET description = ? WHERE id = ?;");
                pstmt.setString(1, des);
                pstmt.setInt(2, id);
                int i = pstmt.executeUpdate();
                if(i > 0)
                    JOptionPane.showMessageDialog(null, "Entry description was changed!");
                else
                    JOptionPane.showMessageDialog(null, "Entry description was not changed, please check your data and try again!");
            }
            
            //if the box was selected, then it updates the rent price of the row matching the id number
            if(checkPrice) {
                PreparedStatement pstmt = con.prepareStatement("UPDATE equipment SET rent_price = ? WHERE id = ?;");
                pstmt.setDouble(1, price);
                pstmt.setInt(2, id);
                int i = pstmt.executeUpdate();
                if(i > 0)
                    JOptionPane.showMessageDialog(null, "Entry rent price was changed!");
                else
                    JOptionPane.showMessageDialog(null, "Entry rent price was not changed, please check your data and try again!");
            }
            
            //if the box was selected, then it updates the quantity of the row matching the id number
            if(checkQuan) {
                PreparedStatement pstmt = con.prepareStatement("UPDATE equipment SET quantity = ? WHERE id = ?;");
                pstmt.setInt(1, quan);
                pstmt.setInt(2, id);
                int i = pstmt.executeUpdate();
                if(i > 0)
                    JOptionPane.showMessageDialog(null, "Entry quantity was changed!");
                else
                    JOptionPane.showMessageDialog(null, "Entry quantity was not changed, please check your data and try again!");
            }
            
        }
        catch(Exception e){
            //sends an error message to the consol if error occurs
            JOptionPane.showMessageDialog(null, e);
        }
    }                                               

    private void desDataActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void quanBoxActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void manBoxActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void descBoxActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void priceBoxActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editEquipment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField EIDData;
    private javax.swing.JButton addNewEntry;
    private javax.swing.JButton changeEntryInfo;
    private javax.swing.JButton deleteEntry;
    private javax.swing.JTextField desData;
    private javax.swing.JCheckBox descBox;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JCheckBox manBox;
    private javax.swing.JTextField manData;
    private javax.swing.JCheckBox nameBox;
    private javax.swing.JTextField nameData;
    private javax.swing.JCheckBox priceBox;
    private javax.swing.JTextField priceData;
    private javax.swing.JCheckBox quanBox;
    private javax.swing.JTextField quanData;
    private javax.swing.JButton viewEquipmentTable;
    // End of variables declaration                   
}
