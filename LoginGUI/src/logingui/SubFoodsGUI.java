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
public class SubFoodsGUI implements ActionListener{
    
    private static JButton sub;
    private static JButton cancel;
    
    public static void subOptions(){
        
       JFrame frame = new JFrame();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(new Dimension(500, 400));
       frame.setTitle("Food Selections");
       
       frame.setLayout(new BorderLayout());
       JPanel pan = new JPanel(new GridLayout(2,2));
       sub = new JButton("Chicken Bacon Ranch");
       sub.addActionListener(new SubFoodsGUI());
       pan.add(sub);
       cancel = new JButton("Cancel");
       cancel.addActionListener(new SubFoodsGUI());
       pan.add(cancel);
       
       frame.add(pan, BorderLayout.CENTER);
       
       
       frame.setVisible(true);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == cancel){
            options();
        }else{
            System.out.println("Order is Chicken Bacon Ranch");
        }
    }
    
}
