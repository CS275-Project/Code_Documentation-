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

public class GrillGUI implements ActionListener{
    private static JButton burger;
    private static JButton cancel;

    public static void grillOptions(){
        JFrame frame = new JFrame();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(new Dimension(500, 400));
       frame.setTitle("Food Selections");
       
       frame.setLayout(new BorderLayout());
       JPanel pan = new JPanel(new GridLayout(2,2));
       burger = new JButton("Big Mac");
       burger.addActionListener(new GrillGUI());
       pan.add(burger);
       cancel = new JButton("Cancel");
       cancel.addActionListener(new GrillGUI());
       pan.add(cancel);
       
       frame.add(pan, BorderLayout.CENTER);
       
       
       frame.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == cancel){
            options();
        }else{
            System.out.println("Order is Big Mac");
        }
    }
}
