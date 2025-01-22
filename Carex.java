package daoexample;

public class Carex {
	
	int car_name;
	String car_brand;
	MusicPlayer1 mp;
	public Carex(int car_name, String car_brand, MusicPlayer1 mp) {
		
		this.car_name = car_name;
		this.car_brand = car_brand;
		this.mp = mp;
	}

	void displayDetails()
	{
		System.out.println(car_name + car_brand + mp.brand+mp.modelno);
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MusicPlayer1 ob1 = new MusicPlayer1(1,"sony");
		MusicPlayer1 ob2 = new MusicPlayer1(2,"phillips");
		Carex c1= new Carex(101,"EcoSports",ob1);
		Carex c2 = new Carex(102,"kiaSeltos",ob2);
		c1.displayDetails();
		c2.displayDetails();

	}

}
