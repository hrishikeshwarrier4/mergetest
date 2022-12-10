

package userinterface.FinanceAdministrativeRole;

import userinterface.HospitalAdministrativeRole.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author  hrishikeshwarrier
 */
public class FinanceAdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    Enterprise enterprise;
    UserAccount account;
 
    /** Creates new form AdminWorkAreaJPanel */
    public FinanceAdminWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account = account;

        valueLabel.setText(enterprise.getName());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        manageUserAccountJButton = new javax.swing.JButton();
        manageOrganizationJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        manageEmployeeJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(26, 26, 29));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(237, 245, 225));
        jLabel1.setText("FINANCE ADMINISTRATIVE WORK AREA");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        manageUserAccountJButton.setBackground(new java.awt.Color(252, 68, 69));
        manageUserAccountJButton.setForeground(new java.awt.Color(237, 245, 225));
        manageUserAccountJButton.setText("Manage User Account");
        manageUserAccountJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageUserAccountJButtonActionPerformed(evt);
            }
        });
        add(manageUserAccountJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 220, 50));

        manageOrganizationJButton.setBackground(new java.awt.Color(252, 68, 69));
        manageOrganizationJButton.setForeground(new java.awt.Color(237, 245, 225));
        manageOrganizationJButton.setText("Manage Organization");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });
        add(manageOrganizationJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 220, 50));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(237, 245, 225));
        enterpriseLabel.setText("ENTERPRISE:");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 140, 30));

        valueLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(237, 245, 225));
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 320, -1));

        manageEmployeeJButton.setBackground(new java.awt.Color(252, 68, 69));
        manageEmployeeJButton.setForeground(new java.awt.Color(237, 245, 225));
        manageEmployeeJButton.setText("Manage Employee");
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });
        add(manageEmployeeJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 220, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void manageUserAccountJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageUserAccountJButtonActionPerformed
        
        FinanceManageUserAccountJPanel financemanageEmployeeJPanel = new FinanceManageUserAccountJPanel(userProcessContainer, enterprise, account);
        userProcessContainer.add("manageEmployeeJPanel", financemanageEmployeeJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_manageUserAccountJButtonActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed

        FinanceManageOrganizationJPanel manageOrganizationJPanel = new FinanceManageOrganizationJPanel(userProcessContainer, account, enterprise);
        userProcessContainer.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed
        
        FinanceManageEmployeeJPanel manageEmployeeJPanel = new FinanceManageEmployeeJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("manageEmployeeJPanel", manageEmployeeJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JButton manageUserAccountJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
    
}
