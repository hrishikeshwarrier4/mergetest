/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.BankManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author nihil
 */
public class OrphanAdminOrganization extends Organization{
    
      public OrphanAdminOrganization() {
        super(Organization.Type.OrphanageAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new BankManagerRole());
        return roles;
    }
     
}
