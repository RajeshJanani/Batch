package com.testing;

class Animal1{  //PARENT CLASS
void eat(){System.out.println("eating...");}  
}  


class Dog1 extends Animal1{  
void bark(){System.out.println("barking...");}  
}  


class BabyDog1 extends Animal1{  
void weep(){System.out.println("weeping...");}  
}  


public class hierinheri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyDog1 d=new BabyDog1();  
		d.weep();  
		//d.bark(); It shows the compile time error.  
		d.eat();
		
		Dog1 d1=new Dog1();
		d1.bark();
		d1.eat();
		
		
	}

}
