package com.demo.SpringMVCSecond.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.SpringMVCSecond.beans.User;
import com.demo.SpringMVCSecond.service.UserService;

@Controller
@RequestMapping("/")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/users")
	public ModelAndView getAllUsers() {
		List<User> list = userService.getAllUsers();
		if(list.isEmpty()) {
			return new ModelAndView("NoUser");
		}
		
		return new ModelAndView("one","list",list);
	}
	
}
