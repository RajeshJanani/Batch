package com.testing;

import java.util.Scanner;

public class Addbinary2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long binary1, binary2;
		  int i = 0, remainder = 0;
		  int[] sum = new int[20];
		  Scanner in = new Scanner(System.in);

		  System.out.print("Input first binary number: ");
		  binary1 = in.nextLong();
		  System.out.print("Input second binary number: ");
		  binary2 = in.nextLong();

		  while (binary1 != 0 || binary2 != 0) 
		  {
		   sum[i] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
		   i++;
		   remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
		   binary1 = binary1 / 10;
		   binary2 = binary2 / 10;
		  }
		  if (remainder != 0) {
		   sum[i] = remainder;
		   i++;
		  }
		  --i;
		  System.out.print("Sum of two binary numbers: ");
		  while (i >= 0) {
		   System.out.print(sum[i--]);
		  }
		   System.out.print("\n"); 
		   in.close();
	}

}
