package com.testing;

class Animal   // Parent class for the class Dog           - Class A
{  
void eat()
{System.out.println("eating...");}  
} 

 
class Dog extends Animal  // Parent class for the class Babydog           - Class B
{  
void bark(){System.out.println("barking...");}  
}  


class BabyDog extends Dog                         // - Class c
{  
void weep(){System.out.println("weeping...");}  
}  


public class multiinheri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyDog d=new BabyDog();  
		d.weep();  
		d.bark();  
		d.eat();
	}

}
