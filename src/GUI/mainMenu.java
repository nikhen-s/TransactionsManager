
package GUI;

import javax.swing.*;
import java.awt.*;

public class mainMenu extends javax.swing.JFrame {

    public mainMenu() {
     initComponents();
    }
    private void initComponents(){
       
      menuBar = new javax.swing.JMenuBar();
      transactionMenu = new javax.swing.JMenu();
      informationMenu = new javax.swing.JMenu();
      displayingDataMenu = new javax.swing.JMenu();
      backToMainMenu =  new javax.swing.JMenu();
      addTransactionMI = new javax.swing.JMenuItem();
      editTransactionMI = new javax.swing.JMenuItem();
      searchDataMI = new javax.swing.JMenuItem();
      deleteTransactionMI = new javax.swing.JMenuItem();
      sortAndDisplayDataMI = new javax.swing.JMenuItem();
      displayDataMI = new javax.swing.JMenuItem();
      informationMI = new javax.swing.JMenuItem();
      backToMainMI = new javax.swing.JMenuItem();
      backToMainMI.setText("Back");
      backToMainMenu.setText("Back To Main Menu");
      transactionMenu.setText("Transactions");
      addTransactionMI.setText("Add Transaction");
      editTransactionMI.setText("Edit Transaction");
      searchDataMI.setText("Search Data");
      deleteTransactionMI.setText("Delete Transaction");
      displayingDataMenu.setText("Displaying data");
      sortAndDisplayDataMI.setText("Sort and Display Data");
      informationMenu.setText("Information");
      displayDataMI.setText("Display Data");
      informationMI.setText("Information");
      transactionMenu.add(addTransactionMI);
      transactionMenu.add(editTransactionMI);
      transactionMenu.add(deleteTransactionMI);
      displayingDataMenu.add(displayDataMI);
      displayingDataMenu.add(sortAndDisplayDataMI);
      displayingDataMenu.add(searchDataMI);
      informationMenu.add(informationMI);
      backToMainMenu.add(backToMainMI);
      menuBar.add(transactionMenu);
      menuBar.add(displayingDataMenu);
      menuBar.add(informationMenu);
      menuBar.add(backToMainMenu);
      backToMainMenu.setVisible(false);
      setJMenuBar(menuBar);
      
      //properties only for MainMenu
      Font f1= new Font("SansSerif",Font.BOLD,25);
      titleL = new javax.swing.JLabel("Transactions Program");
      titleL.setFont(f1);
      //
      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      addTransactionMI.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              addTransactionMIActionPerformed(evt);
          }
      });

      editTransactionMI.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              editTransactionMIActionPerformed(evt);
          }
      });

      searchDataMI.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              searchDataMIActionPerformed(evt);
          }
      });

      deleteTransactionMI.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              deleteTransactionMIActionPerformed(evt);
          }
      });

      sortAndDisplayDataMI.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              sortAndDisplayDataMIActionPerformed(evt);
          }
      });
      
      informationMI.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              informationMIActionPerformed(evt);
          }
      });
      
      
      displayDataMI.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              displayDataMIActionPerformed(evt);
          }
      });
      backToMainMI.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              backToMainMIActionPerformed(evt);
          }
      });
      

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(234, Short.MAX_VALUE)
                .addComponent(titleL)
                .addGap(232, 232, 232))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(titleL)
                .addContainerGap(405, Short.MAX_VALUE))
        );
        

      pack();
      setLocationRelativeTo(null);
    }
    private void closeAllWindows() {
    	java.awt.Window win[] = java.awt.Window.getWindows();
    	for(int i=0;i<win.length;i++){
    	win[i].dispose();
    	}
    }
    
    private void addTransactionMIActionPerformed(java.awt.event.ActionEvent evt) {
    	
    	closeAllWindows();
        new displayData().setVisible(true);
        new addTransaction().setVisible(true);
    }
    
    private void editTransactionMIActionPerformed(java.awt.event.ActionEvent evt) {
    	closeAllWindows();
        new displayData().setVisible(true);
        new editTransaction().setVisible(true);
    }
    
    private void searchDataMIActionPerformed(java.awt.event.ActionEvent evt) {
    	closeAllWindows();
        new searchData().setVisible(true);
    }
    
    private void sortAndDisplayDataMIActionPerformed(java.awt.event.ActionEvent evt) {
    	closeAllWindows();
        new sortAndDisplay().setVisible(true);
    }
    
    private void deleteTransactionMIActionPerformed(java.awt.event.ActionEvent evt) {
    	closeAllWindows();
        new displayData().setVisible(true);
        new removeTransaction().setVisible(true);
    }
    
    private void informationMIActionPerformed(java.awt.event.ActionEvent evt){
    	closeAllWindows();
        new displayData().setVisible(true);
        new information().setVisible(true);
    }
    
    private void displayDataMIActionPerformed(java.awt.event.ActionEvent evt){
    	closeAllWindows();
        new displayData().setVisible(true); 
    }
    
    private void backToMainMIActionPerformed(java.awt.event.ActionEvent evt){
    	closeAllWindows();
        new mainMenu().setVisible(true);
    }
   
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainMenu().setVisible(true);
            }
        });

    }
    
    public javax.swing.JMenu getBackToMain() {
    	return backToMainMenu;
    }
    public void setBackToMain() {
    	backToMainMenu.setVisible(true);
    }

    public javax.swing.JLabel getTitleLabel(){
    	return titleL;
    }
    public void setTitleLabel(String x) {
    	titleL.setText(x);
    }

    private javax.swing.JMenuItem addTransactionMI;
    private javax.swing.JMenuItem deleteTransactionMI;
    private javax.swing.JMenuItem editTransactionMI;
    private javax.swing.JMenu informationMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem searchDataMI;
    private javax.swing.JMenuItem sortAndDisplayDataMI;
    private javax.swing.JMenu displayingDataMenu;
    private javax.swing.JMenuItem displayDataMI;
    private javax.swing.JMenuItem informationMI;
    private javax.swing.JMenu transactionMenu;
    private javax.swing.JMenuItem backToMainMI;
    private javax.swing.JMenu backToMainMenu;
    private javax.swing.JLabel titleL;

}
