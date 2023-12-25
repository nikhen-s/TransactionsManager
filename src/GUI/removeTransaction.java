
package GUI;

import javax.swing.JOptionPane;


import Functions.transactionFunctions;

public class removeTransaction extends mainMenu {

    public removeTransaction() {
    	getTitleLabel().setVisible(false);
    	setBackToMain();
    	initComponents();
    }


  
    private void initComponents() {

        instructionL = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        invoiceNoTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        instructionL.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        instructionL.setText("Enter the Invoice Number of the Transaction To Be Removed:");

        deleteButton.setText("Confirm");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(instructionL)
                .addContainerGap(133, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(deleteButton)
                        .addGap(318, 318, 318))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(invoiceNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(267, 267, 267))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(instructionL)
                .addGap(47, 47, 47)
                .addComponent(invoiceNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(deleteButton)
                .addContainerGap(276, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {

        transactionFunctions t = new transactionFunctions();
        try {
        t.delete(invoiceNoTF.getText());
        }
        catch(Exception e) {
     	   JOptionPane.showMessageDialog(null, e.getMessage()+", Check your input!", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new removeTransaction().setVisible(true);
            }
        });

    }


    private javax.swing.JTextField invoiceNoTF;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel instructionL;

}
