package com.testing;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class INPUTREADER {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);

System.out.println("Enter String1 : ");

String a=br.readLine();
System.out.println("Enter String2 : ");
String b=br.readLine();

System.out.println(a);

System.out.println(b);

	}

}
