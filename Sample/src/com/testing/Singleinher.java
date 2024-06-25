package com.testing;

class one  //parent class
{
	void display1()
	{
		System.out.println("Parent Class");

	}
	
	void display()
	{
		System.out.println("Parent Class1");
	}
}

class two extends one  //child class
{
	void display1()
	{ 
		super.display1();
		super.display();
		System.out.println("child Class");
		
			}
}
public class Singleinher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
two t=new two();
t.display1();
t.display();
	}

}
