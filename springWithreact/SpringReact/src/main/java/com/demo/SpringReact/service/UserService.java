package com.demo.SpringReact.service;

import java.util.List;

import com.demo.SpringReact.beans.User;

public interface UserService {
	List<User> getAllUsers();
	User findById(int id);
	void addUser(User u);
	void update(User u);
	void del(int id);
}
