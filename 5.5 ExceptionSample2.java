/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

import java.util.*;

/**
 *
 * @author SCS Laptop
 */
public class ExceptionSample2 {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
	int num;

        System.out.print("Input an integer: ");
        try {
            num = input.nextInt();
            System.out.println("The number you entered is " + num);
            InputMismatchException e = new InputMismatchException();
            throw e;
        }
        catch (InputMismatchException e) {
            System.out.println("Error. Type mismatch.");
        }
    }
    
}
