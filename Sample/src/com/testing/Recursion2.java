package com.testing;

public class Recursion2 {

	static int fact(int n)
	{
		if (n==1)
			return 1;
		else
			return (n* fact(n-1));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Factorial is : " + fact (5));
		
	}

}
