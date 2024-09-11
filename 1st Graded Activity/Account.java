/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccountPackage;

/**
 *
 * @author SCS Laptop
 */
public class Account {
    public int acctNum;
    private String acctName;
    private float acctBal;

    public void setAcctNum(int acctNum) {
        if (acctNum>=100 && acctNum<=999)
            this.acctNum = acctNum;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }

    public void setAcctBal(float acctBal) {
        this.acctBal = acctBal;
    }

    public int getAcctNum() {
        return acctNum;
    }

    public String getAcctName() {
        return acctName;
    }

    public float getAcctBal() {
        return acctBal;
    }
    
    public void deposit(float amt) {
        if (amt>0)
            this.acctBal += amt;
            //this.setAcctBal(this.getAcctBal()+amt);
    }
}

