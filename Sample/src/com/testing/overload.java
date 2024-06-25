package com.testing;

public class overload {

	public void multiply()
	{
		System.out.println("This is Method Overloading");
	}
	
	public int multiply(int x)
	
	{
		int b=5;
		int c=x*b;
		System.out.println(c);
		return c;
	}
	
	public int multiply(int a,int b)
	{
		int m =a*b;
		System.out.println(m);
		return m;
	} 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
overload o=new overload();
o.multiply();
o.multiply(10);
o.multiply(10, 9);


	}

}
