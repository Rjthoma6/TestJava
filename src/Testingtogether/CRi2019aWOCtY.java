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
public class CRi2019aWOCtY extends javax.swing.JFrame {

    /**
     * Creates new form Assignment
     */
    public CRi2019aWOCtY() {
        initComponents();
        
    }
        String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url="jdbc:sqlserver://DESKTOP-RQELHUF\\:1433;databaseName=CIS3365 Shasta Analysts";
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
        Appointmenttable = new javax.swing.JTable();
        btnNew = new javax.swing.JButton();
        Reports2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Customers Registered in 2019 and Work Orders Completed that Year");

        Appointmenttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Customer ID", "Registration Date", "Customer Status Name", "Last Name", "First Name", "Email Address", "Mailing Address", "City", "State", "ZIP Code", "Country", "Number of WOs"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Appointmenttable);

        btnNew.setText("View Report");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        Reports2.setText("Reports");
        Reports2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reports2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(430, 430, 430)
                        .addComponent(btnNew))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Reports2))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Reports2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(18, 18, 18)
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
               String sql="SELECT \n" +
"Customer.CustomerID,\n" +
"Customer.RegistrationDate,\n" +
"CustomerStatus.CustomerStatusName,\n" +
"Customer.LastName AS 'Last Name',\n" +
"Customer.FirstName AS 'First Name',\n" +
"Customer.Email AS 'Email Address',\n" +
"Customer.MailingAddress AS 'Mailing Address',\n" +
"Customer.MailingCity AS 'City',\n" +
"StateProvince.StateProvinceName,\n" +
"Customer.MailingZipCode AS 'ZIP Code',\n" +
"Country.CountryName,\n" +
"COUNT(WorkOrderID) AS 'Number of WOs'\n" +
"\n" +
"FROM Customer\n" +
"Left join CustomerStatus ON Customer.CustomerStatusID = CustomerStatus.CustomerStatusID\n" +
"Left join StateProvince ON Customer.StateProvinceID = StateProvince.StateProvinceID\n" +
"LEFT join Country ON Customer.CountryID = Country.CountryID\n" +
"LEFT join WorkOrder ON Customer.CustomerID = WorkOrder.CustomerID\n" +
"\n" +
"WHERE Customer.RegistrationDate BETWEEN '2019-01-01' AND '2019-12-31' \n" +
"AND WorkOrder.WorkOrderDate BETWEEN '2019-01-01' AND '2019-12-31' \n" +
"\n" +
"GROUP BY Customer.CustomerID,Customer.RegistrationDate, CustomerStatus.CustomerStatusName, Customer.LastName, Customer.FirstName, Customer.Email, Customer.MailingAddress, Customer.MailingCity, StateProvince.StateProvinceName, Customer.MailingZipCode, Country.CountryName";

               

                      
               PreparedStatement pst=con.prepareStatement(sql);
               ResultSet rs=pst.executeQuery();
               DefaultTableModel AppointmentTM=(DefaultTableModel)Appointmenttable.getModel();
               AppointmentTM.setRowCount(0);
               
               while(rs.next())
               {
                   Object o[]={rs.getString("CustomerID"),rs.getString("RegistrationDate"),rs.getString("CustomerStatusName"),rs.getString("Last Name"),rs.getString("First Name"), rs.getString("Email Address"), rs.getString("Mailing Address"),  rs.getString("City"),  rs.getString("StateProvinceName"),  rs.getString("ZIP Code"),  rs.getString("CountryName"),  rs.getString("Number of WOs")};
                   AppointmentTM.addRow(o);
               }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e);
        }
        
        
    }//GEN-LAST:event_btnNewActionPerformed

    private void Reports2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reports2ActionPerformed
new Reports().setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_Reports2ActionPerformed

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
            java.util.logging.Logger.getLogger(CRi2019aWOCtY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRi2019aWOCtY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRi2019aWOCtY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRi2019aWOCtY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new CRi2019aWOCtY().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Appointmenttable;
    private javax.swing.JButton Reports2;
    private javax.swing.JButton btnNew;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}