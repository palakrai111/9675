package daoexample;

public class Constuctorex {
	int id;
	String name;
	int fees;
	static
	{
		System.out.println("hello world");
	}
	Constuctorex(int id ,String name)
	{
		this.id = id;
		this.name = name;
	}
	Constuctorex(int id ,String name,int fees)
	{
		
		this(id,name);
		this.fees = fees;
	}
	void show()
	{
		System.out.println("hello");
	}
	void display()
	{
		show();
		System.out.println(id + name + fees);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constuctorex ob= new Constuctorex(1,"abc");
		Constuctorex ob2= new Constuctorex(2,"abcdef",300);
		//System.out.println(ob);
		ob.display();
		ob2.display();
		

	}

}
