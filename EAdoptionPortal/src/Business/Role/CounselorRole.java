/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise1;
import Business.Organization.CounselorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.CounselorRole.CounselorWorkAreaJPanel;

/**
 *
 * @author hrishikeshwarrier
 */
public class CounselorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise1 enterprise, EcoSystem business) {
        return new CounselorWorkAreaJPanel(userProcessContainer, account, organization, enterprise);
    }
    
    
}
