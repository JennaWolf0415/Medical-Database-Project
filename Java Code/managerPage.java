//Name: Jenna Wolf
//Class: CS 440-740, Database
//Professor: CS 440-740, Database
//project: Medical Equipment Rental Database Project
//file: managerPage.java
//purpose: panel used for managers to perform manager duties (add equipment, update inventory, take orders for clients,
//or view certain tables of information)
package databaseproject;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;
import java.util.*;

public class managerPage extends javax.swing.JFrame {

    public managerPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        DisplayProfitButton = new javax.swing.JButton();
        goBackButton = new javax.swing.JButton();
        updateInventoryButton = new javax.swing.JButton();
        takeOrderButton = new javax.swing.JButton();
        DisplayCusInfoButton1 = new javax.swing.JButton();
        DisplayAllCusInforButton1 = new javax.swing.JButton();
        DisplayCusHaventPaidButton = new javax.swing.JButton();
        DisplayPayButton = new javax.swing.JButton();
        addEquipmentButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        monthChooser = new com.toedter.calendar.JMonthChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(235, 253, 235));
        jPanel2.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        jLabel1.setText("Manager Page");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        DisplayProfitButton.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        DisplayProfitButton.setText("Display Profit Calculation");
        DisplayProfitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayProfitButtonActionPerformed(evt);
            }
        });
        jPanel2.add(DisplayProfitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 260, -1));

        goBackButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        goBackButton.setText("Back to Login");
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });
        jPanel2.add(goBackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, -1, -1));

        updateInventoryButton.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        updateInventoryButton.setText("Update the inventory Database");
        updateInventoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateInventoryButtonActionPerformed(evt);
            }
        });
        jPanel2.add(updateInventoryButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 280, 30));

        takeOrderButton.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        takeOrderButton.setText("Take an order");
        takeOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                takeOrderButtonActionPerformed(evt);
            }
        });
        jPanel2.add(takeOrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 170, -1));

        DisplayCusInfoButton1.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        DisplayCusInfoButton1.setText("Display Customer Information");
        DisplayCusInfoButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayCusInfoButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(DisplayCusInfoButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 290, -1));

        DisplayAllCusInforButton1.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        DisplayAllCusInforButton1.setText("Display All Customer Information");
        DisplayAllCusInforButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayAllCusInforButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(DisplayAllCusInforButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 320, -1));

        DisplayCusHaventPaidButton.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        DisplayCusHaventPaidButton.setText("Display Customers who have not paid");
        DisplayCusHaventPaidButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayCusHaventPaidButtonActionPerformed(evt);
            }
        });
        jPanel2.add(DisplayCusHaventPaidButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 380, -1));

        DisplayPayButton.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        DisplayPayButton.setText("Display paid payments");
        DisplayPayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayPayButtonActionPerformed(evt);
            }
        });
        jPanel2.add(DisplayPayButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 230, -1));

        addEquipmentButton.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        addEquipmentButton.setText("Add a Piece of Equipment");
        addEquipmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEquipmentButtonActionPerformed(evt);
            }
        });
        jPanel2.add(addEquipmentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 240, -1));

        jLabel2.setText("___________________________________________________");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 20));

        jLabel3.setFont(new java.awt.Font("Sitka Display", 1, 48)); // NOI18N
        jLabel3.setText("Options:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        jPanel2.add(monthChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        new LoginInterface().setVisible(true);  //starts the LoginInterface panel
        dispose();  //closes the current panel
    }                                            

    private void DisplayCusInfoButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        new clientInformation().setVisible(true);   //starts the clientInformation panel
    }                                                     

    private void takeOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        new TakeOrder().setVisible(true);//starts the takeOrder panel
        dispose();  //closes the current panel
    }                                               

    private void updateInventoryButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        new updateInventory().setVisible(true);//starts the updateInventory panel
        dispose();  //closes the current panel
    }                                                     

    private void DisplayAllCusInforButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        try {
            //connects to the database
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MedicalEquipment", "root","Love34#");
            
            //creates and executes a query that gets the name, client id, and all equipment (and quantities) a client currently has a rental for
            String query = "SELECT c.name, c.client_id, GROUP_CONCAT(CONCAT(e.name, ' (', r.quantity, ')') SEPARATOR ', ') AS rentals\n" +
            "FROM clients c\n" +
            "LEFT JOIN rentals r ON c.client_id = r.client_id\n" +
            "LEFT JOIN equipment e ON r.equipment_id = e.id\n" +
            "GROUP BY c.name, c.client_id;";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            //creates a new jframe for the table
            JFrame courseWindow = new JFrame("Customer Information");
            courseWindow.setSize(1000, 500);
            JPanel data = new JPanel(new BorderLayout());
            courseWindow.add(data);
            
            //creates a table within the jframe with 3 columns
            JTable table = new JTable();
            DefaultTableModel window = new DefaultTableModel();
            window.addColumn("Client ID");
            window.addColumn("Client Name");
            window.addColumn("Rented Equipment");
            
                
            //adds each entry as a row to the table.
            while (rs.next()) {
                int id = rs.getInt("client_ID");
                String name = rs.getString("name");
                String rentals = rs.getString("rentals");
                window.addRow(new Object[]{id, name, rentals});
            }
            
            //sets the table to the jframe window, adds the data and shows the table
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

    private void DisplayCusHaventPaidButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                           
        try {
            //connects to the database
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MedicalEquipment", "root","Love34#");
            
            //creates and executes a query that gets the names of clients who have not paid their rentals 
            String query = "SELECT DISTINCT clients.name\n" +
            "FROM rentals, clients\n" +
            "WHERE rentals.paid = false AND rentals.client_id = clients.client_id;";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            //creates a new jframe for the table
            JFrame courseWindow = new JFrame("Hasn't Paid There Pending Amount");
            courseWindow.setSize(1000, 500);
            JPanel data = new JPanel(new BorderLayout());
            courseWindow.add(data);
            
            //creates a table within the jframe with 1 column
            JTable table = new JTable();
            DefaultTableModel window = new DefaultTableModel();
            window.addColumn("Client Name");
            
                  
            //adds each entry as a row to the table.
            while (rs.next()) {
                String name = rs.getString("name");
                window.addRow(new Object[]{name});
            }
            
            //sets the table to the jframe window, adds the data and shows the table
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

    private void DisplayPayButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        try {
            //connects to the database
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MedicalEquipment", "root","Love34#");
            
            //creates and executes a query that gets the name, client id, and all equipment (and quantities) a client currently has a rental for
            String query = "SELECT * FROM rentals WHERE paid = true;";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            //creates a new jframe for the table
            JFrame courseWindow = new JFrame("Paid Orders");
            courseWindow.setSize(1000, 500);
            JPanel data = new JPanel(new BorderLayout());
            courseWindow.add(data);
            
            //creates a table within the jframe with 8 columns
            JTable table = new JTable();
            DefaultTableModel window = new DefaultTableModel();
            window.addColumn("Rental Number");
            window.addColumn("Client ID");
            window.addColumn("Equipment ID");
            window.addColumn("Start Date");
            window.addColumn("End Date");
            window.addColumn("Quantity");
            window.addColumn("Total Amount");
            window.addColumn("Paid");
            
               
            //adds each entry as a row to the table.
            while (rs.next()) {
                int rental = rs.getInt("Rental_id");
                int client = rs.getInt("client_id");
                int equip = rs.getInt("equipment_id");
                java.sql.Date start = rs.getDate("startDate");
                java.sql.Date end = rs.getDate("endDate");
                int quan = rs.getInt("quantity");
                Double total = rs.getDouble("totalPrice");
                String paid = "True";
                window.addRow(new Object[]{rental, client, equip, start, end, quan, total, paid});
            }
            
            //sets the table to the jframe window, adds the data and shows the table
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

    private void DisplayProfitButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        try {
            int month = monthChooser.getMonth() + 1;
        
            //connects to the database
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MedicalEquipment", "root","Love34#");
            
            //creates and executes a query that gets the total price and month of a start date
            String query = "SELECT totalPrice, MONTH(startDate) AS month FROM rentals;";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            //creates the current, price, and profit values;
            int current = 0;
            double price = 0;
            double profit = 0;
            
            //while loop that goes through all the months recieved from the query. If the rental start date matches
            //the month selection, then the price of that order is added to profit.
            while(rs.next()) {
                current = rs.getInt("month");
                if(current == month) {
                    price = rs.getDouble("totalPrice");
                    profit += price;
                }
            }
            
            //creates the monthlyExpenses value and sets it to a random number between 3000 and 5000
            //(randomly generates the monthly expenses for the company). then formats it.
            Random ran = new Random();
            double monthlyExpenses = 3000 + (ran.nextDouble() * 2000);
            String format = String.format("%.2f", monthlyExpenses);
            monthlyExpenses = Double.parseDouble(format);
            
            //finds the profit amount then formats it.
            double profitCalc = profit - monthlyExpenses;
            format = String.format("%.2f", profitCalc);
            profitCalc = Double.parseDouble(format);
            
            //displays to the user the monthly profit, monthly expenses, and the profit caculation.
            JOptionPane.showMessageDialog(null, "Monthly Profit: $" + profit
                    + "\nMonthly Expenses: $" + monthlyExpenses + 
                    "\nProfit Calculation: $" + profitCalc);
            
            
        }
        catch (Exception e) {
            //sends an error message to the consol if error occurs
            System.out.println("SQL select operation has been failed: " + e);
        }
    }                                                   

    private void addEquipmentButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        new addEquipment().setVisible(true);    //starts the addEquipment panel
    }                                                  

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new managerPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton DisplayAllCusInforButton1;
    private javax.swing.JButton DisplayCusHaventPaidButton;
    private javax.swing.JButton DisplayCusInfoButton1;
    private javax.swing.JButton DisplayPayButton;
    private javax.swing.JButton DisplayProfitButton;
    private javax.swing.JButton addEquipmentButton;
    private javax.swing.JButton goBackButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private com.toedter.calendar.JMonthChooser monthChooser;
    private javax.swing.JButton takeOrderButton;
    private javax.swing.JButton updateInventoryButton;
    // End of variables declaration                   
}
