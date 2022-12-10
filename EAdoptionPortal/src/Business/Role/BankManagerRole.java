/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise1;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.BankManager.BankManagerWorkAreaJPanel;

/**
 *
 * @author hrishikeshwarrier
 */
public class BankManagerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise1 enterprise, EcoSystem business) {
        return new BankManagerWorkAreaJPanel(userProcessContainer, account, organization, business, enterprise);
    }
    
}
