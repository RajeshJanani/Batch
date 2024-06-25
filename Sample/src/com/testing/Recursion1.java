package com.testing;

public class Recursion1 {

	static int count=0;
	
	static void fun()
	{
		count++;
		if(count <=5)
		{
			System.out.println("Hello :" + count);
			fun();
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
fun();
	}

}
