package com.daud.crd.serviceImpl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daud.crd.entity.Users;
import com.daud.crd.repositroy.UserRepositroy;
import com.daud.crd.service.UserServices;

@Service
@Transactional
public class UserServicesImpl implements UserServices
{

	@Autowired
	private UserRepositroy repositroy;

	@Override
	public void SaveUsers(Users users) {
		repositroy.save(users);
	}

	@Override
	public List<Users> getAllUsers() {
		return (List<Users>) repositroy.findAll();
	}

	@Override
	public Optional<Users> getUsersById(Integer id) {
		return repositroy.findById(id);
	}

	@Override
	public void deleteUsersById(Integer id) {
		repositroy.deleteById(id);
		
	}
}
