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
        private ArrayList<BankLoan> loanList1;

    public LoanAccountDirectory() {
        loanList1 = new ArrayList();
    }

    public ArrayList<BankLoan> getLoanAccountList() {
        return loanList1;
    }
    
    
    public BankLoan addLoan(BankLoan loan){
        loanList1.add(loan);
        return loan;
    }
}
