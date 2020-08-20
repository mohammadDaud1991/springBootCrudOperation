package com.daud.crd.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daud.crd.entity.Users;
import com.daud.crd.service.UserServices;

@RestController
@RequestMapping("/uc")
public class UserController {

	@Autowired
	private UserServices userServices;

	
	@PostMapping("/saveAll")
	public void saveUsers(@RequestBody Users users) {
		userServices.SaveUsers(users);
	}
	
	@GetMapping("/getAll")
	public List<Users> getAllUsers()
	{
		return userServices.getAllUsers();
	}
	
	@GetMapping("/getUserById")
	public Optional<Users> getUserById(@RequestBody Integer id)
	{
		return userServices.getUsersById(id);
	}
	
	@PostMapping("/delete")
	public void deleteUsers(@RequestBody Integer id) {
		userServices.deleteUsersById(id);
	}
	
}
