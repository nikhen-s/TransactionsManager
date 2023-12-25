
package GUI;

import javax.swing.JOptionPane;

import Functions.transactionFunctions;

public class editTransaction extends mainMenu {
    String ShipDistrict, InvoiceNumber, Shipname, Companyname, Date, PaymentType, PaidOrNot = "";
    int InitialDebt, Downpayment, Commission, Tax, CurrentDebt = 0;

    public editTransaction() {
    	getTitleLabel().setVisible(false);
    	initComponents();
        setBackToMain();
        
    }
    
    public void initiation(String InvoiceNo){
        transactionFunctions t = new transactionFunctions();
        String values[] = t.retrieve(InvoiceNo);
        ShipDistrict = values[0];
        InvoiceNumber = values[1];
        Shipname = values[2];
        Companyname = values[3];
        InitialDebt = Integer.parseInt(values[4]);
        Downpayment = Integer.parseInt(values[5]);
        Commission = Integer.parseInt(values[6]);
        Tax = Integer.parseInt(values[7]);
        Date = values[8];
        PaymentType = values[9];
        PaidOrNot = values[10];
    }
    
    public void transferInput(){

        if(shipDistrictCheckBox.isSelected()){
            ShipDistrict = (String)shipDistrictCB.getSelectedItem();
        }
        if(invoiceNoCheckBox.isSelected()){
            InvoiceNumber = invoiceNoTF.getText();
        }
        if(shipNameCheckBox.isSelected()){
            Shipname = shipNameTF.getText();
        }
        if(companyNameCheckBox.isSelected()){
            Companyname = companyNameTF.getText();
        }
        if(debtAmountCheckBox.isSelected()){
            InitialDebt = Integer.parseInt(debtAmountTF1.getText());
        }
        if(downPaymentCheckBox.isSelected()){
            Downpayment = Integer.parseInt(downPaymentTF.getText());
        }
        if(commissionCheckBox.isSelected()){
            Commission = Integer.parseInt(commissionTF.getText());
        }
        if(taxCheckBox.isSelected()){
            Tax = Integer.parseInt(taxTF.getText());
        }
        if(dateCheckBox.isSelected()){
            Date = dateTF.getText();
        }
        if(paymentTypeCheckBox.isSelected()){
            PaymentType = (String)paymentTypeCB.getSelectedItem();
        }

    }


    private void initComponents() {

        titleL = new javax.swing.JLabel();
        shipDistrictL = new javax.swing.JLabel();
        shipDistrictCB = new javax.swing.JComboBox<>();
        invoiceNoL = new javax.swing.JLabel();
        invoiceNoTF = new javax.swing.JTextField();
        shipNameL = new javax.swing.JLabel();
        shipNameTF = new javax.swing.JTextField();
        companyNameL = new javax.swing.JLabel();
        debtL = new javax.swing.JLabel();
        downpaymentL = new javax.swing.JLabel();
        paymentTypeL = new javax.swing.JLabel();
        commissionl = new javax.swing.JLabel();
        taxL = new javax.swing.JLabel();
        dateL = new javax.swing.JLabel();
        companyNameTF = new javax.swing.JTextField();
        downPaymentTF = new javax.swing.JTextField();
        debtAmountTF1 = new javax.swing.JTextField();
        commissionTF = new javax.swing.JTextField();
        taxTF = new javax.swing.JTextField();
        dateTF = new javax.swing.JTextField();
        paymentTypeCB = new javax.swing.JComboBox<>();
        editButton = new javax.swing.JButton();
        instructionL = new javax.swing.JLabel();
        oldInvoiceNoTF = new javax.swing.JTextField();
        invoiceNoCheckBox = new javax.swing.JCheckBox();
        shipDistrictCheckBox = new javax.swing.JCheckBox();
        shipNameCheckBox = new javax.swing.JCheckBox();
        debtAmountCheckBox = new javax.swing.JCheckBox();
        companyNameCheckBox = new javax.swing.JCheckBox();
        downPaymentCheckBox = new javax.swing.JCheckBox();
        commissionCheckBox = new javax.swing.JCheckBox();
        taxCheckBox = new javax.swing.JCheckBox();
        dateCheckBox = new javax.swing.JCheckBox();
        paymentTypeCheckBox = new javax.swing.JCheckBox();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleL.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        titleL.setText("Editing Transaction");

        shipDistrictL.setText("Ship district:");

        shipDistrictCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Juana", "Tegal", "Muara Angke", "Muara Baru", "Cirebon", "Cumi Timur" }));

        invoiceNoL.setText("New Invoice Number:");

        shipNameL.setText("Ship name:");

        companyNameL.setText("Company name:");

        debtL.setText("Debt Amount (RP):");

        downpaymentL.setText("Downpayment (RP):");

        paymentTypeL.setText("Payment Type:");

        commissionl.setText("Commision (RP):");

        taxL.setText("Tax:");

        dateL.setText("Date:");
        dateTF.setText("yyyy-mm-dd");
        paymentTypeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Credit Card", "Cheque", "Cash", "Transfer Bank" }));

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        instructionL.setText("Enter the Invoice Number of the field to be edited:");


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(titleL, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(291, 291, 291))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(editButton)
                        .addGap(145, 145, 145))))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(instructionL)
                .addGap(18, 18, 18)
                .addComponent(oldInvoiceNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(invoiceNoCheckBox)
                    .addComponent(shipDistrictCheckBox)
                    .addComponent(shipNameCheckBox)
                    .addComponent(debtAmountCheckBox, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(companyNameCheckBox, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(companyNameL)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(debtL)
                                .addGap(4, 4, 4)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(companyNameTF)
                            .addComponent(debtAmountTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(invoiceNoL)
                            .addComponent(shipDistrictL)
                            .addComponent(shipNameL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(shipDistrictCB, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(invoiceNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(shipNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(downPaymentCheckBox)
                    .addComponent(commissionCheckBox)
                    .addComponent(taxCheckBox)
                    .addComponent(dateCheckBox)
                    .addComponent(paymentTypeCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(downpaymentL)
                    .addComponent(commissionl)
                    .addComponent(taxL)
                    .addComponent(dateL)
                    .addComponent(paymentTypeL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(taxTF, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(commissionTF, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(downPaymentTF)
                    .addComponent(dateTF, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(paymentTypeCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(83, 83, 83))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(paymentTypeCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titleL, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(instructionL)
                            .addComponent(oldInvoiceNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(downpaymentL)
                                            .addComponent(downPaymentTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(downPaymentCheckBox)
                                        .addGap(31, 31, 31)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(commissionl)
                                        .addComponent(commissionTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(commissionCheckBox))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(taxCheckBox)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dateCheckBox))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(taxL)
                                            .addComponent(taxTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(dateL)
                                            .addComponent(dateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(paymentTypeCheckBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(paymentTypeL)
                                        .addGap(10, 10, 10))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(invoiceNoL)
                                    .addComponent(invoiceNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(invoiceNoCheckBox))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(shipDistrictL)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(shipDistrictCheckBox)
                                            .addComponent(shipDistrictCB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(shipNameL)
                                                .addComponent(shipNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(shipNameCheckBox))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(companyNameCheckBox, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(companyNameL))
                                            .addComponent(companyNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(debtL)
                                                .addComponent(debtAmountTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(debtAmountCheckBox)
                                                .addGap(10, 10, 10)))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(49, 49, 49)
                .addComponent(editButton)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {
        transactionFunctions t = new transactionFunctions();
        try {
        initiation(oldInvoiceNoTF.getText());
        transferInput();
        int remainingDebt = t.getDebt(InitialDebt, Downpayment, Commission, Tax);
        t.update(ShipDistrict, InvoiceNumber, Shipname, Companyname, InitialDebt, Downpayment, Commission, Tax, Date, 
                PaymentType, t.getPaidStatus(remainingDebt), remainingDebt, oldInvoiceNoTF.getText());
        }
        catch(Exception e) {
     	   JOptionPane.showMessageDialog(null, e.getMessage()+", Check your input!", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editTransaction().setVisible(true);
                
            }
        });
    }

    private javax.swing.JCheckBox commissionCheckBox;
    private javax.swing.JTextField commissionTF;
    private javax.swing.JCheckBox companyNameCheckBox;
    private javax.swing.JTextField companyNameTF;
    private javax.swing.JCheckBox dateCheckBox;
    private javax.swing.JTextField dateTF;
    private javax.swing.JCheckBox debtAmountCheckBox;
    private javax.swing.JTextField debtAmountTF1;
    private javax.swing.JCheckBox downPaymentCheckBox;
    private javax.swing.JTextField downPaymentTF;
    private javax.swing.JButton editButton;
    private javax.swing.JCheckBox invoiceNoCheckBox;
    private javax.swing.JTextField invoiceNoTF;
    private javax.swing.JLabel titleL;
    private javax.swing.JLabel taxL;
    private javax.swing.JLabel dateL;
    private javax.swing.JLabel instructionL;
    private javax.swing.JLabel shipDistrictL;
    private javax.swing.JLabel invoiceNoL;
    private javax.swing.JLabel shipNameL;
    private javax.swing.JLabel companyNameL;
    private javax.swing.JLabel debtL;
    private javax.swing.JLabel downpaymentL;
    private javax.swing.JLabel paymentTypeL;
    private javax.swing.JLabel commissionl;
    private javax.swing.JTextField oldInvoiceNoTF;
    private javax.swing.JComboBox<String> paymentTypeCB;
    private javax.swing.JCheckBox paymentTypeCheckBox;
    private javax.swing.JComboBox<String> shipDistrictCB;
    private javax.swing.JCheckBox shipDistrictCheckBox;
    private javax.swing.JCheckBox shipNameCheckBox;
    private javax.swing.JTextField shipNameTF;
    private javax.swing.JCheckBox taxCheckBox;
    private javax.swing.JTextField taxTF;
}
