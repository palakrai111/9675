package daoexample;

public class Circle extends ShapeAbstraction
{
	@Override
	
	void draw() {
		// TODO Auto-generated method stub
		System.out.println(" i am inside circle class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeAbstraction ob = new Circle();
		ob.draw();
		ob.shapes();
        ob.display1();
	}

	
}
