/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccountPackage;
import java.util.*;
/**
 *
 * @author SCS Laptop
 */
public class AccountTester {
    public static void main (String[] args) {
        Account myAcct = new Account();
        Account urAcct = new Account();
        Scanner input = new Scanner(System.in);
        float amt;
        
        myAcct.setAcctNum(123);
        myAcct.setAcctName("John");
        myAcct.setAcctBal(25000);
        System.out.println("Account number = " + myAcct.getAcctNum());
        System.out.println("Account name = " + myAcct.getAcctName());
        System.out.println("Account balance = " + myAcct.getAcctBal());
        urAcct.setAcctNum(456);
        System.out.println("Account number = " + urAcct.getAcctNum());
        myAcct.deposit(500);
        System.out.println("Account balance = " + myAcct.getAcctBal());
        System.out.println("Input amount to deposit into John's account: ");
        amt = input.nextFloat();
        myAcct.deposit(amt);
        System.out.println("Account balance = " + myAcct.getAcctBal());
    }
}
