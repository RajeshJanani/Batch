package com.testing;

import java.util.Scanner;

public class Arms {

	public static void main(String[] args) {
		
		Scanner arm=new Scanner(System.in);
		
		System.out.println("Enter the Number");
		
		int number=arm.nextInt();
		
		
		 int  input, remainder, result = 0;

	        input = number;

	        while (input != 0)
	        {
	            remainder = input % 10;
	            result =(int) (result + Math.pow(remainder, 3));
	            input /= 10;   // input = input/10;
	        }

	        if(result == number)
	            System.out.println(number + " is an Armstrong number.");
	        else
	
	        System.out.println(number + " is not an Armstrong number.");
	        
	        arm.close();
	}
	

}
