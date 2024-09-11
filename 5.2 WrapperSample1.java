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
public class WrapperSample1 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String num1;
	int num2, sum;

	System.out.print("Input a first number: ");
	num1 = input.next();
	System.out.print("Input a second number: ");
	num2 = input.nextInt();
        sum = Integer.parseInt(num1) + num2;
        System.out.println("Sum = " + sum);
    }
}
