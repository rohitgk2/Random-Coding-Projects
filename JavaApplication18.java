/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author Rohit
 */
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        sumOfNumbers("hello 3 4.9 5.1 see you");
    }
    public static void sumOfNumbers (String a) {
        double sum=0;
        Scanner kb= new Scanner (a);
        while (kb.hasNextDouble() && a.equals(" ")){
            double c= kb.nextDouble();
            sum+= c;
            System.out.println(sum);
        }
        
    }
}
