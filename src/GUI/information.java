 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Functions.transactionFunctions;

public class information extends mainMenu {
    public information() {
    	setBackToMain();
        getTitleLabel().setVisible(false);
    	initComponents();
        
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        shipNamesTable = new javax.swing.JTable();
        orderShipnamesButton = new javax.swing.JButton();
        listOfShipnamesL = new javax.swing.JLabel();
        totalDebtL = new javax.swing.JLabel();
        calculateDebtButton = new javax.swing.JButton();
        debtTF = new javax.swing.JTextField();
        totalSurplusL = new javax.swing.JLabel();
        calculateSurplusButton = new javax.swing.JButton();
        surplusTF = new javax.swing.JTextField();
        unresolvedL = new javax.swing.JLabel();
        calculateUnresolvedButton = new javax.swing.JButton();
        unresolvedTF = new javax.swing.JTextField();
        resolvedL = new javax.swing.JLabel();
        calculateResolvedButton = new javax.swing.JButton();
        resolvedTF = new javax.swing.JTextField();
        totalNoTransactionsL = new javax.swing.JLabel();
        calculateTransactionsButton = new javax.swing.JButton();
        transactionsTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        shipNamesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Shipname", "Transactions under this Shipname"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(shipNamesTable);

        orderShipnamesButton.setText("Display Shipnames in order");
        orderShipnamesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionPerformed(evt);
            }
        });

        listOfShipnamesL.setText("List of Shipnames:");

        totalDebtL.setText("Total Debt to pay: ");

        calculateDebtButton.setText("Calculate");
        calculateDebtButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateDebtButtonActionPerformed(evt);
            }
        });

        debtTF.setText("Debt");

        totalSurplusL.setText("Total Surplus Payments:");

        calculateSurplusButton.setText("Calculate");
        calculateSurplusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateSurplusButtonActionPerformed(evt);
            }
        });

        surplusTF.setText("Surplus");
    

        unresolvedL.setText("No. Unresolved Transactions:");

        calculateUnresolvedButton.setText("Calculate");
        calculateUnresolvedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateUnresolvedButtonActionPerformed(evt);
            }
        });

        unresolvedTF.setText("Unresolved Transactions");


        resolvedL.setText("No. Resolved Transactions:");

        calculateResolvedButton.setText("Calculate");
        calculateResolvedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateResolvedButtonActionPerformed(evt);
            }
        });

        resolvedTF.setText("Resolved Transactions");


        totalNoTransactionsL.setText("Total No. of Transactions");

        calculateTransactionsButton.setText("Calculate");
        calculateTransactionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateTransactionsButtonActionPerformed(evt);
            }
        });

        transactionsTF.setText("Number of Transactions");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(orderShipnamesButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(listOfShipnamesL))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(resolvedL)
                            .addGap(26, 26, 26))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(calculateResolvedButton)
                            .addGap(97, 97, 97)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(calculateUnresolvedButton)
                            .addGap(199, 199, 199))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(unresolvedL)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(resolvedTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(unresolvedTF)
                                .addComponent(transactionsTF))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(totalNoTransactionsL)
                            .addGap(26, 26, 26))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(calculateTransactionsButton)
                            .addGap(86, 86, 86)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(totalDebtL)
                                    .addComponent(calculateDebtButton)
                                    .addComponent(totalSurplusL))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(debtTF, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(surplusTF, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(calculateSurplusButton))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(listOfShipnamesL, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(orderShipnamesButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(totalDebtL)
                                    .addComponent(debtTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addComponent(calculateDebtButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalSurplusL, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(surplusTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(calculateSurplusButton)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(calculateUnresolvedButton))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(unresolvedTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(unresolvedL)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resolvedTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(resolvedL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(calculateResolvedButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalNoTransactionsL)
                            .addComponent(transactionsTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calculateTransactionsButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void ActionPerformed(java.awt.event.ActionEvent evt) {
        transactionFunctions t = new transactionFunctions();
        t.displayOrderedShips(t.retrieve(), shipNamesTable);
    }
    
    private void calculateDebtButtonActionPerformed(java.awt.event.ActionEvent evt) {

        transactionFunctions t = new transactionFunctions();
        debtTF.setText(Integer.toString(t.calculateTotalDebt()));
    }

    private void calculateSurplusButtonActionPerformed(java.awt.event.ActionEvent evt) {
 
        transactionFunctions t = new transactionFunctions();
        surplusTF.setText(Integer.toString(-t.calculateSurplus()));
    }

    private void calculateUnresolvedButtonActionPerformed(java.awt.event.ActionEvent evt) {

        transactionFunctions t = new transactionFunctions();
        unresolvedTF.setText(Integer.toString(t.calculateUnresolved(t.calculateNoTransactions(),t.calculateResolved())));
    }

    private void calculateResolvedButtonActionPerformed(java.awt.event.ActionEvent evt) {

        transactionFunctions t = new transactionFunctions();
        resolvedTF.setText(Integer.toString(t.calculateResolved()));
    }

    private void calculateTransactionsButtonActionPerformed(java.awt.event.ActionEvent evt) {

        transactionFunctions t = new transactionFunctions();
        transactionsTF.setText(Integer.toString(t.calculateNoTransactions()));
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new information().setVisible(true);
            }
        });
    }

    private javax.swing.JButton calculateDebtButton;
    private javax.swing.JButton calculateResolvedButton;
    private javax.swing.JButton calculateSurplusButton;
    private javax.swing.JButton calculateTransactionsButton;
    private javax.swing.JButton calculateUnresolvedButton;
    private javax.swing.JTextField debtTF;
    private javax.swing.JButton orderShipnamesButton;
    private javax.swing.JLabel listOfShipnamesL;
    private javax.swing.JLabel totalDebtL;
    private javax.swing.JLabel totalSurplusL;
    private javax.swing.JLabel unresolvedL;
    private javax.swing.JLabel resolvedL;
    private javax.swing.JLabel totalNoTransactionsL;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable shipNamesTable;
    private javax.swing.JTextField resolvedTF;
    private javax.swing.JTextField surplusTF;
    private javax.swing.JTextField transactionsTF;
    private javax.swing.JTextField unresolvedTF;

}
