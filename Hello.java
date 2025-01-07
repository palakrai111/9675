
public class Hello {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10<<2);
		System.out.println(10>>2);
		System.out.println(8|9);
		System.out.println(8&9);
		
		int c = 10;
		System.out.println(c++ + --c);
		int height = 6;
		int weight = 65;
		if(height >= 6 && weight <= 65 )
		{
			System.out.println("eligible");
		}
		else
		{
			System.out.println(" no eligible");
		}
		
		int x = 10;
		int y = 20;
		boolean z = (x<y) ? true :false;
		System.out.println(z);

	}

}
