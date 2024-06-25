package com.testing;

import java.util.Scanner;

public class Switchexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String c;
		do
		{
		System.out.println("Enter the Number 10,20,30:");
		int number = sc.nextInt();
		switch(number)
		{
		case 10:System.out.println("User Pressed 10");
		break;
		case 20:System.out.println("User Pressed 20");
		break;
		case 30:System.out.println("User Pressed 30");
		break;
		default: System.out.println("Not in 10,20,30");
		}
		System.out.println("Do u Want to Continue Y orN :");
		c=sc.next();
		}while (c.equalsIgnoreCase("Y"));
		
		sc.close();
	}

}
