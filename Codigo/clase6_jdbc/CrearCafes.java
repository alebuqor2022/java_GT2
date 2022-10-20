package clase6_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CrearCafes {

	public static void main(String[] args) {
		boolean check=chequearDriver();
		if (check) {
			System.out.println("ok");
			conectar();			
		}else {
			System.out.println("not ok");
		}		
	}

	public static boolean chequearDriver() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return true;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return false;
		}
	}

	public static void conectar() {
		String url="jdbc:mysql://localhost:3306/indragt2";
		Connection con=null;
		String query="create table cafes("
				+ "idcafe int primary key not null auto_increment, "
				+ "cof_name varchar(32), "
				+ "sup_id int(5), "
				+ "price float "
				+ ");";
		Statement stmt=null;
		
		try {
			con=DriverManager.getConnection(url, "root", "1234");
			stmt=con.createStatement();
			stmt.executeUpdate(query);
			
			stmt.close();
			con.close();
			
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
