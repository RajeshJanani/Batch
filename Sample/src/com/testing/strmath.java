package com.testing;

public class strmath {
 static int x=20;
static  int y=50;
  static int z=10;
	
 public static void main(String[] args) {
		// TODO Auto-generated method stub
String txt="ABCDEGDHYFUJ";
String txt1="Here is Java Example";
String txt2="please find me";

System.out.println("Length of the String is:   " + txt2.length());	
System.out.println("Upper Case : " + txt1.toUpperCase());
System.out.println("Upper Case : " + txt1.toLowerCase());

System.out.println(txt2.toUpperCase());


System.out.println("position: "+txt2.indexOf("find"));
System.out.println("Maximum Value is :  " + Math.max(y, x));
System.out.println("Maximum Value is :  "+ Math.min(x,y));
System.out.println("Square root: "+ Math.sqrt(z));

		
	}

}
  