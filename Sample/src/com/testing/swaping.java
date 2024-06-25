
 package com.testing;

import java.util.Scanner;

public class swaping {

	public static void main(String[] args) {
		  Scanner swap = new Scanner(System.in);
		 System.out.println("Enter the value of x ");  
	        
	        int x= swap.nextInt();
	        System.out.println("Enter the value of y ");  
	        int y = swap.nextInt();  
	        System.out.println("before swapping numbers: "+ "X Value is = " + x +" " + " Y Value is"+ y);  
	        
	      
	        x = x + y;   // 30 20 = 50
	        y = x - y;   // 50-20 = 30
	        x = x - y;   // 50-30 = 20
	        
	        
	        
	        System.out.println("After swapping: "+ " X Value is " + x +"  " + " Y Value is "+ y);   
	        swap.close();
	}

}
