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
	public UserDetails saveUser(UserDetails userDetails) {

		UserDetails user = new UserDetails();
		user.setAge("26");
		user.setName("Jayant Kumar");
		user.setUsername("jayant@123");
		user.setPasword("jackson@123");
		
		UserAddress address1 = new UserAddress();
		address1.setAddress1("address1");
		address1.setAddress2("address2");
		address1.setCity("Meerut");
		address1.setState("UttarPradesh");
		address1.setPincode("250001");
		
		UserAddress address2 = new UserAddress();
		address2.setAddress1("address2-1");
		address2.setAddress2("address2-2");
		address2.setCity("Meerut-2");
		address2.setState("UttarPradesh-2");
		address2.setPincode("250001-2");
		
		
		UserRoles role1 =new UserRoles();
		
		role1.setRoleType("Admin");
		
	    UserRoles role2 =new UserRoles();
		
		role2.setRoleType("User");
		
		List<UserAddress> addresses = new ArrayList<UserAddress>();
		addresses.add(address1);
		addresses.add(address2);
		
		List<UserRoles> roles = new ArrayList<UserRoles>();
		
		user.setUserRoles(roles);
		
		user.setAddresses(addresses);
		UserDetails userDetails = userRepo.save(user);
		
		return userDetails;
	}

}
