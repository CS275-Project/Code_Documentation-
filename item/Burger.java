/*
 *  Header:   Andrew Kelly
 *  Class:    CS 173 Fall 2019
 *  Assignment: Lab 01

Date: 9/6/19

 Summary:
 */
package item;
import java.util.ArrayList;
/**
 *
 * @author andre
 */
public class Burger extends Item{
    
    public double price;
    public double cost = 0;
    public ArrayList<Spec> toppings;
    private int orderNum = 0;
    
    public Burger(){
        this.orderNum++;
        this.price = 5.50;
        toppings = new ArrayList<>();
        
    }
    
    public void addSpec(Spec topping){
        toppings.add(topping);
    }
    
    public double calcPrice(){
        for (int i = 0; i < toppings.size(); i++){
            cost += toppings.get(i).getPrice();
        }
        
        return cost;
    }
    
    public void printOrder(){
        
        String order = "Your Order: \n Burger-----"+String.format("%.2f",price)+"\n";
        cost = price + calcPrice();
        
        for(int i = 0; i < toppings.size(); i++){
            order = order+"   "+toppings.get(i).getName()+"-----"+String.format("%.2f",toppings.get(i).getPrice())+"\n";
        }
        order = order+"Total: $"+String.format("%.2f",cost)+"\nOrder #: "+String.valueOf(orderNum);
        System.out.println(order);
    }
}
