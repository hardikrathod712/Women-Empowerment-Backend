package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.model.User;
import com.lti.service.UserService;

@RestController
@RequestMapping("/step")
@CrossOrigin("http://localhost:4200")
public class STEPController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/userRegister")
	public User registerUser(@RequestBody User user) throws Exception {
		String tempEmail = user.getUserEmailId();
		if(tempEmail != null && !"".equals(tempEmail)) {
			User tempUser = userService.getUserByEmail(tempEmail);
			if(tempUser != null)
				throw new Exception("User with "+tempEmail+" Already Exist!!");
		}
		return userService.saveUser(user);
	}
	
	@GetMapping("/userLogin")
	public User loginUser(@RequestBody User user) throws Exception {
		String emailId = user.getUserEmailId();
		String password = user.getUserPassword();
		User tempUser = null;
		if(emailId != null && password != null) {
			tempUser = userService.getUserByEmailAndPassword(emailId, password);
		}
		if(tempUser==null)
			throw new Exception("Bad Credentials");
		return tempUser;
	}

}
