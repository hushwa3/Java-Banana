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
public class ExceptionSample1 {
    public static void main(String[] args) {
        int n1, n2, rem;
        float quotient;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input first integer: "); n1=input.nextInt();
	System.out.print("Input second integer: "); n2=input.nextInt();
        try {
            quotient=n1/n2;
            rem=n1%n2;
            System.out.println(n1 + " divided by " + n2 + " is equal to "
				+ quotient + " remainder " + rem);
        }
        catch (Exception e) {
            System.out.println("Error. Cannot divide a number by zero.");
        }
    }
}
