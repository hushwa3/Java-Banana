/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LoanPackage;

/**
 *
 * @author USER
 */
public class PersonalLoan extends  Loan {
    private static final double INTEREST_RATE = 2.0; // 2% over the current prime interest rate

    public PersonalLoan(int loanNumber, String customerLastName, double loanAmount, int term, double primeInterestRate) {
        super(loanNumber, customerLastName, loanAmount, term);
        setInterestRate(primeInterestRate + INTEREST_RATE);
    }

    @Override
    public double calculateTotalAmountOwed() {
      //return getLoanAmount() + (getInterestRate() * 100 / getLoanAmount()) * super.getTerm();
        return getLoanAmount() + (getLoanAmount() * getInterestRate() / 100) * super.getTerm();
    }
}