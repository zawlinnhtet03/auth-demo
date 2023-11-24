package loginandsignup;

import javax.swing.ImageIcon;

public class LoginAndSignUp {
    public static void main(String[] args) {

        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null); 
        ImageIcon image = new ImageIcon("gartoon.png");
        LoginFrame.setIconImage(image.getImage());      
    }
    
}
