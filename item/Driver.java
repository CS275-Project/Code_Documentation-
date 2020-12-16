/*
 *  Header:   Andrew Kelly
 *  Class:    CS 173 Fall 2019
 *  Assignment: Lab 01

Date: 9/6/19

 Summary:
 */
package item;

/**
 *
 * @author andre
 */
public class Driver {
    
    public static void main(String[] args){
        Burger b = new Burger();
        //Spec burger = new Spec("burger",5.50);
        
        //b.addSpec(burger);
        Spec cheese = new Spec("cheese",1.00);
        b.addSpec(cheese);
        Spec ketchup = new Spec("ketchup",1.00);
        b.addSpec(ketchup);
        //Spec mustard = new Spec("mustard",1.00);
        //Spec lettuce = new Spec("lettuce",1.00);
        
        b.printOrder();
        
    }
    
}
