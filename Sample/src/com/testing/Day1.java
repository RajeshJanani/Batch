package com.testing;

public class Day1 {
	
	//public static int addnumber(int a,int b)
	public int addnumber(int a,int b)
	{
	int sum=a+b;
	return sum;
		//return a+b;
	}

	public static void main(String[] args) {
		
		Day1 obj=new Day1();
		int num1=10;
		int num2=20;
		int result = obj.addnumber(num1,num2);
		//int result=addnumber(10, 20);
		System.out.println(result);
	}

}
