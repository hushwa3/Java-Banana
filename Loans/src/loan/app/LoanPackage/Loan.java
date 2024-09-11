/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LoanPackage;

/**
 *
 * @author USER
 */
public abstract class Loan implements LoanConstants {
    private int loanNumber;
    private String customerLastName;
    private double loanAmount;
    private double interestRate;
    private int term;

    public Loan(int loanNumber, String customerLastName, double loanAmount, int term) {
        this.loanNumber = loanNumber;
        this.customerLastName = customerLastName;
        setLoanAmount(loanAmount);
        setTerm(term);
    }

    public int getLoanNumber() {
        return loanNumber;
    }

    public void setLoanNumber(int loanNumber) {
        this.loanNumber = loanNumber;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    private void setLoanAmount(double loanAmount) {
        if (loanAmount <= MAX_LOAN_AMOUNT) {
            this.loanAmount = loanAmount;
        } else {
            System.out.println("Error: Loan amount exceeds maximum limit of $" + MAX_LOAN_AMOUNT);
        }
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getTerm() {
        return term;
    }

    private void setTerm(int term) {
        if (term == SHORT_TERM || term == MEDIUM_TERM || term == LONG_TERM) {
            this.term = term;
        } else {
            System.out.println("Error: Invalid term. Setting to short-term (1 year) by default.");
            this.term = SHORT_TERM;
        }
    }

    // Abstract method to calculate total amount owed
    public abstract double calculateTotalAmountOwed();

    // Override toString() method to return loan data
    @Override
    public String toString() {
        return "Loan Number: " + loanNumber + "\n" + "Customer Last Name: " + customerLastName + "\n"
                + "Loan Amount: $" + loanAmount + "\n" + "Interest Rate: " + interestRate + "%" + "\n" + "Term: "
                + term + " year(s)" + "\n" + "Total Amount Owed: $" + calculateTotalAmountOwed() + "\n";
    }
}