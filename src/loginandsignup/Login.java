package loginandsignup;

import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.*;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Zaw Linn Htet
 */

public class Login extends javax.swing.JFrame {
 
    public Login() {
        initComponents();
        password.setEchoChar('*');  
        setIcon(); // Call the setIcon method to set the frame icon
        setTitle("Sorting Visualizer");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Left = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        LoginBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        showPass = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        Right.setBackground(new java.awt.Color(102, 153, 255));
        Right.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/ffff.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Sorting Visualizer");

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightLayout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addGap(20, 20, 20))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel7)
                .addGap(65, 65, 65)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(Right);
        Right.setBounds(0, 0, 400, 500);

        Left.setBackground(new java.awt.Color(255, 255, 255));
        Left.setMinimumSize(new java.awt.Dimension(400, 500));

        jLabel1.setFont(new java.awt.Font("Candara Light", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Sign in");

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Email");

        email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(102, 102, 102));
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emailKeyPressed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Password");

        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });

        LoginBtn.setBackground(new java.awt.Color(102, 153, 255));
        LoginBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LoginBtn.setForeground(new java.awt.Color(255, 255, 255));
        LoginBtn.setText("Sign In");
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Don't have an account?");

        jButton2.setBackground(new java.awt.Color(102, 153, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Sign Up");
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

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(showPass)
                .addGap(37, 37, 37))
            .addGroup(LeftLayout.createSequentialGroup()
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(email)
                                .addComponent(jLabel3)
                                .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                                .addComponent(LoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(LeftLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel1)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jButton2))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jPanel1.add(Left);
        Left.setBounds(400, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
              
        SignUp SignUpFrame = new SignUp();
        SignUpFrame.setVisible(true);
        SignUpFrame.pack();
        SignUpFrame.setLocationRelativeTo(null); 
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void showPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPassActionPerformed
        
        if (showPass.isSelected()) {
            password.setEchoChar((char) 0);
        }
        else {
            password.setEchoChar('*');
        }
    }//GEN-LAST:event_showPassActionPerformed

    // Action event handling
    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
        // User input retrieval
        String userEmail = email.getText();
        String userPassword = new String(password.getPassword());

        // Database connection information
        String dbUrl = "jdbc:mysql://localhost:3306/java_user_database";
        String dbUser = "root";
        String dbPassword = "";
        
        String hashedPasswordFromDB = null;
        String fullName = null;
        
        try {
            // Register the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection the the MySQL database
            Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);

            if (userEmail.isEmpty()) {
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

                // Parameterized SQL query to retrieve user data based on provided data
                String query = "SELECT password, full_name FROM user WHERE email = ?";

                // Prepare statement for the SQL query, replacing placeholders with actual values
                try (PreparedStatement pst = con.prepareStatement(query)) {
                    pst.setString(1, userEmail);

                    // Executes the query & retrieve the result set
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {
                        hashedPasswordFromDB = rs.getString("password");
                        fullName = rs.getString("full_name");
                    }

                    // Use BCrypt to verify the entered password
                    if (hashedPasswordFromDB != null && BCrypt.checkpw(userPassword, hashedPasswordFromDB)) {
                        // Passwords match, user is authenticated
                        Home homeFrame = new Home();
                        homeFrame.setUser(fullName);
                        homeFrame.setVisible(true);
                        homeFrame.pack();
                        homeFrame.setLocationRelativeTo(null);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(new JFrame(), "Incorrect email or password", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                    password.setText("");
                }
            }           
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(new JFrame(), "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_LoginBtnActionPerformed

    // Email field enter function
    private void emailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyPressed
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
             String userEmail = email.getText();
                      
            if (userEmail.isEmpty()) {
                JOptionPane.showMessageDialog(new JFrame(), "Email is required", "Error", JOptionPane.ERROR_MESSAGE);
                email.requestFocusInWindow();
            } else if (!userEmail.contains("@")) {
                JOptionPane.showMessageDialog(new JFrame(), "Invalid email format. Please include '@'", "Error", JOptionPane.ERROR_MESSAGE);
                email.requestFocusInWindow();
            } else {
                password.requestFocusInWindow();
            }
        }
    }//GEN-LAST:event_emailKeyPressed

    // Passowrd field enter function
    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            // User input retrieval
            String userEmail = email.getText();
            String userPassword = new String(password.getPassword());

            // Database connection information
            String dbUrl = "jdbc:mysql://localhost:3306/java_user_database";
            String dbUser = "root";
            String dbPassword = "";

            String hashedPasswordFromDB = null;
            String fullName = null;

            try {
                // Register the MySQL JDBC driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Establish a connection the the MySQL database
                Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPassword);

                if (userEmail.isEmpty()) {
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

                    // Parameterized SQL query to retrieve user data based on provided data
                    String query = "SELECT password, full_name FROM user WHERE email = ?";

                    // Prepare statement for the SQL query, replacing placeholders with actual values
                    try (PreparedStatement pst = con.prepareStatement(query)) {
                        pst.setString(1, userEmail);                       

                        // Executes the query & retrieve the result set
                        ResultSet rs = pst.executeQuery();

                        if (rs.next()) {
                            hashedPasswordFromDB = rs.getString("password");
                            fullName = rs.getString("full_name");
                        }

                        // Use BCrypt to verify the entered password
                        if (hashedPasswordFromDB != null && BCrypt.checkpw(userPassword, hashedPasswordFromDB)) {
                            // Passwords match, user is authenticated
                            Home homeFrame = new Home();
                            homeFrame.setUser(fullName);
                            homeFrame.setVisible(true);
                            homeFrame.pack();
                            homeFrame.setLocationRelativeTo(null);
                            this.dispose();
                        } else {
                            JOptionPane.showMessageDialog(new JFrame(), "Incorrect email or password", "Error", JOptionPane.ERROR_MESSAGE);
                        }

                        password.setText("");
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
    private javax.swing.JPanel Left;
    private javax.swing.JButton LoginBtn;
    private javax.swing.JPanel Right;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField password;
    private javax.swing.JCheckBox showPass;
    // End of variables declaration//GEN-END:variables
    
    private void setIcon() {
        // Assuming "icon.png" is the name of your image file
        ImageIcon icon = new ImageIcon(getClass().getResource("gartoon.png"));
        setIconImage(icon.getImage());
    }
}
