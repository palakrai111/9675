package daoexample;
enum Color{
	RED,
	BLUE,
	GREEN;
	private Color() {
		System.out.println("constructor called for:"+this.toString());
	}
	public void colorInfo() {
		System.out.println("pleasing color");
	}
}
public class Enum_practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Color c1=Color.RED;
       System.out.println(Color.values());
       c1.colorInfo();
	}

}
