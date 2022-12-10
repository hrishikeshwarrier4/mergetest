/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CounselorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author nikhi
 */
public class CounselorWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;

    /**
     * Creates new form CounselorWorkArea
     */
    public CounselorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        valueLabel.setText(organization.getName());
    }
       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        reviewBirthMotherJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        reviewParentsJButton = new javax.swing.JButton();
        btnNewOrphanage = new javax.swing.JButton();

        setBackground(new java.awt.Color(26, 26, 29));

        reviewBirthMotherJButton.setBackground(new java.awt.Color(252, 68, 69));
        reviewBirthMotherJButton.setForeground(new java.awt.Color(237, 245, 225));
        reviewBirthMotherJButton.setText("New Birth Mother Applications");
        reviewBirthMotherJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reviewBirthMotherJButtonActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(237, 245, 225));
        enterpriseLabel.setText("COUNSELOR:");
        enterpriseLabel.setToolTipText("");

        valueLabel.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(237, 245, 225));
        valueLabel.setText("<value>");

        reviewParentsJButton.setBackground(new java.awt.Color(252, 68, 69));
        reviewParentsJButton.setForeground(new java.awt.Color(237, 245, 225));
        reviewParentsJButton.setText("New Parent Applications");
        reviewParentsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reviewParentsJButtonActionPerformed(evt);
            }
        });

        btnNewOrphanage.setBackground(new java.awt.Color(252, 68, 69));
        btnNewOrphanage.setForeground(new java.awt.Color(237, 245, 225));
        btnNewOrphanage.setText("New Orphanage Applications");
        btnNewOrphanage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewOrphanageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(353, 353, 353)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(reviewBirthMotherJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reviewParentsJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNewOrphanage, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(394, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114)
                .addComponent(reviewBirthMotherJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(reviewParentsJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnNewOrphanage, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(213, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void reviewBirthMotherJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reviewBirthMotherJButtonActionPerformed
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("BirthMotherRequestWorkAreaJPanel", new BirthMotherRequestWorkAreaJPanel(userProcessContainer, userAccount, organization, enterprise));
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_reviewBirthMotherJButtonActionPerformed

    private void reviewParentsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reviewParentsJButtonActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ParentsRequestWorkAreaJPanel", new ParentsRequestWorkAreaJPanel(userProcessContainer, userAccount, organization, enterprise));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_reviewParentsJButtonActionPerformed

    private void btnNewOrphanageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewOrphanageActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("OrphanageRequestWorkAreaPanel", new OrphanageRequestWorkAreaPanel(userProcessContainer));
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnNewOrphanageActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNewOrphanage;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton reviewBirthMotherJButton;
    private javax.swing.JButton reviewParentsJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
