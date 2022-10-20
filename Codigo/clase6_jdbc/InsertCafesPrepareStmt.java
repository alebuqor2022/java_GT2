package clase6_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertCafesPrepareStmt {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/indragt2";
		Connection con=null;
		PreparedStatement stmt;
		String misql="insert into cafes (cof_name, sup_id, price) values (?,?,?)";
		
		try {
			con=DriverManager.getConnection(url, "root", "1234");
			stmt=con.prepareStatement(misql);
			
			stmt.setString(1, "Caramel");
			stmt.setInt(2, 190);
			stmt.setFloat(3, 20.50f);
			int a= stmt.executeUpdate();
			if(a>0) {
				System.out.println("alta exitosa");
			} else {
				System.out.println("fallo en el alta");
			}
			
			stmt.close();
			con.close();
			
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
