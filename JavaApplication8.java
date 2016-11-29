/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.*;

/**
 *
 * @author Rohit
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
       Scanner kb = new Scanner(new File("C:\\Users\\Rohit\\Documents\\names.txt")); 
       while(kb.hasNext()){
           System.out.println(kb.next());
       }
                */
       for (int i= 1; i <=5 ; i++) {
           for (int j= 1; j <= i; j++) {
               System.out.print(j);}
               System.out.println();
           }
            for (int i = 5; i>=0; i--) {
                for (int j= 1; j<= i; j++){
                    System.out.print(j);
                }
                System.out.println();
            
            
        }
        
    }
    
}
