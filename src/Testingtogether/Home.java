/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testingtogether;

/**
 *
 * @author HP
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form 
     */
    public Home() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Appointment = new javax.swing.JButton();
        Feedback = new javax.swing.JButton();
        Decision = new javax.swing.JButton();
        Modification = new javax.swing.JButton();
        Warranty = new javax.swing.JButton();
        CustomerRequest = new javax.swing.JButton();
        Customer = new javax.swing.JButton();
        Mileage = new javax.swing.JButton();
        WorkOrderLine = new javax.swing.JButton();
        WorkOrderLineAssignment = new javax.swing.JButton();
        Template = new javax.swing.JButton();
        WorkOrder = new javax.swing.JButton();
        WorkOrderLineForm = new javax.swing.JButton();
        SubContractor = new javax.swing.JButton();
        SubContractorService = new javax.swing.JButton();
        Service = new javax.swing.JButton();
        Employee = new javax.swing.JButton();
        HOA = new javax.swing.JButton();
        EmployeeAssignment = new javax.swing.JButton();
        HOARequest = new javax.swing.JButton();
        GovernmentAgency = new javax.swing.JButton();
        Inspection = new javax.swing.JButton();
        PurchaseOrder = new javax.swing.JButton();
        PermitRequest = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));
        jPanel1.setForeground(new java.awt.Color(10, 10, 10));
        jPanel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel1.setBackground(new java.awt.Color(255, 153, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Home Page");

        Appointment.setText("Appointment");
        Appointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppointmentActionPerformed(evt);
            }
        });

        Feedback.setText("Feedback");
        Feedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FeedbackActionPerformed(evt);
            }
        });

        Decision.setText("Decision");
        Decision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecisionActionPerformed(evt);
            }
        });

        Modification.setText("Modification");
        Modification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificationActionPerformed(evt);
            }
        });

        Warranty.setText("Warranty");
        Warranty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WarrantyActionPerformed(evt);
            }
        });

        CustomerRequest.setText("Customer Req.");
        CustomerRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerRequestActionPerformed(evt);
            }
        });

        Customer.setText("Customer");
        Customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerActionPerformed(evt);
            }
        });

        Mileage.setText("Mileage");
        Mileage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MileageActionPerformed(evt);
            }
        });

        WorkOrderLine.setText("WOL");
        WorkOrderLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WorkOrderLineActionPerformed(evt);
            }
        });

        WorkOrderLineAssignment.setText("WOL Assign.");
        WorkOrderLineAssignment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WorkOrderLineAssignmentActionPerformed(evt);
            }
        });

        Template.setText("Template");
        Template.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TemplateActionPerformed(evt);
            }
        });

        WorkOrder.setText("Work Order");
        WorkOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WorkOrderActionPerformed(evt);
            }
        });

        WorkOrderLineForm.setText("WOL Form");
        WorkOrderLineForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WorkOrderLineFormActionPerformed(evt);
            }
        });

        SubContractor.setText("Sub-Contractor");
        SubContractor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubContractorActionPerformed(evt);
            }
        });

        SubContractorService.setText("SC Service");
        SubContractorService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubContractorServiceActionPerformed(evt);
            }
        });

        Service.setText("Service");
        Service.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServiceActionPerformed(evt);
            }
        });

        Employee.setText("Employee");
        Employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeActionPerformed(evt);
            }
        });

        HOA.setText("HOA");
        HOA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HOAActionPerformed(evt);
            }
        });

        EmployeeAssignment.setText("Employee Assign.");
        EmployeeAssignment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeAssignmentActionPerformed(evt);
            }
        });

        HOARequest.setText("HOA Request");
        HOARequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HOARequestActionPerformed(evt);
            }
        });

        GovernmentAgency.setText("Gov't Agency");
        GovernmentAgency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GovernmentAgencyActionPerformed(evt);
            }
        });

        Inspection.setText("Inspection");
        Inspection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InspectionActionPerformed(evt);
            }
        });

        PurchaseOrder.setText("Purchase Order");
        PurchaseOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PurchaseOrderActionPerformed(evt);
            }
        });

        PermitRequest.setText("Permit Request");
        PermitRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PermitRequestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Warranty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Decision, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Modification, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Template, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(WorkOrderLineForm, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Customer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Appointment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CustomerRequest, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Feedback, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(HOARequest, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Mileage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(WorkOrder, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(WorkOrderLine, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(WorkOrderLineAssignment, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(SubContractor, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Service, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(SubContractorService, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(PurchaseOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(EmployeeAssignment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Employee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(16, 16, 16)
                                .addComponent(HOA, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(GovernmentAgency, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Inspection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PermitRequest, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                .addContainerGap(129, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(315, 315, 315))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Customer, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(WorkOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SubContractor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Employee, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HOA, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Appointment, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mileage, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Service, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmployeeAssignment, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HOARequest, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SubContractorService, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CustomerRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(WorkOrderLine, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Feedback, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(WorkOrderLineAssignment, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PurchaseOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(GovernmentAgency, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Inspection, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(PermitRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Decision, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Template, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Modification, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WorkOrderLineForm, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Warranty, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(261, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MileageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MileageActionPerformed
        // TODO add your handling code here:
        new Mileage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MileageActionPerformed

    private void WorkOrderLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WorkOrderLineActionPerformed
        // TODO add your handling code here:
        new Work_Order_Line().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_WorkOrderLineActionPerformed

    private void TemplateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TemplateActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TemplateActionPerformed

    private void ServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServiceActionPerformed
        // TODO add your handling code here:
        new Service().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ServiceActionPerformed

    private void SubContractorServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubContractorServiceActionPerformed
        // TODO add your handling code here:
        new SubcontractorService().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_SubContractorServiceActionPerformed

    private void HOARequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HOARequestActionPerformed
        // TODO add your handling code here:
        new HOARequest().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_HOARequestActionPerformed

    private void WorkOrderLineAssignmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WorkOrderLineAssignmentActionPerformed
        // TODO add your handling code here:
        new Work_Order_Line_Assignment().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_WorkOrderLineAssignmentActionPerformed

    private void GovernmentAgencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GovernmentAgencyActionPerformed
        // TODO add your handling code here:
        new GovernmentAgency().setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_GovernmentAgencyActionPerformed

    private void CustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerActionPerformed
        // TODO add your handling code here:
        new customer().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CustomerActionPerformed

    private void AppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppointmentActionPerformed
        // TODO add your handling code here:
        new Appointment().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AppointmentActionPerformed

    private void CustomerRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerRequestActionPerformed
        // TODO add your handling code here:
        new Customer_Request().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CustomerRequestActionPerformed

    private void FeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FeedbackActionPerformed
        // TODO add your handling code here:
        new Feedback().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_FeedbackActionPerformed

    private void DecisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecisionActionPerformed
        // TODO add your handling code here:
        new Decision().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_DecisionActionPerformed

    private void ModificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificationActionPerformed
        // TODO add your handling code here:
        new Modification().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ModificationActionPerformed

    private void WarrantyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WarrantyActionPerformed
        // TODO add your handling code here:
        new Warranty().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_WarrantyActionPerformed

    private void WorkOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WorkOrderActionPerformed
        // TODO add your handling code here:
        new Work_Order().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_WorkOrderActionPerformed

    private void WorkOrderLineFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WorkOrderLineFormActionPerformed
        // TODO add your handling code here:
        new work_orderline_form().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_WorkOrderLineFormActionPerformed

    private void SubContractorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubContractorActionPerformed
        // TODO add your handling code here:
        new Subcontractor().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_SubContractorActionPerformed

    private void PurchaseOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PurchaseOrderActionPerformed
        // TODO add your handling code here:
        new PurchaseOrder().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_PurchaseOrderActionPerformed

    private void EmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeActionPerformed
        // TODO add your handling code here:
        new Employee().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_EmployeeActionPerformed

    private void EmployeeAssignmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeAssignmentActionPerformed
        // TODO add your handling code here:
        new employee_assignment().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_EmployeeAssignmentActionPerformed

    private void HOAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HOAActionPerformed
        // TODO add your handling code here:
        new HOA().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_HOAActionPerformed

    private void InspectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InspectionActionPerformed
        // TODO add your handling code here:
        new Inspection().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_InspectionActionPerformed

    private void PermitRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PermitRequestActionPerformed
        // TODO add your handling code here:
        new PermitRequest().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_PermitRequestActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Appointment;
    private javax.swing.JButton Customer;
    private javax.swing.JButton CustomerRequest;
    private javax.swing.JButton Decision;
    private javax.swing.JButton Employee;
    private javax.swing.JButton EmployeeAssignment;
    private javax.swing.JButton Feedback;
    private javax.swing.JButton GovernmentAgency;
    private javax.swing.JButton HOA;
    private javax.swing.JButton HOARequest;
    private javax.swing.JButton Inspection;
    private javax.swing.JButton Mileage;
    private javax.swing.JButton Modification;
    private javax.swing.JButton PermitRequest;
    private javax.swing.JButton PurchaseOrder;
    private javax.swing.JButton Service;
    private javax.swing.JButton SubContractor;
    private javax.swing.JButton SubContractorService;
    private javax.swing.JButton Template;
    private javax.swing.JButton Warranty;
    private javax.swing.JButton WorkOrder;
    private javax.swing.JButton WorkOrderLine;
    private javax.swing.JButton WorkOrderLineAssignment;
    private javax.swing.JButton WorkOrderLineForm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
