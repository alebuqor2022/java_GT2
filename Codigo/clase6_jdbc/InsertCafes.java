package clase6_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertCafes {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/indragt2";
		Connection con=null;
		Statement stmt;
		
		try {
			con=DriverManager.getConnection(url, "root", "1234");
			stmt=con.createStatement();
			stmt.executeUpdate("insert into cafes (cof_name, sup_id, price) values ('Colombiano',101,9.99)");
			stmt.executeUpdate("insert into cafes (cof_name, sup_id, price) values ('Frances Tostado',150,19.99)");
			stmt.executeUpdate("insert into cafes (cof_name, sup_id, price) values ('Espresso',101,12)");
			stmt.executeUpdate("insert into cafes (cof_name, sup_id, price) values ('Colombiano Decaf',150,5.99)");
			stmt.executeUpdate("insert into cafes (cof_name, sup_id, price) values ('CafeLatte',101,7.50)");
			
			
			stmt.close();
			con.close();
			
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}


	}

}
