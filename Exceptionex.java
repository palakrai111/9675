package daoexample;

public class Exceptionex {

	static void invalidNumber(int n) throws ArithmeticException
	{
		if(n<0)
		{
			throw new ArithmeticException("INvlid no");
		}
		else
		{
			System.out.println("valid no");
		}
	}
	static void display()
	{
		System.out.println("hello all");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		invalidNumber(-7); 
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		display();
		System.out.println("done");
		
		
	/*	try
		{
			invalidNumber(7); 
		}
		catch(ArithmeticException e)
		{
			
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("i am closing block");
		}*/

	}

}
