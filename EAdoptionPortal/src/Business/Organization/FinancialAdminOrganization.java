/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.FinancialAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author patil
 */
public class FinancialAdminOrganization extends Organization{

    public FinancialAdminOrganization() {
        super(Type.FinanceAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FinancialAdminRole());
        return roles;
    }
     
}
