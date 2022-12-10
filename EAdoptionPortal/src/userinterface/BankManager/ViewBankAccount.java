/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BankManager;

import Business.BankAccount.Loan;
import static Business.ConfigureSystem.system;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BirthMotherToLoan;
import Business.WorkQueue.HospitalAdminToBank;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

/**
 *
 * @author hrishikeshwarrier
 */
public class ViewBankAccount extends javax.swing.JPanel {

    private UserAccount userAccount;
    private JPanel userProcessContainer;

    private String firstName;
    private String counselor;
    private String  hospital;
    private String emailId;
    private Loan loan;

    
    public ViewBankAccount(JPanel userProcessContainer,UserAccount userAccount, Loan loan) {
        initComponents();
        this.userAccount = userAccount;
        this.loan = loan;
        this.userProcessContainer = userProcessContainer;
   
        
        txtFirstName.setText(loan.getFirstName());
        txtEmail.setText(loan.getEmailId());
        txtHospital.setText(loan.getHospital());
        txtAddress.setText(loan.getAddress());
        txtFunds.setText(String.valueOf(loan.getBankBalance()));
        txtPassport.setText(loan.getPassportNumber());
        txtLastName.setText(loan.getLastName());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btnBrowse = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtPassport = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtFunds = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtHospital = new javax.swing.JTextField();
        txtViewDoc = new javax.swing.JTextField();

        setBackground(new java.awt.Color(26, 26, 29));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/left-arrow-in-circular-button-black-symbol-2.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(237, 245, 225));
        jLabel1.setText("CLIENT DETAILS");

        jLabel3.setForeground(new java.awt.Color(237, 245, 225));
        jLabel3.setText("FIRST NAME:");

        txtFirstName.setEnabled(false);

        jLabel17.setForeground(new java.awt.Color(237, 245, 225));
        jLabel17.setText("UPLOADED DOCUMENT:");

        btnBrowse.setBackground(new java.awt.Color(252, 68, 69));
        btnBrowse.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnBrowse.setForeground(new java.awt.Color(237, 245, 225));
        btnBrowse.setText("VIEW");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

        jLabel13.setForeground(new java.awt.Color(237, 245, 225));
        jLabel13.setText("PASSPORT NO.:");

        txtPassport.setEnabled(false);
        txtPassport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassportActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(237, 245, 225));
        jLabel4.setText("LAST NAME:");

        txtLastName.setEnabled(false);

        jLabel5.setForeground(new java.awt.Color(237, 245, 225));
        jLabel5.setText("EMAIL ID:");

        txtEmail.setEnabled(false);

        jLabel11.setForeground(new java.awt.Color(237, 245, 225));
        jLabel11.setText("BALANCE AVAILABLE:");

        txtFunds.setEnabled(false);
        txtFunds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFundsActionPerformed(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(237, 245, 225));
        jLabel12.setText("ADDRESS:");

        txtAddress.setEnabled(false);
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        jLabel14.setForeground(new java.awt.Color(237, 245, 225));
        jLabel14.setText("HOSPITAL:");

        txtHospital.setEnabled(false);
        txtHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospitalActionPerformed(evt);
            }
        });

        txtViewDoc.setEnabled(false);
        txtViewDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtViewDocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jLabel11))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(123, 123, 123)
                                .addComponent(jLabel5)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFunds, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassport, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtViewDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(105, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(336, 336, 336)
                .addComponent(btnBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnBack))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtFunds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPassport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtViewDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(70, 70, 70)
                .addComponent(btnBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(228, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardlayout = (CardLayout) userProcessContainer.getLayout();
        cardlayout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
        if (loan.getDocPath() == null || loan.getDocPath() == ""){
        SwingUtilities.invokeLater(new Runnable(){
            public void run()
                {
                JFrame editorFrame = new JFrame("Image Demo");
                editorFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
                BufferedImage image = null;
                try
                {
                    image = ImageIO.read(new File(loan.getDocPath()));
                }
                catch (Exception e)
                {
                  e.printStackTrace();
                }
                ImageIcon imageIcon = new ImageIcon(image);
                JLabel jLabel = new JLabel();
                jLabel.setIcon(imageIcon);
                editorFrame.getContentPane().add(jLabel, BorderLayout.CENTER);

                editorFrame.pack();
                editorFrame.setLocationRelativeTo(null);
                editorFrame.setVisible(true);
                }
            });
        }
        else{
            System.out.println("No File Select");
        }
    }//GEN-LAST:event_btnBrowseActionPerformed

    private void txtPassportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassportActionPerformed

    private void txtFundsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFundsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFundsActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospitalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospitalActionPerformed

    private void txtViewDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtViewDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtViewDocActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBrowse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtFunds;
    private javax.swing.JTextField txtHospital;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPassport;
    private javax.swing.JTextField txtViewDoc;
    // End of variables declaration//GEN-END:variables
}
