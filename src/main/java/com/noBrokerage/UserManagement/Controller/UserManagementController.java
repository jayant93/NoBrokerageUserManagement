package com.noBrokerage.UserManagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.noBrokerage.UserManagement.Service.UserManagementService;

@RestController
@RequestMapping("/UserManagement")
public class UserManagementController {
	
	
	@Autowired
	UserManagementService service;
	
	
	//Code for testing the save feature
	@GetMapping("/save")
	public UserDetails saveUser(/*@RequestBody UserDetails user*/) {
			
		
		
		
		return service.saveUser(null);
	}
	

}
