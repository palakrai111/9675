package RestaurantProject;
import java.util.*;
public class RestCust {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Customer c = new Customer();
		c.dislayMenu();
		c.displayOrder();
		boolean b =c.addFood("idli", 30);
		System.out.println(b);
		for(int i = 0 ; i < 2; i++)
		{
			System.out.println("enter food");
			String f = sc.next();
			System.out.println("enter price");
			int p = sc.nextInt();
			boolean b1 =c.addFood(f,p);
		}
		c.dislayMenu();
		System.out.println("order");
		c.addOrder("vada", 3);
		c.displayOrder();
		c.bill();
	}

}
