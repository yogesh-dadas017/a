package com.demo.SpringReact.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.SpringReact.beans.User;
import com.demo.SpringReact.dao.Dao;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	Dao dao;
	
	public List<User> getAllUsers(){
		List<User> ans = dao.findAll();
		return ans;
	}
	
	public User findById(int id) {
		Optional<User> option = dao.findById(id);
		if(option.isPresent()) {
			User user = option.get();
			return user;
		}
		return null;
	}
	
	public void addUser(User u) {
		dao.save(u);
	}
	
	
	public void update(User u) {
		User oldUser = findById(u.getId());
		int newAge = u.getAge();
		oldUser.setAge(newAge);
		dao.save(oldUser);
	}
	
	public void del(int id) {
		dao.deleteById(id);
	}
	
}
