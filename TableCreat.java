import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TableCreat {

	public static void main(String[] args) throws Exception {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
Connection c =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "java");
        Statement st = c.createStatement();
        
  int x = st.executeUpdate("create table Atul2025(id number (10), name varchar(20))");
  System.out.println(x);
  System.out.println("Table Created Succesfully");
  st.close();
  c.close();
   		
	}
	
}