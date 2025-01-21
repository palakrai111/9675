package daoexample;

public class Methodsexample {
	
	 static int amt = 2000;
	static void deposit(int x)
	{
		amt = amt + x;
	}
	
	static void withdraw(int y)
	{
		amt = amt - y;
	}

	static void display()
	{
		System.out.println("current amy in  my acct is" + amt);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 	//Methodsexample	ob = new Methodsexample();
	 	deposit(500);
	 	withdraw(1000);
	 	display();
	 	
	 	//Methodsexample	ob1 = new Methodsexample();
	 	deposit(500);
	 	withdraw(2000);
	 	display();
		

	}

}
