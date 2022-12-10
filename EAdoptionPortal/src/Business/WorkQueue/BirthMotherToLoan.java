/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.BankAccount.BankLoan;
import Business.People.BirthMother;
import Business.People.Parents;

/**
 *
 * @author hrishikeshwarrier
 */
public class BirthMotherToLoan extends WorkRequest{
    private BirthMother birthMother;
    private BankLoan loan;

    public BirthMotherToLoan(String message, BankLoan loan, BirthMother bm) {
        super();
        super.setMessage(message);
        super.setStatus("Pending");
        this.loan = loan;
        this.birthMother =bm;
    }

    public BirthMother getBirthMother() {
        return birthMother;
    }

    public void setBirthMother(BirthMother birthMother) {
        this.birthMother = birthMother;
    }
    
    public BankLoan getLoan() {
        return loan;
    }

    public void setLoan(BankLoan loan) {
        this.loan = loan;
    }

    @Override
    public String toString() {
        return super.getSender().getName();
    }
    
    
}
