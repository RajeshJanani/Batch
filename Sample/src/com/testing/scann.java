package com.testing;

import java.util.Scanner;

public class scann {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj=new Scanner(System.in); // Scanner object name = new Scanner(System.in)
		System.out.println("Enter UserName");
		
		String txt=obj.nextLine();
			
		System.out.println("Enter Age");
		
		int age=obj.nextInt();
		
		System.out.println("Enter Salary");

		double sal=obj.nextDouble();
		
		if (txt.equals("hari"))
		{
	System.out.println("Valid user");
	}
	else
		{
		System.out.println("Invalid user");
		}
		System.out.println("The User Name is : "+ txt);
		
		System.out.println("Age is: "+  age) ;
		
		System.out.println("Salary : " + sal);
		
		obj.close();
		
	}

}
