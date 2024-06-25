package com.testing;

public class eccapsulation {

	 private String name;
	   private String idNum;
	   private int age;

	   public int getAge() {
	      return age;
	   }

	   public String getName() {
	      return name;
	   }

	   public String getIdNum() {
	      return idNum;
	   }

	   public void setAge( int newAge) {
	      age = newAge;
	   }
	   public void setName(String newName) {
		      name = newName;
		   }

		   public void setIdNum( String newId) {
		      idNum = newId;
		   }
			   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		eccapsulation encap = new eccapsulation();
	      encap.setName("Janani");
	      encap.setAge(34);
	      encap.setIdNum("12343");
	      System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge() + "Id: "+ encap.getIdNum());
	}

}
