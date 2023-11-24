package loginandsignup;

//import com.sun.jdi.connect.spi.Connection;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.*;

public class SignUp extends javax.swing.JFrame {

     public SignUp() {
        initComponents();
        password.setEchoChar('*');   
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        SignUpBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        showPass = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign Up");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jLabel2.setFont(new java.awt.Font("Felix Titling", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Company Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("copyright © company name All rights reserved");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel2)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(64, 64, 64))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 400, 500);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setBackground(new java.awt.Color(0, 102, 102));
        jLabel4.setFont(new java.awt.Font("MV Boli", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("SIGN UP");

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Full name");

        fname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fname.setForeground(new java.awt.Color(102, 102, 102));
        fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fnameKeyPressed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Email Address");

        email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(102, 102, 102));
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emailKeyPressed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Password");

        password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        password.setForeground(new java.awt.Color(102, 102, 102));
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Already have an account");

        SignUpBtn.setBackground(new java.awt.Color(53, 153, 255));
        SignUpBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SignUpBtn.setForeground(new java.awt.Color(255, 255, 255));
        SignUpBtn.setText("Sign Up");
        SignUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpBtnActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 153, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Sign In");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        showPass.setBackground(new java.awt.Color(255, 255, 255));
        showPass.setForeground(new java.awt.Color(0, 0, 0));
        showPass.setText("Show Password");
        showPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(fname)
                            .addComponent(jLabel6)
                            .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                            .addComponent(jLabel7)
                            .addComponent(password)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(SignUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(showPass)
                                .addGap(12, 12, 12))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addGap(29, 29, 29)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SignUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(showPass)))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(400, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Login LoginFrame = new Login();
        ImageIcon image = new ImageIcon("gartoon.png");
        LoginFrame.setIconImage(image.getImage());
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null); 
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    // Action event handling
    private void SignUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpBtnActionPerformed
       
        // User input retrieval
        String fullName = fname.getText();
        String userEmail = email.getText();
        String userPassword = new String(password.getPassword());

        // Database connection information
        String dbUrl = "jdbc:mysql://localhost:3306/java_user_database";
        String dbUser = "root";
        String dbPassword = "";

        try {
            // Register the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the database connection
            Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
            
            // Statement st = con.createStatement();
            
            // Check if full name is provided
            if (fullName.isEmpty()) {
                JOptionPane.showMessageDialog(new JFrame(), "Full name is required", "Error", JOptionPane.ERROR_MESSAGE);
                fname.requestFocusInWindow();
            } else if (userEmail.isEmpty()) {
                JOptionPane.showMessageDialog(new JFrame(), "Email is required", "Error", JOptionPane.ERROR_MESSAGE);
                email.requestFocusInWindow();
            } else if (userPassword.isEmpty()) {
                JOptionPane.showMessageDialog(new JFrame(), "Password is required", "Error", JOptionPane.ERROR_MESSAGE);
                password.requestFocusInWindow();
            } else {
                
                // Parameterized SQL query to retrieve user data based on provided data
                String query =  "INSERT INTO user(full_name, email, password) VALUES (?, ?, ?)";
                
                // Prepare statement for the SQL query, replacing placeholders with actual values
                try (PreparedStatement pst = con.prepareStatement(query)) {
                    pst.setString(1, fullName);
                    pst.setString(2, userEmail);
                    pst.setString(3, userPassword);
                    pst.executeUpdate();
                    
                    fname.setText("");
                    email.setText("");
                    password.setText("");
                    JOptionPane.showMessageDialog(null, "New account has been created sucessfully!");
                }
            }
           // Close the database connection
           // con.close();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(new JFrame(), "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_SignUpBtnActionPerformed

    private void showPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPassActionPerformed
       
        if (showPass.isSelected()) {
            password.setEchoChar((char) 0);
        }
        else {
            password.setEchoChar('*');
        }
    }//GEN-LAST:event_showPassActionPerformed

    private void fnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           // User input retrieval
            String fullName = fname.getText();
            String userEmail = email.getText();
            String userPassword = new String(password.getPassword());

            // Database connection information
            String dbUrl = "jdbc:mysql://localhost:3306/java_user_database";
            String dbUser = "root";
            String dbPassword = "";

            try {
                // Register the MySQL JDBC driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Establish the database connection
                Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);

                // Statement st = con.createStatement();

                // Check if full name is provided
                if (fullName.isEmpty()) {
                    JOptionPane.showMessageDialog(new JFrame(), "Full name is required", "Error", JOptionPane.ERROR_MESSAGE);
                    fname.requestFocusInWindow();
                } else if (userEmail.isEmpty()) {
                    email.requestFocusInWindow();
                } else {

                    // Parameterized SQL query to retrieve user data based on provided data
                    String query =  "INSERT INTO user(full_name, email, password) VALUES (?, ?, ?)";

                    // Prepare statement for the SQL query, replacing placeholders with actual values
                    try (PreparedStatement pst = con.prepareStatement(query)) {
                        pst.setString(1, fullName);
                        pst.setString(2, userEmail);
                        pst.setString(3, userPassword);
                        pst.executeUpdate();

                        fname.setText("");
                        email.setText("");
                        password.setText("");
                        JOptionPane.showMessageDialog(null, "New account has been created sucessfully!");
                    }
                }
               // Close the database connection
               // con.close();
            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(new JFrame(), "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } 
        }
    }//GEN-LAST:event_fnameKeyPressed

    private void emailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           // User input retrieval
            String fullName = fname.getText();
            String userEmail = email.getText();
            String userPassword = new String(password.getPassword());

            // Database connection information
            String dbUrl = "jdbc:mysql://localhost:3306/java_user_database";
            String dbUser = "root";
            String dbPassword = "";

            try {
                // Register the MySQL JDBC driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Establish the database connection
                Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);

                // Statement st = con.createStatement();

                // Check if full name is provided
                if (fullName.isEmpty()) {
                    JOptionPane.showMessageDialog(new JFrame(), "Full name is required", "Error", JOptionPane.ERROR_MESSAGE);
                    fname.requestFocusInWindow();
                } else if (userEmail.isEmpty()) {
                    JOptionPane.showMessageDialog(new JFrame(), "Email is required", "Error", JOptionPane.ERROR_MESSAGE);
                    email.requestFocusInWindow();
                } else if (userPassword.isEmpty()) {
                    password.requestFocusInWindow();
                } else {

                    // Parameterized SQL query to retrieve user data based on provided data
                    String query =  "INSERT INTO user(full_name, email, password) VALUES (?, ?, ?)";

                    // Prepare statement for the SQL query, replacing placeholders with actual values
                    try (PreparedStatement pst = con.prepareStatement(query)) {
                        pst.setString(1, fullName);
                        pst.setString(2, userEmail);
                        pst.setString(3, userPassword);
                        pst.executeUpdate();

                        fname.setText("");
                        email.setText("");
                        password.setText("");
                        JOptionPane.showMessageDialog(null, "New account has been created sucessfully!");
                    }
                }
               // Close the database connection
               // con.close();
            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(new JFrame(), "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } 
        }      
    }//GEN-LAST:event_emailKeyPressed

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
             // User input retrieval
            String fullName = fname.getText();
            String userEmail = email.getText();
            String userPassword = new String(password.getPassword());

            // Database connection information
            String dbUrl = "jdbc:mysql://localhost:3306/java_user_database";
            String dbUser = "root";
            String dbPassword = "";

            try {
                // Register the MySQL JDBC driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Establish the database connection
                Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);

                // Statement st = con.createStatement();

                // Check if full name is provided
                if (fullName.isEmpty()) {
                    JOptionPane.showMessageDialog(new JFrame(), "Full name is required", "Error", JOptionPane.ERROR_MESSAGE);
                    fname.requestFocusInWindow();
                } else if (userEmail.isEmpty()) {
                    JOptionPane.showMessageDialog(new JFrame(), "Email is required", "Error", JOptionPane.ERROR_MESSAGE);
                    email.requestFocusInWindow();
                } else if (userPassword.isEmpty()) {
                    JOptionPane.showMessageDialog(new JFrame(), "Password is required", "Error", JOptionPane.ERROR_MESSAGE);
                    password.requestFocusInWindow();
                } else {

                    // Parameterized SQL query to retrieve user data based on provided data
                    String query =  "INSERT INTO user(full_name, email, password) VALUES (?, ?, ?)";

                    // Prepare statement for the SQL query, replacing placeholders with actual values
                    try (PreparedStatement pst = con.prepareStatement(query)) {
                        pst.setString(1, fullName);
                        pst.setString(2, userEmail);
                        pst.setString(3, userPassword);
                        pst.executeUpdate();

                        fname.setText("");
                        email.setText("");
                        password.setText("");
                        JOptionPane.showMessageDialog(null, "New account has been created sucessfully!");
                    }
                }
               // Close the database connection
               // con.close();
            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(new JFrame(), "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_passwordKeyPressed
    
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SignUpBtn;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField password;
    private javax.swing.JCheckBox showPass;
    // End of variables declaration//GEN-END:variables
}
