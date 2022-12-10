/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BankAccount;

import java.util.ArrayList;

/**
 *
 * @author hrishikeshwarrier
 */
public class LoanAccountDirectory {
        private ArrayList<Loan> loanList1;

    public LoanAccountDirectory() {
        loanList1 = new ArrayList();
    }

    public ArrayList<Loan> getLoanAccountList() {
        return loanList1;
    }
    
    
    public Loan addLoan(Loan loan){
        loanList.add(loan);
        return loan;
    }
}
