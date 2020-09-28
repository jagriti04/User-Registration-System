package com.bridgelabz.user;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	public void validateName(String fName, String type) {  		// same for first and last name
		
		String patternString = "(^[A-Z])[A-Za-z]{2,}$";
		Pattern pattern = Pattern.compile(patternString);
	    Matcher matcher = pattern.matcher(fName);
	    boolean isMatch = matcher.find();
	    
		System.out.println(isMatch);
		if (isMatch) {
			System.out.println(type+ " name is valid");
		} else {
			System.out.println(type + " name is not valid");
		}			
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the user registration system");
		
		UserRegistration userReg = new UserRegistration();
		System.out.println("Enter the first name");
		String fName = sc.nextLine();
		userReg.validateName(fName, "First");
		
		System.out.println("Enter the last name");
		String lName = sc.nextLine();
		userReg.validateName(lName, "Last");
		
	}
}
