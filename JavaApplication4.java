package javaapplication4;
//user inputs 2 words and have to order them by longest then shortest and display average

import java.util.*;
public class JavaApplication4 {
    public static void main(String[] args) {
        Scanner kbd= new Scanner (System.in);
        System.out.println("Type a word");
        String first= kbd.next();
        System.out.println("Type another word");
        String second= kbd.next();
        average(first, second);
        order(first, second);
    }
    public static double average(String first, String second){
        double a= first.length();
        double b= second.length();
        double average=(a+b)/2;
        System.out.println("Average: " + average);
        return average;
    }
    public static String order(String first, String second) {
        double a= first.length();
        double b= second.length();
        
        if (a>b) {
            String order= first + " " + second;
            System.out.println("Order: " + order);
            return order;
        }
        else {String order= second + " " + first;
        System.out.println("Order: " + order);
        return order;        }
        
    }
        
    }
    
    
    

    
    
    

