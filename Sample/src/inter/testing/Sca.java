package inter.testing;

import java.util.Scanner;

public class Sca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ob = new Scanner(System.in);

System.out.println("Enter Name");
String name=ob.nextLine();
System.out.println("Enter Age");

int age=ob.nextInt();
System.out.println("Name : "+ name);
System.out.println("Age : "+ age);

int a,b;
int c;
System.out.println("Enter First Number : ");
a=ob.nextInt();
System.out.println("Enter Second Number : ");
b=ob.nextInt();

c=a+b;

System.out.println("Addition is " + c);
ob.close();

	}

}
