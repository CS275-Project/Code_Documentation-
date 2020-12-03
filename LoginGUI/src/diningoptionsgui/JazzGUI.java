/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diningoptionsgui;

/**
 *
 * @author justincasey
 */
import static diningoptionsgui.DiningOptionsGUI.options;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JazzGUI implements ActionListener {
    
    private static JButton salad;
    private static JButton cancel;
    
    public static void jazzOptions(){
        JFrame frame = new JFrame();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(new Dimension(500, 400));
       frame.setTitle("Food Selections");
       
       frame.setLayout(new BorderLayout());
       JPanel pan = new JPanel(new GridLayout(2,2));
       salad = new JButton("Chicken Caesar Salad");
       salad.addActionListener(new JazzGUI());
       pan.add(salad);
       cancel = new JButton("Cancel");
       cancel.addActionListener(new JazzGUI());
       pan.add(cancel);
       
       frame.add(pan, BorderLayout.CENTER);
       
       
       frame.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == cancel){
            options();
        }else{
            System.out.println("Chicken Caesar Salad");
        }
    }
    
}
