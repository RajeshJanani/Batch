package com.testing;

public class NewTest {

	int x=50;
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub

		NewTest obj = (NewTest)Class.forName("com.testing.NewTest").newInstance();
		System.out.println(obj.x);
	}

}
