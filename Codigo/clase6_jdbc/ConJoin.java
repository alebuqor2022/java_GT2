package clase6_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConJoin {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/indragt2";
		Connection con=null;
		Statement stmt;
		String misql="SELECT sup_name, cof_name, price FROM cafes inner join proveedores on cafes.sup_id=proveedores.sup_id";
		
		try {
			con=DriverManager.getConnection(url, "root", "1234");
			stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(misql);
			
			while(rs.next()) {	
				String proveedor=rs.getString("sup_name");
				String nombre=rs.getString("cof_name");
				float precio=rs.getFloat(3); 
				System.out.println(proveedor + " tiene " + nombre + " cuesta $ " + precio);				
			}
			
			stmt.close();
			con.close();
			
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}
