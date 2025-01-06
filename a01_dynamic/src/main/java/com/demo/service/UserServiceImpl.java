package com.demo.service;

import java.sql.SQLException;

import com.demo.beans.User;
import com.demo.dao.LoginDao;
import com.demo.dao.LoginDaoImpl;

public class UserServiceImpl implements UserService{

	private LoginDao loginDao;
	
	public UserServiceImpl() {
		loginDao = new LoginDaoImpl();
	}
	
	public User getUserByUserName(String name) throws SQLException {
		User user = loginDao.getUserByUsername(name);
		return user;
	}

}
