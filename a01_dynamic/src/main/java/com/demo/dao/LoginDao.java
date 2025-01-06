package com.demo.dao;

import java.sql.SQLException;

import com.demo.beans.User;

public interface LoginDao {
	User getUserByUsername(String s) throws SQLException;
	
	
}
