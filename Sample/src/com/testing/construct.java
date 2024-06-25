package com.testing;

public class construct {

	int x;
	int z;
	int a;
	construct()
	{
		x=5;
		
	}
	
	construct(int y)
	{
		x=y;
	}
	
	construct(int x, int y)
	{
		a=x;
		z=y;
	}
	public static void main(String[] args) {
		
construct ob = new construct();
construct obj = new construct(10);
construct on =new construct(80,90);

System.out.println(ob.x);
System.out.println(obj.x);
System.out.println(on.a  +"" +  on.z);
	}

}
