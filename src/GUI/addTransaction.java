
package GUI;

import javax.swing.JOptionPane;
import Functions.transactionFunctions;

public class addTransaction extends mainMenu {
    
    public addTransaction() {
    	getTitleLabel().setVisible(false);
        initComponents();
        setBackToMain();
    }

    private void initComponents() {

        titleL = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        shipDistrictCB = new javax.swing.JComboBox<>();
        invoiceNoL = new javax.swing.JLabel();
        invoiceNoTF = new javax.swing.JTextField();
        shipNameL = new javax.swing.JLabel();
        shipNameTF = new javax.swing.JTextField();
        companyNameL = new javax.swing.JLabel();
        debtL = new javax.swing.JLabel();
        downpaymentL = new javax.swing.JLabel();
        paymentTypeL = new javax.swing.JLabel();
        commissionL = new javax.swing.JLabel();
        taxL = new javax.swing.JLabel();
        dateL = new javax.swing.JLabel();
        companyNameTF = new javax.swing.JTextField();
        downPaymentTF = new javax.swing.JTextField();
        debtAmountTF1 = new javax.swing.JTextField();
        commissionTF = new javax.swing.JTextField();
        taxTF = new javax.swing.JTextField();
        dateTF = new javax.swing.JTextField();
        paymentTypeCB = new javax.swing.JComboBox<>();
        addButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleL.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        
        titleL.setText("Adding Transaction");
        jLabel2.setText("Ship district:");

        shipDistrictCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Juana", "Tegal", "Muara Angke", "Muara Baru", "Cirebon", "Cumi Timur" }));
        dateTF.setText("yyyy-mm-dd");
        paymentTypeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Credit Card", "Cheque", "Cash", "Transfer Bank" }));
        invoiceNoL.setText("Invoice Number:");


        shipNameL.setText("Ship name:");

        companyNameL.setText("Company name:");

        debtL.setText("Debt Amount (RP):");

        downpaymentL.setText("Downpayment (RP):");

        paymentTypeL.setText("Payment Type:");

        commissionL.setText("Commission (RP):");

        taxL.setText("Tax:");

        dateL.setText("Date:");

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(invoiceNoL)
                            .addComponent(jLabel2)
                            .addComponent(shipNameL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(shipDistrictCB, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(invoiceNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(shipNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(companyNameL)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(debtL)
                                .addGap(4, 4, 4)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(companyNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(debtAmountTF1))))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(downpaymentL)
                    .addComponent(commissionL)
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
                .addContainerGap(127, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(titleL, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(291, 291, 291))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(addButton)
                        .addGap(145, 145, 145))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(paymentTypeCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titleL, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(shipDistrictCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(downpaymentL)
                            .addComponent(downPaymentTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(invoiceNoL)
                            .addComponent(invoiceNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(commissionL)
                            .addComponent(commissionTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(shipNameL)
                            .addComponent(shipNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(taxL)
                            .addComponent(taxTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(companyNameL)
                            .addComponent(dateL)
                            .addComponent(companyNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(debtL)
                                .addComponent(paymentTypeL))
                            .addComponent(debtAmountTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(49, 49, 49)
                .addComponent(addButton)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }


    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {

       transactionFunctions t = new transactionFunctions();
       try {
       int remainingDebt = t.getDebt(Integer.parseInt(debtAmountTF1.getText()), Integer.parseInt(downPaymentTF.getText()), 
    		   Integer.parseInt(commissionTF.getText()), Integer.parseInt(taxTF.getText()));
       t.insert((String)shipDistrictCB.getSelectedItem(), invoiceNoTF.getText(), shipNameTF.getText(), companyNameTF.getText(), 
    		   Integer.parseInt(debtAmountTF1.getText()), Integer.parseInt(downPaymentTF.getText()), Integer.parseInt
    		   (commissionTF.getText()), Integer.parseInt(taxTF.getText()), dateTF.getText(), (String)paymentTypeCB.getSelectedItem(), 
    		   t.getPaidStatus(remainingDebt), remainingDebt);
       }
       catch(Exception e) {
    	   JOptionPane.showMessageDialog(null, e.getMessage()+", Check your input!", "Input Error", JOptionPane.ERROR_MESSAGE);
       }
    }


    public static void main(String args[]) {


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addTransaction().setVisible(true);
            }
        });



    }

    private javax.swing.JButton addButton;
    private javax.swing.JTextField commissionTF;
    private javax.swing.JTextField companyNameTF;
    private javax.swing.JTextField dateTF;
    private javax.swing.JTextField debtAmountTF1;
    private javax.swing.JTextField downPaymentTF;
    private javax.swing.JTextField invoiceNoTF;
    private javax.swing.JLabel titleL;
    private javax.swing.JLabel taxL;
    private javax.swing.JLabel dateL;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel invoiceNoL;
    private javax.swing.JLabel shipNameL;
    private javax.swing.JLabel companyNameL;
    private javax.swing.JLabel debtL;
    private javax.swing.JLabel downpaymentL;
    private javax.swing.JLabel paymentTypeL;
    private javax.swing.JLabel commissionL;
    private javax.swing.JComboBox<String> paymentTypeCB;
    private javax.swing.JComboBox<String> shipDistrictCB;
    private javax.swing.JTextField shipNameTF;
    private javax.swing.JTextField taxTF;
}
