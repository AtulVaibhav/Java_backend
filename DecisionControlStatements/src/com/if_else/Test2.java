package com.if_else;

import java.util.Scanner;

class DB{
	private static final String username="admin";
	private static final String password="admin";
	public static String getUsername(){
		return DB.username;
	}
	public static String getPassword(){
		return DB.password;
	}
}

class UserAuthentication{
	public boolean VerifyUser(){
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the username");
		String username = sc.next();
		System.out.println("Enter the password");
		String password = sc.next();
		
		if(username.equals(DB.getUsername()) && password.equals(DB.getPassword())){
			//flag = true;
			return true;
		}
		//return flag;
		return false;
		
		
	}
	
	public boolean authenticateUser(){
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the username");
		String username = sc.next();
		
		if(username.equals(DB.getUsername())){
			System.out.println("Enter the password");
			String password = sc.next();
			if(password.equals(DB.getPassword())){
				flag = true;
			}
		}
		return flag;
	}
}
public class Test2 {

	public static void main(String[] args) {
		UserAuthentication user = new UserAuthentication();
		//boolean result =  user.VerifyUser();
		boolean result =  user.authenticateUser();
		if(result){
			System.out.println("Verified User");
		}else{
			System.out.println("Invalid Username or Password");
		}

	}

}
