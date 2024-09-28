//Name: Jenna Wolf
//Class: CS 440-740, Database
//Professor: CS 440-740, Database
//project: Medical Equipment Rental Database Project
//file: updateInventory.java
//purpose: panel used for managers select the different tables in the database to update them.
package databaseproject;

public class updateInventory extends javax.swing.JFrame {

    public updateInventory() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        rentalTable = new javax.swing.JButton();
        equipmentTable = new javax.swing.JButton();
        suppliersTable = new javax.swing.JButton();
        stockTable = new javax.swing.JButton();
        clientsTable = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(235, 253, 235));
        jPanel2.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        jLabel1.setText("Pick which table you would like to edit");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Sitka Banner", 1, 36)); // NOI18N
        jLabel2.setText("Inventory Editor");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        backButton.setFont(new java.awt.Font("Sitka Banner", 1, 14)); // NOI18N
        backButton.setText("Go Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel2.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 100, 30));

        rentalTable.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        rentalTable.setText("Edit Rentals Table");
        rentalTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentalTableActionPerformed(evt);
            }
        });
        jPanel2.add(rentalTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 200, 50));

        equipmentTable.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        equipmentTable.setText("Edit Equipment Table");
        equipmentTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equipmentTableActionPerformed(evt);
            }
        });
        jPanel2.add(equipmentTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 200, 50));

        suppliersTable.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        suppliersTable.setText("Edit Suppliers Table");
        suppliersTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppliersTableActionPerformed(evt);
            }
        });
        jPanel2.add(suppliersTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 200, 50));

        stockTable.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        stockTable.setText("Edit Stock Table");
        stockTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockTableActionPerformed(evt);
            }
        });
        jPanel2.add(stockTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 200, 50));

        clientsTable.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        clientsTable.setText("Edit Clients Table");
        clientsTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientsTableActionPerformed(evt);
            }
        });
        jPanel2.add(clientsTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 200, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        new managerPage().setVisible(true); //starts the managerPage panel
        dispose();  //closes the current panel
    }                                          

    private void equipmentTableActionPerformed(java.awt.event.ActionEvent evt) {                                               
        new editEquipment().setVisible(true);   //starts the editEquipment panel
    }                                              

    private void suppliersTableActionPerformed(java.awt.event.ActionEvent evt) {                                               
        new editSuppliers().setVisible(true);   //starts the editSuppliers panel
    }                                              

    private void stockTableActionPerformed(java.awt.event.ActionEvent evt) {                                           
        new editStock().setVisible(true);   //starts the eidtStock panel
    }                                          

    private void clientsTableActionPerformed(java.awt.event.ActionEvent evt) {                                             
        new editClients().setVisible(true); //starts the editClients panel
    }                                            

    private void rentalTableActionPerformed(java.awt.event.ActionEvent evt) {                                            
        new editRentals().setVisible(true); //starts the editRentals panel
    }                                           

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateInventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton backButton;
    private javax.swing.JButton clientsTable;
    private javax.swing.JButton equipmentTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton rentalTable;
    private javax.swing.JButton stockTable;
    private javax.swing.JButton suppliersTable;
    // End of variables declaration                   
}
