package com.testing;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int sum = 0;
		    int number = 0;

		    Scanner input = new Scanner(System.in);
			   
		     do {
		     
		      sum =sum+ number;
		      System.out.println("Enter a number");
		     number = input.nextInt();
		    } while(number >= 0); 
			   
		    System.out.println("Sum = " + sum);
		    input.close();
	}

}