//Name: Jenna Wolf
//Class: CS 440-740, Database
//Professor: CS 440-740, Database
//project: Medical Equipment Rental Database Project
//file: LoginInterface.java
//purpose: first jpanel for the project, shows the user the name of the store and gives two login in options: client and manager
package databaseproject;

public class LoginInterface extends javax.swing.JFrame {

    public LoginInterface() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ClientLogInButton = new javax.swing.JButton();
        ManagerLogInButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(204, 204, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(234, 234, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sitka Display", 2, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Wolf's Wounded Equipment");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        ClientLogInButton.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        ClientLogInButton.setForeground(new java.awt.Color(0, 153, 153));
        ClientLogInButton.setText("Client Log In");
        ClientLogInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientLogInButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ClientLogInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 210, 52));

        ManagerLogInButton.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        ManagerLogInButton.setForeground(new java.awt.Color(0, 153, 153));
        ManagerLogInButton.setText("Manager Log In");
        ManagerLogInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManagerLogInButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ManagerLogInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 206, 52));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/databaseproject/output-onlinepngtools__1_-removebg-preview (1).png"))); // NOI18N
        jLabel4.setText("jLabel");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 290, 220));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/databaseproject/output-onlinepngtools__1_-removebg-preview (1).png"))); // NOI18N
        jLabel5.setText("jLabel");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 90, 290, 220));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 831, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void ClientLogInButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        new clientLogIn().setVisible(true); //starts the clientLogIn panel
        dispose();  //gets rid of the current panel
    }                                                 

    private void ManagerLogInButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        new managerLogIn().setVisible(true);    //starts the managerLogIn panel
        dispose();  //gets rid of the current panel
    }                                                  

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton ClientLogInButton;
    private javax.swing.JButton ManagerLogInButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration                   
}
