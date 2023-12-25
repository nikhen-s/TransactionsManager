
package Functions;


import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

public class transactionFunctions extends connect{
    //how they gonnna make the database + 
    String ShipDistrict, InvoiceNumber, Shipname, Companyname, Date, PaymentType, PaidOrNot, oldInvoiceNo = "";
    int InitialDebt, Downpayment, Commission, Tax, Transactions, Resolved, Unresolved, Surplus, Debt;
    String values[] = new String[11];

    public String dateCheck (String d) {
    	int x =0;
    	String s ="Y";
    	int value =0;
    	String[] a = d.split("");
    	for(x=0;x<a.length;x++) {
    		if (a[x].equals("-")){
    			a[x] = "0";
    		}
    	}
    	try {
    	for(x=0;x<a.length;x++) {
    		value = value + Integer.parseInt(a[x]);
    	}
    	}
    	catch(Exception e) {
    		JOptionPane.showMessageDialog(null, "Enter a valid date!");
    		s = "N";
    	}
    	return s;
    }
    public String[] retrieve(String InvoiceNo){
        
        super.cn = null;
        
        String Query = "SELECT ShipDistrict, InvoiceNo, Shipname, CompanyName, InitialDebt, Downpayment, Commission, Tax, Date, "
                + "PaymentType, PaidOrNot FROM "+ tblName +" WHERE InvoiceNo = ?";
        try {   
                openconnection();
                PreparedStatement pS = cn.prepareStatement(Query);
                pS.setString(1,InvoiceNo);
                ResultSet rs = pS.executeQuery();
                while(rs.next()){
                    ShipDistrict = rs.getString("ShipDistrict");
                    values[0] = ShipDistrict;
                    InvoiceNumber = rs.getString("InvoiceNo");
                    values[1] = InvoiceNumber;
                    Shipname = rs.getString("Shipname");
                    values[2] = Shipname;
                    Companyname = rs.getString("Companyname");
                    values[3] = Companyname;
                    InitialDebt = rs.getInt("InitialDebt");
                    values[4] = Integer.toString(InitialDebt);
                    Downpayment = rs.getInt("Downpayment");
                    values[5] = Integer.toString(Downpayment);
                    Commission = rs.getInt("Commission");
                    values[6] = Integer.toString(Commission);
                    Tax = rs.getInt("Tax");
                    values[7] = Integer.toString(Tax);
                    Date = rs.getString("Date");
                    values[8] = Date;
                    PaymentType = rs.getString("PaymentType");
                    values[9] = PaymentType;
                    PaidOrNot = rs.getString("PaidOrNot");
                    values[10] = PaidOrNot;
                
                }
              
	}
        catch(SQLException sqle) {
		JOptionPane.showMessageDialog(null, sqle.getMessage(), "Table not found", JOptionPane.ERROR_MESSAGE);
	}
        
        closeconnection();
        return values;
    }

    public void insert(String ShipDistrict, String InvoiceNo, String ShipName, String Companyname, int InitialDebt, 
            int Downpayment, int Commission, int Tax, String Date, String PaymentType, String PaidOrNot, int RemainingDebt){
        String SQLStatement = "INSERT INTO "+ tblName +" (ShipDistrict, InvoiceNo, Shipname, CompanyName, InitialDebt, Downpayment, "
                + "Commission, Tax, Date, PaymentType, PaidOrNot, RemainingDebt) VALUES('"+ ShipDistrict +"','"+ InvoiceNo +"','"+ ShipName +"','"+ 
                Companyname +"','"+ InitialDebt +"','"+ Downpayment +"','"+ Commission+"','"+ Tax +"','"+ Date +"','"+ PaymentType +"','"+ PaidOrNot +"','"+ 
                RemainingDebt +"');";
        System.out.println("InvoiceNo" + InvoiceNo);
        if (dateCheck(Date).equals("Y")) {
        	if (InvoiceNo.equals("")) {
    		JOptionPane.showMessageDialog(null, "InvoiceNo field cannot be empty!");
        	}
        else {
        	openconnection();
        	establishconnection(SQLStatement);
        	closeconnection();
        	}
        }
       }
    
    public void delete(String InvoiceNo){
        super.cn=null;
        String SQLStatement = "DELETE FROM "+ tblName +" WHERE InvoiceNo = '" + InvoiceNo + "'";
        openconnection();
        establishconnection(SQLStatement);
        closeconnection();
    }
   
    public void update(String ShipDistrict, String InvoiceNo, String ShipName, String Companyname, int InitialDebt, 
            int Downpayment, int Commission, int Tax, String Date, String PaymentType, String PaidOrNot, int RemainingDebt, String oldInvoiceNo){
        super.cn=null;
        if (dateCheck(Date).equals("Y")) {
        	if (InvoiceNo.equals("")) {
    		JOptionPane.showMessageDialog(null, "InvoiceNo field cannot be empty!");
        	}
        else {
        try {   
                openconnection();
                PreparedStatement pS = cn.prepareStatement("UPDATE "+ tblName +" \n SET ShipDistrict = ?, InvoiceNo = ?, Shipname = ?, "
                        + "Companyname =?, InitialDebt =?, Downpayment= ?, Commission =?, Tax =?, Date =?, PaymentType =?, PaidOrNot =?, "
                        + "RemainingDebt =? \n WHERE InvoiceNo =?");
                
                pS.setString(1, ShipDistrict);
                pS.setString(2, InvoiceNo);
                pS.setString(3, ShipName);
                pS.setString(4, Companyname);
                pS.setInt(5, InitialDebt);
                pS.setInt(6, Downpayment);
                pS.setInt(7, Commission);
                pS.setInt(8, Tax);
                pS.setString(9, Date);
                pS.setString(10, PaymentType);
                pS.setString(11, PaidOrNot);
                pS.setInt(12, RemainingDebt);
                pS.setString(13, oldInvoiceNo);
                
                establishconnection(pS);
        }
	catch(SQLException sqle) {
		JOptionPane.showMessageDialog(null, sqle.getMessage(), "Table not found", JOptionPane.ERROR_MESSAGE);
	}
	
        closeconnection();
        }
       }
                
    }
    
    public void display(JTable table){
        super.cn = null;
        String Query = "SELECT * FROM "+ tblName;
        try {   
                openconnection();
                PreparedStatement pS = cn.prepareStatement(Query);
                ResultSet rs = pS.executeQuery();
                DefaultTableModel tm = (DefaultTableModel)table.getModel();
                tm.setRowCount(0);
                while(rs.next()){
                  
                   Object obj[] = {rs.getString("ShipDistrict"), rs.getString("InvoiceNo"), rs.getString("Shipname"), rs.getString("Companyname"), 
                       Integer.toString(rs.getInt("InitialDebt")), Integer.toString(rs.getInt("Downpayment")),  Integer.toString(rs.getInt("Commission")), 
                       Integer.toString(rs.getInt("Tax")), rs.getString("Date"), rs.getString("PaymentType"), rs.getString("PaidOrNot"), 
                       Integer.toString(rs.getInt("RemainingDebt"))};
                   
                   tm.addRow(obj);
      
                }
                
              
	}
        catch(SQLException sqle) {
		JOptionPane.showMessageDialog(null, sqle.getMessage(), "Table not found", JOptionPane.ERROR_MESSAGE);
	}
        
        closeconnection();
    }
    
    public void sort(String field, String order, JTable table){
        super.cn = null;
        String Query = "SELECT * FROM "+ tblName +" ORDER BY `"+ tblName +"`.`"+field+"`"+order;
        try {    
                openconnection();
                PreparedStatement pS = cn.prepareStatement(Query);
                ResultSet rs = pS.executeQuery();
                DefaultTableModel tm = (DefaultTableModel)table.getModel();
                tm.setRowCount(0);

                while(rs.next()){

                  
                   Object obj[] = {rs.getString("ShipDistrict"), rs.getString("InvoiceNo"), rs.getString("Shipname"), rs.getString("Companyname"), 
                       Integer.toString(rs.getInt("InitialDebt")), Integer.toString(rs.getInt("Downpayment")),  Integer.toString(rs.getInt("Commission")), 
                       Integer.toString(rs.getInt("Tax")), rs.getString("Date"), rs.getString("PaymentType"), rs.getString("PaidOrNot"), 
                       Integer.toString(rs.getInt("RemainingDebt"))};
                   
                   tm.addRow(obj);
                  
                }
              
	}
        catch(SQLException sqle) {
		JOptionPane.showMessageDialog(null, sqle.getMessage(), "Table not found", JOptionPane.ERROR_MESSAGE);
	}
        
        closeconnection();
    }
    public void search(String FilterText, JTable table){
        super.cn = null;

        String Query = "SELECT * FROM "+ tblName +" WHERE CONCAT(ShipDistrict, InvoiceNo, Shipname, Companyname, InitialDebt, Downpayment, "
                + "Commission, Tax, Date, PaymentType, PaidOrNot, RemainingDebt) LIKE '%"+FilterText+"%'";
        
        try {   
                openconnection();
                PreparedStatement pS = cn.prepareStatement(Query);
                ResultSet rs = pS.executeQuery();
                DefaultTableModel tm = (DefaultTableModel)table.getModel();
                tm.setRowCount(0);
    
                while(rs.next()){
                  
                   Object obj[] = {rs.getString("ShipDistrict"), rs.getString("InvoiceNo"), rs.getString("Shipname"), rs.getString("Companyname"), 
                       Integer.toString(rs.getInt("InitialDebt")), Integer.toString(rs.getInt("Downpayment")),  Integer.toString(rs.getInt("Commission")), 
                       Integer.toString(rs.getInt("Tax")), rs.getString("Date"), rs.getString("PaymentType"), rs.getString("PaidOrNot"), 
                       Integer.toString(rs.getInt("RemainingDebt"))};
                   
                   tm.addRow(obj);
                   
                  
                }
                
	}
        catch(SQLException sqle) {
		JOptionPane.showMessageDialog(null, sqle.getMessage(), "Table not found", JOptionPane.ERROR_MESSAGE);
	}
        
        closeconnection();
        
    }
    public String[] retrieve(){
        int counter =0; 
        String shipName[] = new String[calculateNoTransactions()];
        String Query = "SELECT Shipname FROM "+ tblName +"";
        try {   
                openconnection();
                PreparedStatement pS = cn.prepareStatement(Query);
                ResultSet rs = pS.executeQuery(); 
                while(rs.next()){
                   shipName[counter] = rs.getString("Shipname");
                   counter++;
                 
                }  
	}
        catch(SQLException sqle) {
		JOptionPane.showMessageDialog(null, sqle.getMessage(), "Table not found", JOptionPane.ERROR_MESSAGE);
	}
        
        closeconnection();

            return shipName;

    }
    
    public void displayOrderedShips (String[] ships, JTable table) {
        String temp;
        
        DefaultTableModel tm = (DefaultTableModel)table.getModel();
        tm.setRowCount(0);

        for(int a=0;a<ships.length;a++){
            for(int b=a+1;b<ships.length;b++){
                if(ships[a].compareTo(ships[b])>0){
                    temp = ships[a];
                    ships[a] = ships[b];
                    ships[b] = temp;
                }
            }
        }
        
        int position =0;
        int c=1;
        String temporary;
        
        while(position!=ships.length-1){
            temporary = ships[position];
            for(int x=position+1;x<ships.length;x++){
               if (temporary.equals(ships[x])){
                   c++;
                   position=x;
               }
               else {
                   position=x;
                   Object[] obj = {temporary, c};
                   tm.addRow(obj);  
                   c = 1;
                   break;  
               }  
            }
        }
        
        if(ships.length!=1){
             Object[] obj = {ships[ships.length-1], c};
             tm.addRow(obj);
        }
        else{
            Object[] obj = {ships[ships.length-1], 1};
             tm.addRow(obj);
        }
        
        }
        
           
        
    
  
    public int calculateNoTransactions(){
        int counter =0; 
        String Query = "Select * FROM "+ tblName +"";
        try {   
                openconnection();
                PreparedStatement pS = cn.prepareStatement(Query);
                ResultSet rs = pS.executeQuery();
 
                  
                while(rs.next()){
                   counter++;
                }
              
	}
        catch(SQLException sqle) {
		JOptionPane.showMessageDialog(null, sqle.getMessage(), "Table not found", JOptionPane.ERROR_MESSAGE);
	}
        return counter;
    }
    public int calculateRemainingDebt() {
    	return 0;
    }
    public int calculateTotalDebt(){
        String Query = "Select RemainingDebt FROM "+ tblName +" WHERE RemainingDebt >0";
        try {   
                openconnection();
                PreparedStatement pS = cn.prepareStatement(Query);
                ResultSet rs = pS.executeQuery();
 
                  
                while(rs.next()){
                   Debt = Debt + rs.getInt("RemainingDebt");
                }
              
	}
        catch(SQLException sqle) {
		JOptionPane.showMessageDialog(null, sqle.getMessage(), "Table not found", JOptionPane.ERROR_MESSAGE);
	}
        closeconnection();
        return Debt;
    }
    public int calculateSurplus(){

        String Query = "Select RemainingDebt FROM "+ tblName +" WHERE RemainingDebt <0";
        try {   
                openconnection();
                PreparedStatement pS = cn.prepareStatement(Query);
                ResultSet rs = pS.executeQuery();
 
                  
                while(rs.next()){
                   Surplus = Surplus + rs.getInt("RemainingDebt");

                }
              
	}
        catch(SQLException sqle) {
		JOptionPane.showMessageDialog(null, sqle.getMessage(), "Table not found", JOptionPane.ERROR_MESSAGE);
	}
        closeconnection();
        
        return Surplus;
    }
    public int calculateResolved(){
        int counter=0;
        String Query = "Select RemainingDebt FROM "+ tblName +" WHERE RemainingDebt =0";
        try {   
                openconnection();
                PreparedStatement pS = cn.prepareStatement(Query);
                ResultSet rs = pS.executeQuery();
 
                  
                while(rs.next()){
                   counter++;
                }
              
	}
        catch(SQLException sqle) {
		JOptionPane.showMessageDialog(null, sqle.getMessage(), "Table not found", JOptionPane.ERROR_MESSAGE);
	}
        closeconnection();
 
        return counter;
    }
    public int calculateUnresolved(int Total,int Resolved){
        return Total-Resolved;
    }
    public int getDebt(int InitialDebt, int Downpayment, int Commission, int Tax){

        int Debt = Tax + InitialDebt + Commission - Downpayment;
        return Debt;
    }

    public String getPaidStatus(int currentDebt){
        if(currentDebt==0){
            return "True";
        }
        else{
            return "False";
        }
    }
 }
