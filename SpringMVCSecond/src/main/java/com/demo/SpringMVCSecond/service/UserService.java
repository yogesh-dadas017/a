package com.demo.SpringMVCSecond.service;

import java.util.List;

import com.demo.SpringMVCSecond.beans.User;

public interface UserService {
	List<User> getAllUsers();
	User findById(int id);
	void addUser(User u);
	void update(User u);
	void del(int id);
}
