/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;
import java.util.*;

/**
 *
 * @author Rohit
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("How many days of temp.?");
        Scanner kb= new Scanner(System.in);
        int days= kb.nextInt();
        int [] weather= new int [days];
        double sum=0;
        for (int i=0; i< days; i++) {
           System.out.println("What was day " + (i+1) + "'s weather?");
           weather [i]= kb.nextInt();
           sum+= weather[i];
           }
        double average= (sum/days);
        int daysAbove= 0;
        for (int i=0; i<days; i++) {
            System.out.println("Day " + (i+1) + "'s high temp: " + weather[i]);
        }
        System.out.println("Average was: " + average);
        for (int i=0; i<days; i++) {
            if(weather[i] > average){
                daysAbove++;
            }
        }
            System.out.println("Days above Average: " + daysAbove);
        
    System.out.println("Temperatures: " + Arrays.toString(weather));
    Arrays.sort(weather);
    System.out.println("2 coldest days: " + weather[0] + ", " + weather[1]);
    System.out.println("2 warmest days: " + weather[weather.length-1] + ", " + weather[weather.length-2]);
    
            }
        
       
    }
    
    
}
