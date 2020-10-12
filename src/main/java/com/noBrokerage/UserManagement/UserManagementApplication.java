package com.noBrokerage.UserManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.noBrokerage.UserManagement.Service.UserManagementService;

@SpringBootApplication
@EnableJpaRepositories
public class UserManagementApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(UserManagementApplication.class, args);
		
	}

}
