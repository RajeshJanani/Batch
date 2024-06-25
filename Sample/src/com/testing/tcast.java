package com.testing;

public class tcast {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int mint=10;
double mdoub=mint;  
System.out.println(mint);
System.out.println(mdoub);


double mydoub=9.78d;
int myint= (int)mydoub;   // datatype variable = (convert datatype) variable assign
System.out.println(mydoub);
System.out.println(myint);

String mystr = "Hello";
String str = "HELLO";

System.out.println("The letter starts "  +  mystr.startsWith("Hel"));
System.out.println(mystr.endsWith("lo"));
System.out.println("The Length is "+ mystr.length());
System.out.println(mystr.equals(str));
System.out.println(mystr.equalsIgnoreCase(str));
System.out.println(str.toLowerCase());
System.out.println(mystr.toUpperCase());
							
	}

}
