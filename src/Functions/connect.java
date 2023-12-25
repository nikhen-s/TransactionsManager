
package Functions;
import javax.swing.*;
import java.sql.*;

public class connect {
       static String driver = "com.mysql.cj.jdbc.Driver";
       static String database = "jdbc:mysql://localhost:3308/Transactions?useUnicode=true&useJDBCCompliantTimezoneShift="
               + "true&useLegacyDatetimeCode=false&serverTimezone=UTC"; 
       static String user = "root";
       static String pass =  "";
       String tblName = "transactionsTB";
       Connection cn = null;
       public void openconnection() {
        
	if (cn==null) {
		try {
			Class.forName(driver);
			cn = DriverManager.getConnection(database, user , pass);
		} catch(ClassNotFoundException ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage(),"Driver not found", JOptionPane.ERROR_MESSAGE);
			
		} catch(SQLException sqle) {
			JOptionPane.showMessageDialog(null, sqle.getMessage(), "Database not found", JOptionPane.ERROR_MESSAGE);;
			
		}
            }
	}
        public void closeconnection(){
           if(cn !=null) {
		try {
			cn.close();
			cn = null;
		} catch (SQLException sqle) {
			JOptionPane.showMessageDialog(null, sqle.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
       }
       
       public void establishconnection(String SQLStatement) {

        try {
                Statement sta = cn.createStatement();
		int saveCounter = sta.executeUpdate(SQLStatement);
		if (saveCounter >0) {
			JOptionPane.showMessageDialog(null, "Successful Execution!","Success",JOptionPane.PLAIN_MESSAGE);
			
		} else {
			JOptionPane.showMessageDialog(null, "Failed Execution, Check Input","Failed",JOptionPane.PLAIN_MESSAGE);
		}
		sta.close();
        }
        catch(SQLException sqle) {
		JOptionPane.showMessageDialog(null, sqle.getMessage(), "Table not found", JOptionPane.ERROR_MESSAGE);
        }
       }
       
        public void establishconnection(PreparedStatement preparedStatement) {
	
	
	try {
                
                String statementText = preparedStatement.toString();
		int saveCounter = preparedStatement.executeUpdate();
		if (saveCounter >0) {
			JOptionPane.showMessageDialog(null, "Successful Execution","Success",JOptionPane.PLAIN_MESSAGE);
			
		} else {
			JOptionPane.showMessageDialog(null, "Failed Execution, Check Input","Failed",JOptionPane.PLAIN_MESSAGE);
		}
		preparedStatement.close();
	}
	catch(SQLException sqle) {
		JOptionPane.showMessageDialog(null, sqle.getMessage(), "Table not found", JOptionPane.ERROR_MESSAGE);
	}
	}
}


