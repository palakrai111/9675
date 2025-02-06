import java.util.HashMap;

public class Cust
{
	HashMap<Integer,String> hm = null;
	Cust()
	{
		hm = new HashMap<Integer,String>();
		hm.put(1,"abc");
		hm.put(2,"def");
	}
   void display()
   {
	   System.out.println(hm);
   }
}
