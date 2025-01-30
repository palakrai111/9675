package daoexample;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EmployeeService 
{
	Set<EmployeeEntity> s1 = new HashSet<EmployeeEntity>();
	Scanner sc = new Scanner(System.in);
	EmployeeEntity  e1 = new EmployeeEntity(1,"abc");
	EmployeeEntity  e2 = new EmployeeEntity(2,"def");
	EmployeeEntity  e3 = new EmployeeEntity(3,"lmn");
	EmployeeService ()
	{
		s1.add(e1);
		s1.add(e2);
		s1.add(e3);
	}
	
	void display()
	{
		for(EmployeeEntity x : s1)
		{
			System.out.println(x);
		}
	}
	
	
	void addEmployee()
	{
		System.out.println("enter id");
		
		int id = sc.nextInt();
        System.out.println("enter name");
		
		String name = sc.next();
		EmployeeEntity  enew = new EmployeeEntity(id,name);
		s1.add(enew);
		
	}
	void search()
	{
      System.out.println("enter id to search");
		int id = sc.nextInt();
		boolean found = false;
		for(EmployeeEntity x : s1)
		{
			if(x.id == id)
			{
				found = true;
				break;
			}
		}
		if(found)
		{
			System.out.println("employee found ");
		}
		else
		{
			System.out.println("employee not found ");
		}
		
	}
	
	void delete()
	{
		System.out.println("enter id to delete");
		int id = sc.nextInt();
		boolean found = false;
		for(EmployeeEntity x : s1)
		{
			if(x.id == id)
			{
				found = true;
				s1.remove(x);
				break;
			}
		}
		display();
	}
	
	void update()
	{
		System.out.println("enter id to update");
		int id = sc.nextInt();
		System.out.println("enter name to update");
		String name = sc.next();
		
		boolean found = false;
		for(EmployeeEntity x : s1)
		{
			if(x.id == id)
			{
				found = true;
				x.setName(name);
				break;
			}
		}
		display();
	}
	
	
}
