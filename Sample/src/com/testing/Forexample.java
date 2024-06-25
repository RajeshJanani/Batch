package com.testing;

import java.util.Scanner;

public class Forexample {

	public static void main(String[] args) {

	/*	int n=10;
		for(int t=1;t<=n;t++)
{
System.out.println(t);
}*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the number : ");
		int x = sc.nextInt();
		
		int sum=0;
		
		for(int i=1; i<=x; i++)
		{
			sum = sum+i;
			System.out.println(sum);
		}
		
		
		sc.close();		
	}

}
