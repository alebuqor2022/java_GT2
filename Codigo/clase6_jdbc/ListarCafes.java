package clase6_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ListarCafes {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/indragt2";
		Connection con=null;
		Statement stmt;
		String misql="SELECT * FROM cafes";
		
		try {
			con=DriverManager.getConnection(url, "root", "1234");
			stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(misql);
			
			while(rs.next()) {				
				String nombre=rs.getString("cof_name");
				float precio=rs.getFloat(4); // arranca con 1 para la 1era columna
				System.out.println(nombre + " cuesta $ " + precio);				
			}
			
			stmt.close();
			con.close();
			
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}


	}

}
