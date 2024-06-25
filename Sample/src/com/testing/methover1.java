package com.testing;


class main
{
	public void run()
	{
		System.out.println("This is Parent class");
	}
}	
	class sub1 extends main
	{
		public void run()
		{
			System.out.println("This class extends the parent class");
		}
	}
	public class methover1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
sub1 m = new sub1();  //main m = new sub1();   parentclass object = new childclass();
m.run();


	}

}
