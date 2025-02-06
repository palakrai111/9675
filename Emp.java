import java.util.Set;

public class Emp extends Cust
{
	void show()
	{
		super.display();
		Set<Integer> s = hm.keySet();
		for(int i : s)
		{
		System.out.println(hm.get(i) + " " + i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Emp e = new Emp();
		e.show();
	}

}
