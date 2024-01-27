package loginandsignup;

import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.*;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Zaw Linn Htet
 */

public class SignUp extends javax.swing.JFrame {

     public SignUp() {
        initComponents();
        password.setEchoChar('*'); 
        setIcon();
        setTitle("Sorting Visualizer");
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
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
        jLabel10 = new javax.swing.JLabel();

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("SIGN IN");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign Up");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/ffff.png"))); // NOI18N
        jLabel3.setText("h");

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Sorting Visualizer");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(389, 389, 389)
                .addComponent(jLabel1)
                .addContainerGap(11, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addGap(527, 527, 527)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 400, 500);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

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

        SignUpBtn.setBackground(new java.awt.Color(102, 153, 255));
        SignUpBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SignUpBtn.setForeground(new java.awt.Color(255, 255, 255));
        SignUpBtn.setText("Sign Up");
        SignUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpBtnActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 153, 255));
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

        jLabel10.setFont(new java.awt.Font("Candara Light", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Sign up");

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
                        .addGap(135, 135, 135)
                        .addComponent(jLabel10)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
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

        // Hash the password using BCrypt
        String hashedPassword = BCrypt.hashpw(userPassword, BCrypt.gensalt());
        
        // Database connection information
        String dbUrl = "jdbc:mysql://localhost:3306/java_user_database";
        String dbUser = "root";
        String dbPassword = "";

        try (Connection con = establishConnection()) {
            // Register the MySQL JDBC driver
            //Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the database connection
            //Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);

            // Check if full name is provided
            if (fullName.isEmpty()) {
                JOptionPane.showMessageDialog(new JFrame(), "Full name is required", "Error", JOptionPane.ERROR_MESSAGE);
                fname.requestFocusInWindow();
            } else if (userEmail.isEmpty()) {
                JOptionPane.showMessageDialog(new JFrame(), "Email is required", "Error", JOptionPane.ERROR_MESSAGE);
                email.requestFocusInWindow();
            } else if (!userEmail.contains("@")) {
                JOptionPane.showMessageDialog(new JFrame(), "Invalid email format. Please include '@'", "Error", JOptionPane.ERROR_MESSAGE);
                email.requestFocusInWindow();
            } else if (userPassword.isEmpty()) {
                JOptionPane.showMessageDialog(new JFrame(), "Password is required", "Error", JOptionPane.ERROR_MESSAGE);
                password.requestFocusInWindow();
            } else if (userPassword.length() < 8) {
                JOptionPane.showMessageDialog(new JFrame(), "Password must be at least eight characters long", "Error", JOptionPane.ERROR_MESSAGE);
                password.requestFocusInWindow();
            } else {
                // Check if the user already exists in the database
                String checkQuery = "SELECT * FROM user WHERE email=?";
                try (PreparedStatement checkStmt = con.prepareStatement(checkQuery)) {
                    checkStmt.setString(1, userEmail);
                    ResultSet resultSet = checkStmt.executeQuery();

                    if (resultSet.next()) {
                        // User already exists
                        JOptionPane.showMessageDialog(new JFrame(), "User with this email already exists", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        // User does not exist, proceed with registration
                        String insertQuery =  "INSERT INTO user(full_name, email, password) VALUES (?, ?, ?)";

                        try (PreparedStatement insertStmt = con.prepareStatement(insertQuery)) {
                            insertStmt.setString(1, fullName);
                            insertStmt.setString(2, userEmail);
                            insertStmt.setString(3, hashedPassword);
                            insertStmt.executeUpdate();

                            fname.setText("");
                            email.setText("");
                            password.setText("");
                            JOptionPane.showMessageDialog(null, "New account has been created successfully!");
                        }
                    }
                }
            }          
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
            String fullName = fname.getText();
            
            if (fullName.isEmpty()) {
                JOptionPane.showMessageDialog(new JFrame(), "Full name is required", "Error", JOptionPane.ERROR_MESSAGE);
                fname.requestFocusInWindow();
            } else {
                email.requestFocusInWindow();
            }
        }
    }//GEN-LAST:event_fnameKeyPressed

    private void emailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try (Connection con = establishConnection()) {
                String userEmail = email.getText();
           
                if (userEmail.isEmpty()) {
                    JOptionPane.showMessageDialog(new JFrame(), "Email is required", "Error", JOptionPane.ERROR_MESSAGE);
                    email.requestFocusInWindow();
                } else if (!userEmail.contains("@")) {
                    JOptionPane.showMessageDialog(new JFrame(), "Invalid email format. Please include '@'", "Error", JOptionPane.ERROR_MESSAGE);
                    email.requestFocusInWindow();
                } else {
                    String checkQuery = "SELECT * FROM user WHERE email=?";
                    
                    try (PreparedStatement checkStmt = con.prepareStatement(checkQuery)) {
                        checkStmt.setString(1, userEmail);
                        ResultSet resultSet = checkStmt.executeQuery();

                        if (resultSet.next()) {
                            // User already exists
                            JOptionPane.showMessageDialog(new JFrame(), "User with this email already exists", "Error", JOptionPane.ERROR_MESSAGE);
                        } else {
                            password.requestFocusInWindow();
                        }
                    }
                }
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

            // Hash the password using BCrypt
            String hashedPassword = BCrypt.hashpw(userPassword, BCrypt.gensalt());

            try (Connection con = establishConnection()) {
                if (userPassword.isEmpty()) {
                    JOptionPane.showMessageDialog(new JFrame(), "Password is required", "Error", JOptionPane.ERROR_MESSAGE);
                    password.requestFocusInWindow();
                } else if (userPassword.length() < 8) {
                    JOptionPane.showMessageDialog(new JFrame(), "Password must be at least eight characters long", "Error", JOptionPane.ERROR_MESSAGE);
                    password.requestFocusInWindow();
                } else {
                    String insertQuery =  "INSERT INTO user(full_name, email, password) VALUES (?, ?, ?)";

                    try (PreparedStatement insertStmt = con.prepareStatement(insertQuery)) {
                        insertStmt.setString(1, fullName);
                        insertStmt.setString(2, userEmail);
                        insertStmt.setString(3, hashedPassword);
                        insertStmt.executeUpdate();

                        fname.setText("");
                        email.setText("");
                        password.setText("");
                        JOptionPane.showMessageDialog(null, "New account has been created successfully!");
                    }
                }          
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField password;
    private javax.swing.JCheckBox showPass;
    // End of variables declaration//GEN-END:variables
    
    private void setIcon() {
        // Assuming "icon.png" is the name of your image file
        ImageIcon icon = new ImageIcon(getClass().getResource("gartoon.png"));
        setIconImage(icon.getImage());
    }
    
    // Add a method for database connection
    private Connection establishConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/java_user_database", "root", "");
    }
}
