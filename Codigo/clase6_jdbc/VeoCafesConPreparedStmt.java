package clase6_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VeoCafesConPreparedStmt {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/indragt2";
		Connection con=null;
		PreparedStatement stmt;
		String misql="Select * from cafes where price > ?";
		
		try {
			con=DriverManager.getConnection(url, "root", "1234");
			stmt=con.prepareStatement(misql);
			
			stmt.setFloat(1, 10f);
			
			ResultSet rs= stmt.executeQuery();
	

			while(rs.next()) {				
				String nombre=rs.getString("cof_name");
				float precio=rs.getFloat(4); // arranca con 1 para la 1era columna
				System.out.println(nombre + " $ " + precio);				
			}
			
			stmt.close();
			con.close();
			
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

	}
}
