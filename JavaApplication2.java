/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Rohit
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public class MyApp{
public static void main(String args[]){
	for (int i = 1; i <= 6; i++) {
		for (int j = 1; j <= 6-i; j++) {
			System.out.println(“-”);
		}
for (int j = 1; j <= i; j++) {
			System.out.println(i);
		}
	System.out.println();
}
	}
}


