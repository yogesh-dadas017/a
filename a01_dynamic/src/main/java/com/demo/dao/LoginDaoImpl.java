package com.demo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.demo.beans.User;

public class LoginDaoImpl implements LoginDao{

	private Connection connection;
	
	public LoginDaoImpl() {
		connection = DbUtils.getConnection();
	}
	
	public User getUserByUsername(String s) throws SQLException {
		Statement statement = connection.createStatement();
		
		String query = "Select * from  spring_rest_user where username = '" + s + "'";
		ResultSet rs = statement.executeQuery(query);
		
		User user = new User();
		while(rs.next()) {
			
			user.setId(rs.getInt(1));
			user.setUsername(rs.getString(4));
			user.setPassword(rs.getString(2));
			user.setRole(rs.getString(3));
			return user;
		}		
		
		return null;
	}

}
