package daoexample;

public abstract class ShapeAbstraction 
{
	ShapeAbstraction()
	{
		System.out.println("i am inside abstract class");
	}
	abstract void draw();
	void shapes()
	{
		System.out.println("drawing different shapes");
	}
	final void display1()
	{
		System.out.println("drawing different shapes");
	}
}
