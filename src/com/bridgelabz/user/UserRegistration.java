package com.bridgelabz.user;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	public void validateFirstName(String fName) {
		
		String patternString = "(^[A-Z])[A-Za-z]{3,}$";
		Pattern pattern = Pattern.compile(patternString);
	    Matcher matcher = pattern.matcher(fName);
	    boolean isMatch = matcher.find();
	    
		System.out.println(isMatch);
		if (isMatch) {
			System.out.println("first name is valid");
		} else {
			System.out.println("first name is not valid");
		}			
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the user registration system");
		
		UserRegistration userReg = new UserRegistration();
		System.out.println("Enter the first name");
		String fName = sc.nextLine();
		userReg.validateFirstName(fName);
		
		
	}
}
