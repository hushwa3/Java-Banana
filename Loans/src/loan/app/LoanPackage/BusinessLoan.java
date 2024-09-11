/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LoanPackage;

/**
 *
 * @author USER
 */
public class BusinessLoan extends Loan {
    private static final double INTEREST_RATE = 1.0; // 1% over the current prime interest rate

    public BusinessLoan(int loanNumber, String customerLastName, double loanAmount, int term, double primeInterestRate) {
        super(loanNumber, customerLastName, loanAmount, term);
        setInterestRate(primeInterestRate + INTEREST_RATE);
    }

    @Override
    public double calculateTotalAmountOwed() {
        return getLoanAmount() + (getLoanAmount() * getInterestRate() / 100) * super.getTerm();
    }
}