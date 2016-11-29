/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author Rohit
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        invest (100.00, 10.0, 5);
    }
    public static void invest (short a, short b, int c){
        for (int i = 0; i <= c; i++){
            a=((1.0 + (b/100.0)) *a);
            System.out.println("After year " + c+ ": $" + a);
        }
        double finalnm = a - 100.0;
        System.out.println("Total interest " + finalnm);
}
}
