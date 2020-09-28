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
		String patternString = "^(abc)(.[a-zA-Z0-9+_-]{1})[a-zA-Z0-9+_-]*([@][a-zA-Z0-9]{1,})*([.][a-zA-Z]{2,4}([.][a-zA-Z]{2}){0,1})$";
		regexMatch(email, patternString);
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
		System.out.println("Enter the first name");
		String fName = sc.nextLine();
		userReg.validateName(fName);
		
		System.out.println("Enter the last name");
		String lName = sc.nextLine();
		userReg.validateName(lName);
		
		System.out.println("Enter the email");
		String email = sc.nextLine();
		userReg.validateEmail(email);
	}
}
