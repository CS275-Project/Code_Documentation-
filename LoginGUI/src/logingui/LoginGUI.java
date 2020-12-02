/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logingui;

/**
 *
 * @author justincasey
 */
import static diningoptionsgui.DiningOptionsGUI.options;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
class LoginGUI implements ActionListener{
    private static JLabel username;
    private static JTextField name;
    private static JLabel pass;
    private static JPasswordField word;
    private static boolean correct_login = false;
    
    public static void main(String args[]){

        login();
        
               
     }
    
    public static void login(){
        
       JFrame frame = new JFrame();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(new Dimension(500, 400));
       frame.setTitle("LWS Customer Login");
     
       frame.setLayout(new BorderLayout());
       JPanel pan = new JPanel(new GridLayout(5, 1)); 
       username = new JLabel("Username:");
       username.setBounds(100, 20, 165, 25);
       pan.add(username);
       name = new JTextField(20);
       name.setBounds(100, 20, 80, 25);
       pan.add(name);
       pass = new JLabel("pass");
       pass.setBounds(50,50, 80, 25);
       pan.add(pass);
       word = new JPasswordField(20);
       word.setBounds(100, 50, 80, 25);
       pan.add(word); 
       JButton log = new JButton("Log in");
       log.setBounds(50, 80, 80, 25);
       log.addActionListener(new LoginGUI());
       pan.add(log);
       frame.add(pan, BorderLayout.CENTER);
       
       frame.setVisible(true);

    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String username = name.getText();
        String password = word.getText();
        System.out.println(username + "," + password);
        correct_login = true;
        //DiningOptionsGUI dave = new DiningOptionsGUI();
        options();
    }
}
