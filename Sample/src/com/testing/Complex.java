package com.testing;

class calc
{
	float real,ima;
	calc()
	{
		
     }
	calc(float r, float i)
	{
		real =r;
		ima =i;
	}
	
	void display()
	{
		System.out.println(real + "+" + ima + "i");
	}
	
	calc add(calc c2)
	{
		calc res=new calc();
		res.real= real+c2.real;
		res.ima=ima+c2.ima;
				return res;
	}
	calc sub(calc c2)
	{
		calc res=new calc();
		res.real= real-c2.real;
		res.ima=ima-c2.ima;
				return res;
	}
}

public class Complex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
calc c1=new calc(12.5f,2.5f);
calc c2= new calc(9.0f, 0.5f);
System.out.println("C1 is");
c1.display();
System.out.println("C2 is");
c2.display();
calc c3= new calc();
c3=c1.add(c2);
System.out.println("Addition of 2 Complex number");

c3.display();
c3=c1.sub(c2);
System.out.println("Subtraction of 2 Complex number");
c3.display();
	}

}
