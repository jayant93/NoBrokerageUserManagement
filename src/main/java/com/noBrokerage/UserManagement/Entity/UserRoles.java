package com.noBrokerage.UserManagement.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "user_roles")
public class UserRoles {
	
	public UserRoles() {
		
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int roleId;

	@Column(name = "role_type")
	private String roleType;

	
	@Override
	public String toString() {
		return "UserRoles [roleId=" + roleId + ", roleType=" + roleType + ", userdetails=" + userdetails + "]";
	}

	private UserDetails userdetails;

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public UserDetails getUserdetails() {
		return userdetails;
	}

	public void setUserdetails(UserDetails userdetails) {
		this.userdetails = userdetails;
	}

	public String getRoleType() {
		return roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

}
