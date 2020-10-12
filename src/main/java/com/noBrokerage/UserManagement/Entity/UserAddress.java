package com.noBrokerage.UserManagement.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "user_address")
public class UserAddress {

	public UserAddress() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int addressId;

	
	@Override
	public String toString() {
		return "UserAddress [addressId=" + addressId + ", userdetails=" + userdetails + ", address1=" + address1
				+ ", address2=" + address2 + ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}

	private UserDetails userdetails;

	public UserDetails getUserdetails() {
		return userdetails;
	}

	public void setUserdetails(UserDetails userdetails) {
		this.userdetails = userdetails;
	}

	String address1;

	String address2;

	String city;

	String state;

	String pincode;

	public int getId() {
		return addressId;
	}

	public void setId(int id) {
		this.addressId = id;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

}
