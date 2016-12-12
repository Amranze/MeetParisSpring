package com.example;

import java.util.Date;

import org.joda.time.LocalDate;
import org.joda.time.Years;

public class testClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date user = new Date();
		user.setYear(1993);
		user.setMonth(3);
		user.setDate(30);
		int age1 = user.getDate() - new Date().getDate();
		long age2 = user.getTime() - new Date().getTime();
		
		System.out.println("date "+ user.getYear() +" "+ user.getMonth() + " " +user.getDate());

		
		LocalDate birthdate = new LocalDate (user.getYear(), user.getMonth(), user.getDate());
		LocalDate now = new LocalDate();
		Years age = Years.yearsBetween(birthdate, now);
		
		System.out.println("The age is "+ age1);
		System.out.println("The age 2 is "+ age.getYears());
	}

}
