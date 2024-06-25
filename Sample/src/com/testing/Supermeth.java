package com.testing;

class person
{
	void message()
	{
		System.out.println("This is initial class");
	}
}

class student extends person
{
	void message()
	{
		System.out.println("This is student class");
	}

void display()

{	
	super.message();

 message();
}
}

public class Supermeth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
student s=new student();
s.display();

	}

}
