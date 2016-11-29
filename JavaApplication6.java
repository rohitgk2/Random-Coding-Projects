/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Rohit
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        invest (100.00, 10.0, 5);
    }
    public static double invest (double a, double b, int c) {
        double d=100.00;
        for (int i= 1; i<=c; i++) {
        a= ((1.0 + (b/100)) * a);
        System.out.println("After year " + i + ": $" + a);
        
        }
        double e= a - d;
        System.out.println("Total Earned Interest: $" + e );
        return e;
    }
}
