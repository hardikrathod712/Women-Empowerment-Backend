package com.lti.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.UserNGO;
import com.lti.repository.UserNGORepository;

@Service
@Transactional
public class UserNGOService {

	@Autowired
	private UserNGORepository userNgoRepository;

	// retrieve all records
	public List<UserNGO> getAllAppliedUser() {
		List<UserNGO> users = userNgoRepository.findAll();
		return users;
	}

	// insert a record
	public UserNGO registerUser(UserNGO user) {
		return userNgoRepository.save(user);
	}

	// delete a record
	public void deleteByUserId(int userId) {
		userNgoRepository.deleteById(userId);
	}

	// update record
	public UserNGO updateUserNgo(UserNGO newuser) {
		return userNgoRepository.save(newuser);
	}

}
