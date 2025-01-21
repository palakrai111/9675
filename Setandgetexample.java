package daoexample;

import java.util.Scanner;

public class Setandgetexample {
	int age;
	String name ;
   /*	void acceptInfo()
	{
		Scanner sc = new Scanner(System.in);
		 i = sc.nextInt();
		 sc.nextLine();
		 name = sc.nextLine();
		 
	}
	void displayInfo()
	{
		System.out.println(i  + " "+ name);
	}*/
	
	
	 void setName(String n)
	 {
		 name = n;
	 }

	 String getName()
	 {
		 return name;
	 }
	 
	 void setAge(int a)
	 {
		 age = a;
	 }

	 int getAge()
	 {
		 return age;
	 }
	 
	 
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Setandgetexample ob = new Setandgetexample();
		ob.acceptInfo();
		ob.displayInfo();
		
		Setandgetexample ob1 = new Setandgetexample();
		ob1.acceptInfo();
		ob1.displayInfo();*/
		
		
		Setandgetexample ob = new Setandgetexample();
		ob.setAge(10);
		System.out.println(ob.getAge());
		ob.setName("palak");
		System.out.println(ob.getName());
		

	}

}
