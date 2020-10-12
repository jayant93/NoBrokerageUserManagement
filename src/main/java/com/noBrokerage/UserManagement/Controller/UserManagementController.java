package com.noBrokerage.UserManagement.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.noBrokerage.UserManagement.Entity.UserAddress;
import com.noBrokerage.UserManagement.Entity.UserDetails;
import com.noBrokerage.UserManagement.Entity.UserRoles;
import com.noBrokerage.UserManagement.Service.UserManagementService;

@RestController
@RequestMapping("/UserManagement")
public class UserManagementController {
	
	
	@Autowired
	UserManagementService service;
	
	@GetMapping("/save")
	public UserDetails saveUser(/*@RequestBody UserDetails user*/) {
			//Code for testing the save feature
		
		
		
		return service.saveUser(null);
	}
	

}
