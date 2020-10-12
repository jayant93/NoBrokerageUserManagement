package com.noBrokerage.UserManagement.Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "userdetails")
public class UserDetails implements Serializable{
	
	public UserDetails() {
		
	}

	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", name=" + name + ", age=" + age + ", username=" + username
				+ ", pasword=" + pasword + ", userRoles=" + userRoles + ", addresses=" + addresses + "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "userId")
	int userId;

	String name;

	String age;

	String username;

	String pasword;

	@OneToMany(cascade=CascadeType.ALL)
	private List<UserRoles> userRoles;

	@OneToMany(cascade=CascadeType.ALL)
	private List<UserAddress> addresses;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public List<UserAddress> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<UserAddress> addresses2) {
		this.addresses = addresses2;
	}

	public List<UserRoles> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(List<UserRoles> roles) {
		this.userRoles = roles;
	}

	public int getId() {
		return userId;
	}

	public void setId(int id) {
		this.userId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasword() {
		return pasword;
	}

	public void setPasword(String pasword) {
		this.pasword = pasword;
	}

}
