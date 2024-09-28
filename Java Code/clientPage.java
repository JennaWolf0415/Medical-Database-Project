//Name: Jenna Wolf
//Class: CS 440-740, Database
//Professor: CS 440-740, Database
//project: Medical Equipment Rental Database Project
//file: clientPage.java
//purpose: panel used for clients to view equipment and make rental orders

package databaseproject;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class clientPage extends javax.swing.JFrame {
    int idNum;  //holds the id num from the last page (so we know what user is logged in)
    
    public clientPage(int idNum) {
        this.idNum = idNum;
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rentEquipmentButton = new javax.swing.JButton();
        goBackButton = new javax.swing.JButton();
        ViewEquipment1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(253, 227, 227));
        jPanel2.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        jLabel1.setText("Client Page");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        rentEquipmentButton.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        rentEquipmentButton.setText("Rent a Piece of Equipment");
        rentEquipmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentEquipmentButtonActionPerformed(evt);
            }
        });
        jPanel2.add(rentEquipmentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 280, 50));

        goBackButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        goBackButton.setText("Back to Login");
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });
        jPanel2.add(goBackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, -1, -1));

        ViewEquipment1.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        ViewEquipment1.setText("View All Equipment For Rent");
        ViewEquipment1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewEquipment1ActionPerformed(evt);
            }
        });
        jPanel2.add(ViewEquipment1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 280, 50));

        jLabel2.setFont(new java.awt.Font("Sitka Display", 1, 48)); // NOI18N
        jLabel2.setText("Options:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        new LoginInterface().setVisible(true);  //starts the LoginInterface panel
        dispose();  //closes the current panel
    }                                            

    private void ViewEquipment1ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        try {
            //connects to the database and executes a query to get name and description from the equipment table
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MedicalEquipment", "root","Love34#");
            String Equipment = "SELECT name, description FROM equipment;";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(Equipment);
            
            //creates a new jframe for the table
            JFrame courseWindow = new JFrame("Equipment");
            courseWindow.setSize(1000, 500);
            JPanel data = new JPanel(new BorderLayout());
            courseWindow.add(data);
            
            //creates a table within the jframe with 2 columns
            JTable table = new JTable();
            DefaultTableModel window = new DefaultTableModel();
            window.addColumn("Equipment Name");
            window.addColumn("Description");
            
            
            //adds each entry as a row to the table. Also formats it so the description doesn't run off the side
            while (rs.next()) {
                String name = rs.getString("name");
                String description = rs.getString("description");
                description = "<html><body style='width: 300px'>" + description + "</body></html>";
                window.addRow(new Object[]{name, description});
            }
            
            //sets the table to the jframe window
            table.setModel(window);
            
            //makes the rows long enough vertically for the entire description to be seen
            for (int row = 0; row < table.getRowCount(); row++) {
                int maxRowHeight = table.getRowHeight();
                for (int column = 0; column < table.getColumnCount(); column++) {
                    String cellText = table.getValueAt(row, column).toString();
                    int lines = cellText.length() / 45 + 1; // assuming approx. 30 characters per line
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

    private void rentEquipmentButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        new ClientRental(idNum).setVisible(true);   //starts the ClientRental panel
        dispose();  //closes the current panel
    }                                                   

    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton ViewEquipment1;
    private javax.swing.JButton goBackButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton rentEquipmentButton;
    // End of variables declaration                   
}
