/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dividebyzero;

import java.util.Scanner;

/**
 *
 * @author mario.vega003
 */
public class DivideByZero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Ask a user for a number
        // Ask a user for a second number
        // Try to divide the first number with the second
        // Use a try and catch 
        // If there is an exception (dividing by zero)
        // print error
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int firstNum =  scan.nextInt();
        System.out.println("Please enter a second number");
        int secondNum =  scan.nextInt();
        int result = 0;
                
        try {
            if(firstNum != 0){
                result = secondNum / firstNum;
            }
        } catch (Exception e) {
            System.out.println("You cannot divide by zero");
        }
        System.out.println(result);
    }
    
}
