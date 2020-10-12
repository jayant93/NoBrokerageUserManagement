package com.noBrokerage.UserManagement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.noBrokerage.UserManagement.Entity.UserDetails;
import com.noBrokerage.UserManagement.Repository.UserDetailsRepository;

@Service
public class UserManagementService implements UserManagement{
	
	@Autowired
	UserDetailsRepository userRepo;

	@Override
	public UserDetails saveUser(UserDetails user) {

		UserDetails userDetails = userRepo.save(user);
		
		return userDetails;
	}

}
