//Name: Jenna Wolf
//Class: CS 440-740, Database
//Professor: CS 440-740, Database
//project: Medical Equipment Rental Database Project
//file: takeOrder.java
//purpose: panel used for managers to make an order for a client. Also allows them to add a discount,
//change a price, or override quantity restrictions.
package databaseproject;

import com.toedter.calendar.JCalendar;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Random;

public class TakeOrder extends javax.swing.JFrame {

    public TakeOrder() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        clientIdData = new javax.swing.JTextField();
        endDate = new com.toedter.calendar.JDateChooser();
        startDate = new com.toedter.calendar.JDateChooser();
        equipmentName = new javax.swing.JTextField();
        discountData = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        RentButton = new javax.swing.JButton();
        goBackButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        quanData = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        QuantityBox = new javax.swing.JCheckBox();
        discountBox = new javax.swing.JCheckBox();
        equipmentName1 = new javax.swing.JTextField();
        itemPriceBox = new javax.swing.JCheckBox();
        newPriceData = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(235, 253, 235));
        jPanel2.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Sitka Display", 1, 34)); // NOI18N
        jLabel2.setText("End Date:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));
        jPanel2.add(clientIdData, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 150, 40));
        jPanel2.add(endDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 170, 40));
        jPanel2.add(startDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 170, 40));
        jPanel2.add(equipmentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 150, 40));
        jPanel2.add(discountData, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 150, 40));

        jLabel3.setFont(new java.awt.Font("Sitka Display", 1, 12)); // NOI18N
        jLabel3.setText("between 1 and 100");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, -1));

        jLabel4.setFont(new java.awt.Font("Sitka Display", 1, 34)); // NOI18N
        jLabel4.setText("Quantity:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Sitka Display", 1, 34)); // NOI18N
        jLabel5.setText("Start Date:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        RentButton.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
        RentButton.setText("Rent Equipment");
        RentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RentButtonActionPerformed(evt);
            }
        });
        jPanel2.add(RentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, 260, 40));

        goBackButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        goBackButton.setText("Go Back");
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });
        jPanel2.add(goBackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, 100, 30));

        jLabel6.setFont(new java.awt.Font("Sitka Display", 1, 36)); // NOI18N
        jLabel6.setText("Place Order For a Client");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));
        jPanel2.add(quanData, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 150, 40));

        jLabel7.setFont(new java.awt.Font("Sitka Display", 1, 34)); // NOI18N
        jLabel7.setText("Client ID:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        QuantityBox.setBackground(new java.awt.Color(235, 253, 235));
        QuantityBox.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        QuantityBox.setText("Override Quantity Constraint");
        QuantityBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantityBoxActionPerformed(evt);
            }
        });
        jPanel2.add(QuantityBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 350, 40));

        discountBox.setBackground(new java.awt.Color(235, 253, 235));
        discountBox.setFont(new java.awt.Font("Sitka Display", 1, 30)); // NOI18N
        discountBox.setText("Add Discount");
        jPanel2.add(discountBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 200, 30));
        jPanel2.add(equipmentName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 150, 40));

        itemPriceBox.setBackground(new java.awt.Color(235, 253, 235));
        itemPriceBox.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        itemPriceBox.setText("Change Item Price");
        jPanel2.add(itemPriceBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 210, -1));
        jPanel2.add(newPriceData, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 150, 40));

        jLabel8.setFont(new java.awt.Font("Sitka Display", 1, 34)); // NOI18N
        jLabel8.setText("Equipment:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jLabel9.setFont(new java.awt.Font("Sitka Display", 1, 12)); // NOI18N
        jLabel9.setText("Make sure to include spaces!");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        jLabel10.setFont(new java.awt.Font("Sitka Display", 1, 12)); // NOI18N
        jLabel10.setText("Put a number");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void QuantityBoxActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        new managerPage().setVisible(true);
        dispose();
    }                                            

    private void RentButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        try {
            //gets data from all text boxes and check boxes
            String equipment = equipmentName.getText().toLowerCase();
            String idNumTest = clientIdData.getText();
            String quanTest = quanData.getText();
            java.util.Date sDate = startDate.getDate();
            java.util.Date eDate = endDate.getDate();
            boolean checkedDiscount = discountBox.isSelected();
            boolean checkedItemPrice = itemPriceBox.isSelected();
            boolean checkedOverrideQuantity = QuantityBox.isSelected();
            
            //makes sure no text box is left empty
            if(equipment == null || equipment.isEmpty() || 
                    idNumTest == null || idNumTest.isEmpty() ||
                    quanTest == null || quanTest.isEmpty() || 
                    sDate == null || eDate == null) {
                JOptionPane.showMessageDialog(null, "ERROR: You need to provide data to all feilds!");
                return;
            }
            
            //makes sure both idNum and quantity are numbers. if not, error message is given.
            int idNum = 0;
            int quan = 0;
            try {
                idNum = Integer.parseInt(idNumTest);
                quan = Integer.parseInt(quanTest);
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "ERROR: You must provide a number for client ID and quantity!");
                return;
            }
            
            //creates the discount variable and enters the if statement if a discount is being applied
            double discount = 0;
            if(checkedDiscount) {
                String discountTest = discountData.getText();   //gets the discount data
                
                //makes sure the text box is not left empty
                if(discountTest == null || discountTest.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "ERROR: Since you marked the discount box, you need to put a discount in!");
                    return;
                }
                
                //makes sure discount is a number. if not, error message is given.
                try {
                    discount = Double.parseDouble(discountTest);
                }
                catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "ERROR: You must provide a number for the dicount!");
                    return;
                }
                
                //makes sure discount is between 1 and 100. if not, error message is given.
                if(discount > 100 || discount < 1) {
                    JOptionPane.showMessageDialog(null, "ERROR: Your discount precent must be between 1 and 100!");
                    return; 
                }
                discount = discount / 100;
            }
            
            //creates the newItemPrice variable and enters the if statement if a new price is being applied
            double newItemPrice = 0;
            if(checkedItemPrice) {
                String itemTest = newPriceData.getText();   //gets the new price data
                
                //makes sure the text box is not left empty
                if(itemTest == null || itemTest.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "ERROR: Since you marked the change item price box, you need to put a new price in!");
                    return;
                }
                
                //makes sure newItemPrice is a number. if not, error message is given.
                try {
                    newItemPrice = Double.parseDouble(itemTest);
                }
                catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "ERROR: You must provide a number for the new price!");
                    return;
                }
            }
            
            //makes sure quantity is above one. if not, error message is given.
            if(quan < 1) {
                JOptionPane.showMessageDialog(null, "ERROR: You need a positive number for your quantity!");
                return;
            }
            
            //connects to the database
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MedicalEquipment", "root","Love34#");
            
            //creates and executes a query to get all name values from equipment
            String query = "SELECT name FROM equipment";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            //creates the equipMatch and currentEquip variables. Then goes through the while
            //loop looking for a match. If a match is not found, then an error is output through
            //the if statement after the loop.
            boolean equipMatch = false;
            String currentEquip = null;
            while(rs.next()) {
                currentEquip = rs.getString("name");
                if(equipment.equals(currentEquip.toLowerCase())) {
                    equipMatch = true;
                    break;
                }
            }
            if(!equipMatch){
                JOptionPane.showMessageDialog(null, "ERROR: You need to enter a correct piece of equipment!");
                return;
            }
            
            //creates and executes a query to get all client id values from clients
            query = "SELECT client_id FROM clients;";
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            
            //creates the idMatch and currentID variables. Then goes through the while
            //loop looking for a match. If a match is not found, then an error is output through
            //the if statement after the loop.
            boolean idMatch = false;
            int currentID = 0;
            while(rs.next()) {
                currentID = rs.getInt("client_id");
                if(idNum ==currentID) {
                    idMatch = true;
                    break;
                }
            }
            if(!idMatch){
                JOptionPane.showMessageDialog(null, "ERROR: You need to enter a correct client ID!");
                return;
            }
            
            //creates and executes a query that gets the quantity of the item matching the equipment name
            query = "SELECT quantity FROM equipment WHERE name = ?;";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, equipment);
            rs = pstmt.executeQuery();
            
            //creates the quantity variable before setting it to the quantity from the query.
            //an error message is output if something went wrong.
            int quantity = 0;
            if(!rs.next()) {
                JOptionPane.showMessageDialog(null, "ERROR: recieving quantity went wrong, please try again!");
                return;
            }
            else {
                quantity = rs.getInt("quantity");
            }
            
            //checks to see if the end date is after the start data. If so, an error is output.
            if(!eDate.after(sDate)) {
                JOptionPane.showMessageDialog(null, "ERROR: Your end date must be the same or after your start date!");
            }
            else if(quan > quantity) {  //checks to see quan is more than quantity. If so, an error is output.
                JOptionPane.showMessageDialog(null, "ERROR: You asked for a quantity greater than the quantity of our equipment in stock currently!\n"
                        + "We will work to get more of this equipment in stock! please try again!");
            }
            else {
                //creates and sets the mPerDay, difMil, and daysBetween variables.
                long mPerDay = 24 * 60 * 60 * 1000;
                long difMil = eDate.getTime() - sDate.getTime();
                long daysBetween = difMil / mPerDay + 1;
                
                //creates and executes a query that gets the id of the item matching the equipment name. then sets id to that value.
                query = "SELECT id FROM equipment WHERE name = ?;";
                pstmt = con.prepareStatement(query);
                pstmt.setString(1, equipment);
                rs = pstmt.executeQuery();
                rs.next();
                int ID = rs.getInt("id");
                
                //changes the start and end date to sql date values. creates the badDate and possible variables
                //and creates the currentRentals arraylist.
                java.sql.Date sqlSDate = new java.sql.Date(sDate.getTime());
                java.sql.Date sqlEDate = new java.sql.Date(eDate.getTime());
                java.sql.Date badDate = null;
                 boolean possible = true;
                ArrayList<Integer> currentRentals = new ArrayList<>();
                
                //creates and executes a query that gets start date, end date, and quantity of the row matching the equipment id.
                query = "SELECT startDate, endDate, quantity FROM rentals WHERE equipment_id = ?; ";
                pstmt = con.prepareStatement(query);
                pstmt.setInt(1, ID);
                rs = pstmt.executeQuery();
                
                //goes through the query and finds any entrys for the item being rented that have an start date before the
                //rental and an end date after the rental.
                while(rs.next()) {
                    java.sql.Date temp = rs.getDate("startDate");
                    java.sql.Date temp2 = rs.getDate("endDate");
                    temp2 = new java.sql.Date(temp2.getTime() + mPerDay);
                    int temp3 = rs.getInt("quantity"); 
                    if(temp.before(sqlSDate) && !temp2.before(sqlSDate)) {
                        currentRentals.add(temp3);
                    }
                }
                
                //enters the statement if quantity needs to be checked
                if(!checkedOverrideQuantity) {
                    //for loop that goes until each day of the rental has been checked.
                    for(int i = 0; i < daysBetween; i++) {
                        int temp = quantity;    //resets temp to quantity every loop
                    
                        //creates and executes a query that gets the quantity of the row matching the start date and equipment id
                        query = "SELECT quantity FROM rentals WHERE startDate = ? AND equipment_id = ?;";
                        pstmt = con.prepareStatement(query);
                        pstmt.setDate(1, sqlSDate);
                        pstmt.setInt(2, ID);
                        rs = pstmt.executeQuery();
                    
                        //if the query finds a row, it is added to the currentRental array.
                        while(rs.next()) {
                            int renQ = rs.getInt("quantity");
                            currentRentals.add(renQ);
                        }
                        
                        //if currentRentals has values, then the for loop is entered and temp is caculated.
                        for(int j = 0; j < currentRentals.size(); j++)  {
                            temp = temp - currentRentals.get(j);
                        }
                        temp = temp - quan; //removes the quantity the user wants from temp.
                    
                        //creates and executes a query that gets the quantity of the row matching the end date and equipment id
                        query = "SELECT quantity FROM rentals WHERE endDate = ? AND equipment_id = ?;";
                        pstmt = con.prepareStatement(query);
                        pstmt.setDate(1, sqlSDate);
                        pstmt.setInt(2, ID);
                        rs = pstmt.executeQuery();
                    
                        //if the query finds a row, it is removed from the currentRental array.
                        while(rs.next() && currentRentals.size() > 0) {
                            int renQ = rs.getInt("quantity");
                            currentRentals.remove(Integer.valueOf(renQ));
                        }
                    
                        //if temp is less than zero (meaning quantity is not avaliable), then possible is set to false,
                        //badDate is set to the current date, and the loop is broken.
                        if(temp < 0) {
                            possible = false;
                            badDate = sqlSDate;
                            break;
                        }
                    
                        sqlSDate = new java.sql.Date(sqlSDate.getTime() + mPerDay); //next day is set to sqlSDate
                    }
                }
                sqlSDate = new java.sql.Date(sDate.getTime());  //resets sqlSDate to the entered start date                
                 
                //entered if the order is possible
                if(possible) {
                    //creates and execites a query that gets all information needed for the recipt.
                    query = "SELECT e.manufacturer, e.description, e.rent_price, c.name, c.address, c.phone \n" +
                    "FROM equipment e, clients c WHERE client_id = ? AND id = ?;";
                    pstmt = con.prepareStatement(query);
                    pstmt.setInt(1, idNum);
                    pstmt.setInt(2, ID);
                    rs = pstmt.executeQuery();
                    
                    //sets data fields to the data from the query.
                    rs.next();
                    String rman = rs.getString("manufacturer");
                    String rdesc = rs.getString("description");
                    double rprice = rs.getDouble("rent_price");
                    String rname = rs.getString("name");
                    String radd = rs.getString("address");
                    String rphone = rs.getString("phone");
                    
                    //sets the new price of the item if the box was checked
                    if(checkedItemPrice) {
                        rprice = newItemPrice;
                    }
                    
                    double totalPrice = quan * daysBetween * rprice;    //finds and sets the total price.
                    
                    //caculates the new total price with the discount if the box was checked
                    if(checkedDiscount) {
                        double temp = totalPrice * discount;
                        totalPrice = totalPrice - temp;
                    }
                    //creates and execites a query that gets all rental ids.
                    query = "SELECT rental_id FROM Rentals;";
                    stmt = con.createStatement();
                    rs = stmt.executeQuery(query);
                    Random ran = new Random();
                    
                    //creates a new rental id and then makes sure it doesn't match a current rental id. If it does, creates a new one.
                    int newID = ran.nextInt(9000) + 1000;
                    while(rs.next()) {
                        int currentRID = rs.getInt("rental_id");
                        if(newID == currentRID) {
                            newID = ran.nextInt(9000) + 1000;
                            rs = stmt.executeQuery(query);
                        }
                    }
                    
                    //creates and executes a query that inserts all the data values into the rentals table, creating the rental.
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MedicalEquipment", "root","Love34#");
                    pstmt = con.prepareStatement("insert into rentals values (?,?,?,?,?,?,?,?)");
                    pstmt.setInt(1, newID);
                    pstmt.setInt(2, idNum);
                    pstmt.setInt(3, ID);
                    pstmt.setDate(4, sqlSDate);
                    pstmt.setDate(5, sqlEDate);
                    pstmt.setInt(6, quan);
                    pstmt.setDouble(7, totalPrice);
                    pstmt.setBoolean(8, false);
                    int i = pstmt.executeUpdate();
                    if(i < 0)
                        JOptionPane.showMessageDialog(null, "ERROR: New Rental Order Was Not Added!");
                    
                    //creates and shows a recipt to the user with all information.
                    JOptionPane.showMessageDialog(null, "Rental Equipment Order Recipt:\n"
                            + "Equipment: " + equipment + "\n"
                            + "Equipment ID: " + ID + "\n"
                            + "Manufacturer: " + rman + "\n"
                            + "Description: " + rdesc + "\n"
                            + "Rent Price: " + rprice + "\n"
                            + "Quantity in order: " + quan + "\n"
                            + "Rental ID: " + newID + "\n"
                            + "Cleint name: " + rname + "\n"
                            + "Client address: " + radd + "\n"
                            + "Cleint phone: " + rphone + "\n"
                            + "Cleint ID: " + idNum + "\n"
                            + "Comapny Address: 2004 Wolfhouse Street, St.Louis, MO\n"
                            + "Company Phone: (555)434-1234\n"
                            + "Company Email: WolfWoundedEquipmentSupport@gmail.com\n"
                            + "Start Date: " + sqlSDate + "\n"
                            + "End Date: " + sqlEDate + "\n"
                            + "Total Price: " + totalPrice + "\n"
                            + "To Send a payment check, call or email us through the infromation about or send it through mail to 2004 Wolfhouse Street, St.Louis, MO");
                    
                    }
                else {
                    java.sql.Date nextDate = null;  //creates the nextDate variable.
                    
                    sqlSDate = new java.sql.Date(badDate.getTime() + mPerDay);  //sets sqlSDate to a day past the badDate variable
                    for(int i = 0; i < 30; i++) {
                        int temp = quantity;    //resets temp to quantity every loop
                    
                        //creates and executes a query that gets the quantity of the row matching the start date and equipment id
                        query = "SELECT quantity FROM rentals WHERE startDate = ? AND equipment_id = ?;";
                        pstmt = con.prepareStatement(query);
                        pstmt.setDate(1, sqlSDate);
                        pstmt.setInt(2, ID);
                        rs = pstmt.executeQuery();
                    
                        //if the query finds a row, it is added to the currentRental array.
                        while(rs.next()) {
                            int renQ = rs.getInt("quantity");
                            currentRentals.add(renQ);
                        }
                    
                        //if currentRentals has values, then the for loop is entered and temp is caculated.
                        for(int j = 0; j < currentRentals.size(); j++)  {
                            temp = temp - currentRentals.get(j);
                        }
                        temp = temp - quan; //removes the quantity the user wants from temp.
                    
                        //creates and executes a query that gets the quantity of the row matching the end date and equipment id
                        query = "SELECT quantity FROM rentals WHERE endDate = ? AND equipment_id = ?;";
                        pstmt = con.prepareStatement(query);
                        pstmt.setDate(1, sqlSDate);
                        pstmt.setInt(2, ID);
                        rs = pstmt.executeQuery();
                    
                        //if the query finds a row, it is removed from the currentRental array.
                        while(rs.next() && currentRentals.size() > 0) {
                            int renQ = rs.getInt("quantity");
                            currentRentals.remove(Integer.valueOf(renQ));
                        }
                        
                        //if temp is less than zero (meaning quantity is not avaliable), then possible is set to false,
                        //badDate is set to the current date, and the loop is broken.
                        if(temp > -1) {
                            nextDate = sqlSDate;
                            break;
                        }
                        
                        sqlSDate = new java.sql.Date(sqlSDate.getTime() + mPerDay); //next day is set to sqlSDate
                    }
                    
                    //if a nextDate is found, it is displayed in the rejection message. This message tells the user what date
                    //quantity was overloaded and when the next avaliable date is.
                    if (nextDate != null) {
                    JOptionPane.showMessageDialog(null, "Unfourtently, there is a day in this period that we do not have\n"
                            + "enough of this item in stock! this day is: " + badDate + 
                            "\nThe next date after this that the item will be in stock with this quantity is: " + nextDate + "\n"
                                    + "You can rent the equipment before " + badDate + ", make a rental starting on " + nextDate + " or try a different time period!");
                    }
                    else {  //if no date is found, the message is edited to tell the user this.
                        JOptionPane.showMessageDialog(null, "Unfourtently, this quantity of items is not avaliable during this time period! \n"
                                + "There is not enough stock starting on " + badDate + "\n"
                                        + "There are no days after this in the next 30 days that this quantity is avaliable!");
                    }
                    
                }
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
                new TakeOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JCheckBox QuantityBox;
    private javax.swing.JButton RentButton;
    private javax.swing.JTextField clientIdData;
    private javax.swing.JCheckBox discountBox;
    private javax.swing.JTextField discountData;
    private com.toedter.calendar.JDateChooser endDate;
    private javax.swing.JTextField equipmentName;
    private javax.swing.JTextField equipmentName1;
    private javax.swing.JButton goBackButton;
    private javax.swing.JCheckBox itemPriceBox;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField newPriceData;
    private javax.swing.JTextField quanData;
    private com.toedter.calendar.JDateChooser startDate;
    // End of variables declaration                   
}
