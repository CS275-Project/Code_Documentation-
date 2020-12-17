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
public class Spec {
    
    private String name;
    private double price;
    public ArrayList<Spec> specs;
    
    public Spec(String name, double price){
        this.name = name;
        this.price = price;
        
        
    }
    
    public double getPrice(){
        return price;
    }
    
    public String getName(){
        return name;
    }
}
