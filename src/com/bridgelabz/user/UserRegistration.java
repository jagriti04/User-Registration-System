package com.bridgelabz.user;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	public void validateName(String name) {
		String patternString = "(^[A-Z])[A-Za-z]{2,}$";
		regexMatch(name, patternString);
	}
	
	public void validateEmail(String email) {
		String patternString = "^[a-zA-z]{1}([.]{0,1}[a-zA-z0-9+-]{1,}){0,}[@]{1}[a-zA-Z0-9]{1,}[.]{1}[a-z]{2,3}([.]{1}[a-z]{2}){0,1}$";
		regexMatch(email, patternString);
	}
	
	public void validateMobile(String mobileNum) {
		String patternString = "^([0-9]{2})[\\s]([0-9]{10})";
		regexMatch(mobileNum, patternString);
	}
	public void validatePassword(String password) {
		String patternString = "^(?=.*\\d)(?=[^!@#$%^&*()_+=]*[!@#$%^&*()_+=][^!@#$%^&*()_+=]*$)(?=.*[A-Z]).{8,}$";
		regexMatch(password, patternString);
	}
	
	public static void regexMatch(String matchContent, String patternString) {  	
		Pattern pattern = Pattern.compile(patternString);
	    Matcher matcher = pattern.matcher(matchContent);
	    boolean isMatch = matcher.find();
	    
		System.out.println(isMatch);
		if (isMatch) {
			System.out.println(matchContent+ " is valid");
		} else {
			System.out.println(matchContent + " is not valid");
		}			
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the user registration system");
		
		UserRegistration userReg = new UserRegistration();
//		System.out.println("Enter the first name");
//		String fName = sc.nextLine();
//		userReg.validateName(fName);
//		
//		System.out.println("Enter the last name");
//		String lName = sc.nextLine();
//		userReg.validateName(lName);
//		
//		System.out.println("Enter the email");
//		String email = sc.nextLine();
//		userReg.validateEmail(email);
//		
//		System.out.println("Enter the mobile num.");
//		String mobileNum = sc.nextLine();
//		userReg.validateMobile(mobileNum);
		
		System.out.println("Enter the password");
		String password = sc.nextLine();
		userReg.validatePassword(password);
	}
}
