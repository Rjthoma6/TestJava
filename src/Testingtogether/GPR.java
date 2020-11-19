/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testingtogether;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Andrew Choe
 */
public class GPR extends javax.swing.JFrame {

    /**
     * Creates new form Assignment
     */
    public GPR() {
        initComponents();
        
    }
        String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url="jdbc:sqlserver://DESKTOP-592B8RA\\SQLEXPRESS:1433;databaseName=CIS3365 Shasta Analysts";
        String user="shasta";
        String pass="admin";
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ReportTable = new javax.swing.JTable();
        btnNew = new javax.swing.JButton();
        Reports5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Government Permit Report");

        ReportTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Work Order ID", "Permit Request ID", "Permit Request Date", "Document ", "Permit Request Type", "Permit Request Status", "Gov ID", "Gov Name", "Address", "City"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ReportTable);

        btnNew.setText("View Report");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        Reports5.setText("Reports");
        Reports5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reports5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 929, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(408, 408, 408)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(btnNew))))
                    .addComponent(Reports5))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Reports5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNew)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        
         try
        {
         
               Connection con=DriverManager.getConnection(url,user,pass);
               String sql="Select " +
"WorkOrder.WorkOrderID AS 'Work Order ID', " +
"PermitRequest.PermitRequestID AS 'Permit Request ID', " +
"PermitRequest.PermitRequestDate AS 'Permit Request Date', " +
"PermitRequest.Document AS 'Document', " +
"PermitRequestType.PermitRequestTypeName AS 'Permit Request Type', " +
"PermitRequestStatus.PermitRequestStatusName AS 'Permit Request Status', " +
"GovernmentAgency.GovID AS  'Gov Id', " +
"GovernmentAgency.GovName AS  'Gov Name', " +
"GovernmentAgency.GovAddress AS 'Address', " +
"GovernmentAgency.City AS 'City' " +
 
 "From GovernmentAgency " +
"join PermitRequest ON PermitRequest.GovID =GovernmentAgency.GovID " +
"join WorkOrderLineForm ON PermitRequest.WorkOrderLineFormID = WorkOrderLineForm.WorkOrderLineFormID " +
"join WorkOrder on WorkOrderLineForm.WorkOrderID = WorkOrder.WorkOrderID " +
 "join PermitRequestStatus ON PermitRequest.PermitRequestStatusID=PermitRequestStatus.PermitRequestStatusID " +
 "join PermitRequestType ON  PermitRequest.PermitRequestTypeID= PermitRequestType.PermitRequestTypeID " +

"WHERE PermitRequestType.PermitRequestTypeName = 'Structural Addition/Expansion' ";
               

                      
               PreparedStatement pst=con.prepareStatement(sql);
               ResultSet rs=pst.executeQuery();
               DefaultTableModel AppointmentTM=(DefaultTableModel)ReportTable.getModel();
               AppointmentTM.setRowCount(0);
               
               while(rs.next())
               {
                   Object o[]={rs.getString("Work Order ID"),rs.getString("Permit Request ID"),rs.getString("Permit Request Date"),rs.getString("Document"), rs.getString("Permit Request Type"), rs.getString("Permit Request Status"),  rs.getString("Gov Id"),  rs.getString("Gov Name"),  rs.getString("Address"),  rs.getString("City")};
                   AppointmentTM.addRow(o);
               }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e);
        }
        
        
    }//GEN-LAST:event_btnNewActionPerformed

    private void Reports5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reports5ActionPerformed
new Reports().setVisible(true);
        this.setVisible(false);          // TODO add your handling code here:
    }//GEN-LAST:event_Reports5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GPR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GPR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GPR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GPR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GPR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ReportTable;
    private javax.swing.JButton Reports5;
    private javax.swing.JButton btnNew;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
