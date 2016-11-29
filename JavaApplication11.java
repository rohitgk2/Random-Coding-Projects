/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author Rohit
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner input= new Scanner(new File("C:\\Users\\Rohit\\Documents\\names.txt"));
        while (input.hasNext()) {System.out.println(input.next());
    }
    }
}
