package com.daud.crd.service;

import java.util.List;
import java.util.Optional;

import com.daud.crd.entity.Users;

public interface UserServices {

	public void SaveUsers(Users users);
	public List<Users> getAllUsers();
	public Optional<Users> getUsersById(Integer id);
	public void deleteUsersById(Integer id);
}
