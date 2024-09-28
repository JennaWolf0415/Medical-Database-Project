//Name: Jenna Wolf
//Class: CS 440-740, Database
//Professor: CS 440-740, Database
//project: Medical Equipment Rental Database Project
//file: clientInformation.java
//purpose: shows the manager all information about the client whose name is entered
package databaseproject;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;


public class clientInformation extends javax.swing.JFrame {

    public clientInformation() {
        initComponents();
        setDefaultCloseOperation(clientLogIn.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(235, 253, 235));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Banner", 1, 36)); // NOI18N
        jLabel1.setText("Enter the Clients Name:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 190, 50));

        jButton1.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        jButton1.setText("Get Client Information");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 210, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        try {
            String cname = name.getText();  //gets the text data from the user.
            
            //makes sure the text box isn't empty.
            if(cname == null || cname.isEmpty()) {
                JOptionPane.showMessageDialog(null, "ERROR: You need to provide s name!");
                return;
            }
                    
            //connects to the database
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MedicalEquipment", "root","Love34#");
            
            //creates and executes a query that gets the name, client id, and all equipment (and quantities) for the client that matches the name.
            String query = "SELECT c.name, c.address, c.phone, c.client_id, GROUP_CONCAT(CONCAT(e.name, ' (', r.quantity, ')') SEPARATOR ', ') AS rentals\n" +
            "FROM clients c\n" +
            "LEFT JOIN rentals r ON c.client_id = r.client_id\n" +
            "LEFT JOIN equipment e ON r.equipment_id = e.id\n" +
            "WHERE c.name = ?\n" +
            "GROUP BY c.name, c.client_id;";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, cname);
            ResultSet rs = stmt.executeQuery();
            
            //creates a new jframe for the table
            JFrame courseWindow = new JFrame("Specific Customer Information");
            courseWindow.setSize(1300, 500);
            JPanel data = new JPanel(new BorderLayout());
            courseWindow.add(data);
            
            //creates a table within the jframe with 5 columns
            JTable table = new JTable();
            DefaultTableModel window = new DefaultTableModel();
            window.addColumn("Client Name");
            window.addColumn("Address");
            window.addColumn("Phone");
            window.addColumn("Client ID");
            window.addColumn("Rented Equipment");
            
            //adds each entry as a row to the table.
            //then sets the table to the jframe window, adds the data and shows the table
            if(rs.next()) {        
                    String name = rs.getString("name");
                    String add = rs.getString("address");
                    String phone = rs.getString("phone");
                    int id = rs.getInt("client_ID");
                    String rentals = rs.getString("rentals");
                    window.addRow(new Object[]{name, add, phone, id, rentals});
                    
                    table.setModel(window);
                    JScrollPane scrollPane = new JScrollPane(table);
                    data.add(scrollPane, BorderLayout.CENTER);
                    courseWindow.setVisible(true);
            }
            else {  //gives an error message if no client is found.
                JOptionPane.showMessageDialog(null, "Error: No client under this name exists!");
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
                new clientInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField name;
    // End of variables declaration                   
}
