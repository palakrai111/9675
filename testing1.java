package daoexample;

public class testing1 {

	
	static int amt = 1000;
	
	static int deposit(int x[])
	{
		for(int z:x)
		{
		amt = amt + z;
		}
		return amt;
	}
	static void display()
	{
		System.out.println(amt);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println("abc");
   int x[] = {1,2,3};
   int y =deposit(x);
   System.out.println(y);
   display();
   
	}

}
