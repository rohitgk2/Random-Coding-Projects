/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;
import java.util.*;

/**
 *
 * @author Rohit
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] numbs= {1, 2, 3, 4, 5,};
        for (int i=0; i<numbs.length/2; i++){
            int temp= numbs[i];
            numbs[i]= numbs[numbs.length-1-i];
            temp= numbs[numbs.length-1-i];
            System.out.println(Arrays.toString(numbs));
    }
    
}
