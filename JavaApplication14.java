/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;
import java.util.*;


/**
 *
 * @author Rohit
 */
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        lucky(3);
    }
    public static void lucky (int min) {
        Random rand=new Random();
        int y= 0;
        int rolls=0;
        while (y<4) {
            int x= rand.nextInt(6) + 1;
            System.out.print(x + " ");
            if (x<=min) {
                y++;
                
            }
            else {y=0;}
            rolls++;}
            System.out.println();
            System.out.println("Finished after " + rolls + " rolls");
            
        }
       
    }
    
}
