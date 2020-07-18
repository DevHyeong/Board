package com.myapp.login.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User implements Serializable{
	
	private String userId;
	private String userPassword;
	private String userName;
	private String userEmail;
	private String userPhoneNumber;
	
}
