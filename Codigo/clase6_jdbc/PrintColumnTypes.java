package clase6_jdbc;

import java.sql.SQLException;
import java.sql.ResultSetMetaData;


public class PrintColumnTypes {

	public static void printColTypes(ResultSetMetaData rsmd) throws SQLException{
		int columns=rsmd.getColumnCount();
		for(int i=1; i<=columns;i++) {
			int jdbcType=rsmd.getColumnType(i);
			String nombre= rsmd.getColumnTypeName(i);
			System.out.println("La columna " + i + " es de tipo "+ 
			jdbcType + " la cual es " + nombre);
		}
		
	}
	
	/*
	La columna 1 es jdbcType 12, la cual es VARCHAR
	La columna 2 es jdbcType 4, la cual es INT
	La columna 3 es jdbcType 7, la cual es FLOAT
	La columna 4 es jdbcType 4, la cual es INT
	La columna 5 es jdbcType 4, la cual es INT
	*/
}
