package RestaurantProject;

import java.util.HashMap;
import java.util.Set;

public class Customer extends Restaurant
{
	HashMap<String,Integer> order = null;
	Customer()
	{
		order = new HashMap<String,Integer>();
		order.put("idli", 2);
		order.put("dosa", 2);
		
	}
	
	boolean addOrder(String food,int quantity)
	{
		if(menu.containsKey(food))
		{
			order.put(food,quantity);
			return true;
		}else
		{
			System.out.println("not present in menu");
			return false;
		}
	}
	
	void displayOrder()
	{
		Set<String> food  = order.keySet();
		for(String s : food)
		{
			System.out.println(order.get(s)+s);
		}
		
	}
	
	
	
	void dislayMenu()
	{
		super.display();
	}
	
	void bill()
	{
		int total = 0;
		Set<String> s = order.keySet();
		for(String x : s)
		{
		 total = total + menu.get(x)*order.get(x);	
		}
		System.out.println("total bill amount :" + total);
	}
}
