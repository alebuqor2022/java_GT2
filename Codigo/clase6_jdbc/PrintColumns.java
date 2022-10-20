package clase6_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class PrintColumns {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/indragt2";
		Connection con=null;
		Statement stmt;
		String misql="SELECT * FROM cafes";
		
		try {
			con=DriverManager.getConnection(url, "root", "1234");
			stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(misql);
			ResultSetMetaData rsmd=rs.getMetaData();
			PrintColumnTypes.printColTypes(rsmd);
			
			int nroCols=rsmd.getColumnCount();
			
			// imprimir el nombre de los campos y sus tipos de formato en java
			for(int i=1; i<= nroCols; i++) {
				System.out.print(rsmd.getColumnClassName(i) + ", ");
				System.out.println(rsmd.getColumnName(i));
			}
			
			while(rs.next()) {				
				for(int i=1; i<= nroCols; i++) {
					System.out.println(rs.getString(i));
				}
				System.out.println();
			}
			
			stmt.close();
			con.close();
			
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}


	}

}
