package com.testing;

public class Thisk {
int a;
int b;
int c;

Thisk()
{
	
}

Thisk(int a,int b,int c)
{
	
this.a=a;
this.b=b;
this.c=c;
}

void display()
{
	System.out.println("a :" + a  +  "b :" + b + "C:" +c);
	
}

public static void main(String[] args) {
		// TODO Auto-generated method stub
Thisk ob = new Thisk(10,20,30);
ob.display();

	}

}
