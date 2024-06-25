package com.testing;

import java.util.Scanner;

public class Whileexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj =new Scanner(System.in);
		
		System.out.println("Enter the Number for Summation");
		
		int n=obj.nextInt();
		int x = 1, sum = 0;
		 
	        while (x <= n) {
	            sum = sum + x;
	         
	            x++;
	            System.out.println("Summation: " + sum);

	        }
	        	        obj.close();
	}

}
