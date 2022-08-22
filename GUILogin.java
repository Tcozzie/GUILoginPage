/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gui.login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author tiegancozzie
 */
public class GUILogin implements ActionListener{
    
    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel buttonOut;
    
    public static void main(String[] args) {
        JPanel panel=new JPanel(); // Creates a Box to put over a frame
        JFrame frame=new JFrame("Nuclear Missile Access"); // Creates a box that everything will go inside
        frame.setSize(350,200); // Changes the size of the window 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Closes/ends the program when exiting out of window
        frame.setResizable(false); // prevents frame from being resized
        frame.add(panel); // adds the panel box over the frame window
        panel.setLayout(null); // panel layout has default setting as "Flow"
        
        ImageIcon image=new ImageIcon("missile.png"); // Create an image icon
        frame.setIconImage(image.getImage()); //Change icon of frame
        
        
        
        userLabel=new JLabel("User Name:"); 
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);
        
        userText=new JTextField();
        userText.setBounds(95,20,165,25);
        panel.add(userText);
        
        passwordLabel=new JLabel("Password:");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);
        
        passwordText=new JPasswordField();
        passwordText.setBounds(95,50,165,25);
        panel.add(passwordText);
        
        button=new JButton("Login");
        button.setBounds(10,80,80,25);
        button.addActionListener((java.awt.event.ActionListener) new GUILogin());
        panel.add(button);
        
        buttonOut=new JLabel();
        buttonOut.setBounds(10,110,300,25);
        panel.add(buttonOut);
        
        
        frame.setVisible(true);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user=userText.getText();
        String password=passwordText.getText();
        
        if(user.equals("Boss") && password.equals("asdf1234")){
            buttonOut.setText("Access Granted!");
        }else{
            buttonOut.setText("Access Denied");
        }
    }
    
}
