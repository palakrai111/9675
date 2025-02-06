package RestaurantProject;

import java.util.*;

public class Restaurant
{
	HashMap<String,Integer> menu = null;
	Restaurant()
	{
		menu = new HashMap<String,Integer>();
		menu.put("idli", 50);
		menu.put("dosa", 150);
		menu.put("vada", 150);
	}
	
	boolean addFood(String food , int price)
	{
		if(menu.containsKey(food))
		{
			System.out.println("already present");
		return false;
		}
		else
		{
			menu.put(food,price);
			return true;
		}
	}
	void display()
	{
		Set<String> food  = menu.keySet();
		for(String s : food)
		{
			System.out.println(menu.get(s) + s);
		}
		
	}
	
}
