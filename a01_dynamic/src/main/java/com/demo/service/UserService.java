package com.demo.service;

import java.sql.SQLException;

import com.demo.beans.User;

public interface UserService {
	User getUserByUserName(String name) throws SQLException;
}
