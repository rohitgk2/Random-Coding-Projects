/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

/**
 *
 * @author Rohit
 */
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i=1; i<=6; i++){
            for (int j=0; j<6-i; j++) {
                System.out.print("-");               
            }
            for (int j=0; j<i; j++) {
                System.out.print(j+1);
                           }
            System.out.println();
        }
    }
    
}
