/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CounselorRole;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.People.BirthMotherDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BirthMotherToCounselor;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hrishikeshwarrier
 */
public class BirthMotherRequestWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount account;
    private BirthMotherDirectory birthMotherDirectory;
    
    

    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public BirthMotherRequestWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.account = account;
     
        valueLabel.setText(enterprise.getName());
        populateRequestTable();
    }
    
    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        
        model.setRowCount(0);
        for (BirthMotherToCounselor request : enterprise.getWorkQueue().getBirthMotherToCounsellor()){
            if(request.getCounsellor().getName().equals(account.getCounselor().getName())){
            Object[] row = new Object[5];
            row[0] = request;
            row[1] = request.getMessage();
            row[2] = request.getBirthMother().getUsername();
            row[3] = request.getStatus();
            UserAccount result = ((BirthMotherToCounselor) request).getReceiver();
            row[4] = result == null ? "Waiting" : result;
            
            model.addRow(row);
            }
        }
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        viewBirthMother = new javax.swing.JButton();
        refreshTestJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(26, 26, 29));
        setPreferredSize(new java.awt.Dimension(703, 423));

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Sender", "Message", "Patient Name", "Status", "Approved by"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(4).setResizable(false);
        }

        viewBirthMother.setBackground(new java.awt.Color(252, 68, 69));
        viewBirthMother.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        viewBirthMother.setForeground(new java.awt.Color(237, 245, 225));
        viewBirthMother.setText("VIEW BIRTH MOTHER");
        viewBirthMother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBirthMotherActionPerformed(evt);
            }
        });

        refreshTestJButton.setBackground(new java.awt.Color(252, 68, 69));
        refreshTestJButton.setForeground(new java.awt.Color(237, 245, 225));
        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(237, 245, 225));
        enterpriseLabel.setText("ENTERPRISE:");

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/left-arrow-in-circular-button-black-symbol-2.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        valueLabel.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(237, 245, 225));
        valueLabel.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(refreshTestJButton)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enterpriseLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addComponent(viewBirthMother, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 445, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(valueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnBack, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(170, 170, 170)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(refreshTestJButton)
                .addGap(95, 95, 95)
                .addComponent(viewBirthMother, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewBirthMotherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBirthMotherActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row from the table");
            return;
        }
        BirthMotherToCounselor request = (BirthMotherToCounselor)workRequestJTable.getValueAt(selectedRow,0);
        if (request.getStatus().equals("Completed")){
                JOptionPane.showMessageDialog(null, "Already Completed!");
                return;
            
        }
        else
        {       
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();  
        userProcessContainer.add("ViewBirthMotherJPanel", new ViewBirthMotherJPanel(userProcessContainer, request, account, enterprise));        
        layout.next(userProcessContainer);
         }
        
        
    }//GEN-LAST:event_viewBirthMotherActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateRequestTable();
        
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardlayout = (CardLayout) userProcessContainer.getLayout();
        cardlayout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JButton viewBirthMother;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
