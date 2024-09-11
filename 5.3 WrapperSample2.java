/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

import java.util.Scanner;

/**
 *
 * @author SCS Laptop
 */
public class WrapperSample2 {
    public static void main (String[] args) {
	Scanner input = new Scanner(System.in);
	int num1, num2;
	String str1, str2, concatStr;

	System.out.print("Input 1st positive integer: ");
	num1 = input.nextInt();
	System.out.print("Input 2nd positive integer: ");
	num2 = input.nextInt();
               
        System.out.println("Result = " +
        Integer.toString(num1).concat(Integer.toString(num2)));
    }
}
