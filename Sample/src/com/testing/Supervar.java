package com.testing;

class vehicle  //parent class
{
	int maxspeed=120;
}

class car extends vehicle // child class
{
	int maxspeed=180;
	
	void display()
	{
		System.out.println("Maximum Speed :" + super.maxspeed);
	}
}

public class Supervar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
car small=new car();
small.display();
	}

}
