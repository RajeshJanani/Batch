package com.testing;

import java.util.Scanner;

public class Addbinary {

	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter the First Binary number");
    String x=input.next();
    System.out.println("Enter the Second Binary number");
    String y=input.next();
    int n1=Integer.parseInt(x, 2);
    int n2=Integer.parseInt(y, 2);
    int n3=n1+n2;
    
    System.out.println(" n1 is "+Integer.toBinaryString(n1));
    System.out.println(" n2 is "+Integer.toBinaryString(n2));
    System.out.println(" n3 = n1+n2  is "+Integer.toBinaryString(n3));
    
    input.close();
	}

}
