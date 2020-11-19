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
public class ASfWOD extends javax.swing.JFrame {

    /**
     * Creates new form Assignment
     */
    public ASfWOD() {
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
        Reporttable = new javax.swing.JTable();
        btnNew = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Work Orders In Progress in All Zones");

        Reporttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Appointment ID", "AppointmentAgenda", "Appointment Date", "Last Name", "First Name", "Phone Number", "Customer Status", "Work Order ID", "Work Order Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Reporttable);

        btnNew.setText("View Report");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
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
                        .addGap(430, 430, 430)
                        .addComponent(btnNew))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(jLabel5)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
"Appointment.AppointmentID AS 'Appointment ID', " +
"Appointment.AppointmentPurpose AS 'Appointment Agenda', " +
"Appointment.AppointmentDate as 'Appointment Date', " +
"Customer.CustomerID,  " +
"Customer.Lastname AS 'Last Name', " +
"Customer.Firstname AS 'First Name', " +
"Customer.Phone1 AS 'Phone Number', " +
"CustomerStatus.CustomerStatusName AS 'Customer Status', " +
"WorkOrder.WorkOrderID AS 'Work Order ID', " +
"WorkOrderStatus.WorkOrderStatusName AS 'Work Order Status' " +

"From WorkOrder " +
"Join Appointment ON  WorkOrder.WorkOrderID = Appointment.WorkOrderID " +
"Join Customer ON WorkOrder.CustomerID = Customer.CustomerID " +
"Join CustomerStatus ON Customer.CustomerStatusID = CustomerStatus.CustomerStatusID " +
"Join WorkOrderStatus ON WorkOrder.WorkOrderStatusID = WorkOrderStatus.WorkOrderStatusID " +

"Where Appointment.AppointmentPurpose= 'Work Order Discussion' and " +
"WorkOrder.WorkOrderStatusID <> 5  " +

"GROUP BY Appointment.AppointmentID, Appointment.AppointmentPurpose, Appointment.AppointmentDate, Customer.CustomerID, Customer.Lastname, Customer.Firstname, Customer.Phone1, CustomerStatus.CustomerStatusName, WorkOrder.WorkOrderID, WorkOrderStatus.WorkOrderStatusName " +

"Order By [Appointment Date] " ;
               

                      
               PreparedStatement pst=con.prepareStatement(sql);
               ResultSet rs=pst.executeQuery();
               DefaultTableModel ReportTM=(DefaultTableModel)Reporttable.getModel();
               ReportTM.setRowCount(0);
               
               while(rs.next())
               {
                   Object o[]={rs.getString("Appointment ID"),rs.getString("Appointment Agenda"),rs.getString("Appointment Date"),rs.getString("Last Name"), rs.getString("First Name"), rs.getString("Phone Number"),  rs.getString("Customer Status"),  rs.getString("Work Order ID"),  rs.getString("Work Order Status")};
                   ReportTM.addRow(o);
               }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e);
        }
        
        
    }//GEN-LAST:event_btnNewActionPerformed

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
            java.util.logging.Logger.getLogger(ASfWOD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ASfWOD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ASfWOD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ASfWOD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ASfWOD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Reporttable;
    private javax.swing.JButton btnNew;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
