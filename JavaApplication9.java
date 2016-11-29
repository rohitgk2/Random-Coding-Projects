/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.io.File;
import java.util.Scanner;


public class JavaApplication9 {

    
    public static void main(String[] args) {
         int [] a= new int[]{3, 5, 7, 9};
        
        for(int i = 0; i < a.length; i++){
        System.out.println(a[i + 1] - a[i]);    
        
        }
    }
    public static int[] delta (int[]a) {
        a= new int[]{3, 5, 7, 9};
        
        for(int i = 0; i < a.length; i++){
        System.out.println(a[i+1]);    
        }
        return a;
    }
    public static int frequent(Scanner kb){
        
    }
}