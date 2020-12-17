/*
 *  Header:   Andrew Kelly
 *  Class:    CS 173 Fall 2019
 *  Assignment: Lab 01

Date: 9/6/19

 Summary:
 */
package item;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import static item.Driver.food;

/**
 *
 * @author andre
 */
public class GUIFoodOptions implements ActionListener{
    
    private static JButton cancel;
    private static JButton che;
    private static JButton let;
    private static JButton tom;
    private static JButton on;
    private Burger b = new Burger();
    
    public static void main(String[] args){
        specs();
    }
    
    public static void specs(){
        
        JFrame frame = new JFrame();
        frame.setSize(1100, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Toppings");
        
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);
        
        
        
        JButton che = new JButton("Cheese");
        che.setBounds(100, 450, 350, 350);
        panel.add(che);
        che.addActionListener(new Driver());
        
        JButton let = new JButton("Lettuce");
        let.setBounds(550, 50, 350, 350);
        panel.add(let);
        
        JButton tom = new JButton("Tomato");
        tom.setBounds(100, 50, 350, 350);
        panel.add(tom);
        
        JButton on = new JButton("Onion");
        on.setBounds(550, 450, 350,350);
        panel.add(on);
        
        JButton cancel = new JButton("Return To Grill Menu");
        cancel.setBounds(400, 850, 200, 50);
        panel.add(cancel);
        cancel.addActionListener(new Driver());
        
        //hard code some integers to be printed when items are selected
        //integer will correspond to a specific spec that will be created and added to the burger
        //when order is done it will print and send email
        //yahtzee
        
        
        
        
        
        
        //Burger b = new Burger();
        
        
        //b.addSpec(burger);
        //Spec cheese = new Spec("cheese",1.00);
        //b.addSpec(cheese);
        //Spec ketchup = new Spec("ketchup",1.00);
        //b.addSpec(ketchup);
        //Spec mustard = new Spec("mustard",1.00);
        //Spec lettuce = new Spec("lettuce",1.00);
        
        //b.printOrder();
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        
        if (e.getSource() == cancel){
            food();
        }else if (e.getSource() == che){
            Spec cheese = new Spec("Cheese",1.00);
            b.addSpec(cheese);
            //add selected specs
        }else if (e.getSource() == let){
            Spec lettuce = new Spec("Lettuce",1.00);
            b.addSpec(lettuce);
        }else if(e.getSource() == tom){
            Spec tomato = new Spec("Tomato",1.00);
            b.addSpec(tomato);
        }else if(e.getSource() == on){
            Spec onion = new Spec("Onion",1.00);
            b.addSpec(onion);
        }
        
        
    }
}
