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
public abstract class Item {

    private String[] specs;                     //array of specification prices
    private double[] prices;
    public double price = 0;
    
    public Item() {
        
        this.price = price;
    }
    
    
    public double calcPrice(double prices[]){
        
        for (int i = 0; i < prices.length; i++){
            price += prices[i];
        }
        
        return price;
    }
}
