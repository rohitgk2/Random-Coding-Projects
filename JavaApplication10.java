/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author Rohit
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException{
        // TODO code application logic here
        frequentFlier(new Scanner(new File("C:\\Users\\Rohit\\Documents\\file.txt")));
    }
    public static int frequentFlier(Scanner kb) throws FileNotFoundException{
        kb= new Scanner (new File("C:\\Users\\Rohit\\Documents\\file.txt"));
        int total=0;
        while (kb.hasNext()){
            String cabin= kb.next();
            int miles= kb.nextInt();
            if (cabin.equalsIgnoreCase("coach")) {
                total+= miles;
            }
            if (cabin.equalsIgnoreCase("firstclass"))
                total+= 2*miles;
        }
       System.out.println("Total points = " + total);
       return total;
      
    }
    
}
