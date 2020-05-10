package com.cg.realestate.model;
/*
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
*/
//@Entity
public class Seller {

	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	//@Column
	private String userName;
    //@Column
	private String emailId;
		
	
	public Seller() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Seller(String userName, String emailId, String password, String phoneNo) {
		super();
		this.userName = userName;
		this.emailId = emailId;
		
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", EmailId=" + emailId + "]";
	}
	
	
	
}
