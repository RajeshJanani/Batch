package com.testing;

public class complex2 {
double real,imagine;
complex2(double r, double i)
{
	this.real=r;
	this.imagine=i;
}

public static complex2 add(complex2 c1, complex2 c2)
{
	complex2 res = new complex2(0,0);
	
	res.real=c1.real+c2.real;
	res.imagine=c1.imagine+c2.imagine;
	
	return res;
}

public static complex2 sub(complex2 c1, complex2 c2)
{
	complex2 res1 = new complex2(0,0);
	
	res1.real=c1.real-c2.real;
	res1.imagine=c1.imagine-c2.imagine;
	
	return res1;
}

public void display()
{
	System.out.println(real+ ""+ "+" + imagine + "i");
}

	public static void main(String[] args) {
	
		complex2 c1=new complex2(12.5,5.5);
		System.out.println("Value of c1 is");
		c1.display();
		complex2 c2= new complex2(5.5,6.5);
		System.out.println("Value of c2 is");
		c2.display();
		complex2 res = add(c1,c2);
		complex2 res1 = sub(c1,c2);
		System.out.println("Sum is " + res.real + "+ " + res.imagine + "i");
		System.out.println("Subtraction is " + res1.real + "+ " + res1.imagine + "i");
		
			
	}

}
