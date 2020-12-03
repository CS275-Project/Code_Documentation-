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
public abstract class Item {

    public ArrayList<String> specs;                     //array of specification prices
    public ArrayList<Double> prices;
    public double cost = 0;
    
    
    public ArrayList<String> addSpec(String spec){
        specs.add(spec);
        return specs;
    }
    
    public double calcPrice(double price){
        
        for (int i = 0; i < prices.size(); i++){
            cost += price;
        }
        
        return cost;
    }
}
