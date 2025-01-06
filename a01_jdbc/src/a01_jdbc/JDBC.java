package a01_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {
	public static void main(String[] args) {
		try {
			String url = "jdbc:mysql//localhost:3306/jdbc";
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection connection = DriverManager.getConnection(url,"root","asta@4527");
			
			Statement st = connection.createStatement();
			String query = "Select * from  spring_rest_user";
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getInt(1) + "," + rs.getString(2));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
