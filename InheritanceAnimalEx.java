package daoexample;
class Employees123
{
   int salary = 10000000;	
   
   void displaySay()
   {
	   System.out.println(salary);
   }

}
class Programmer extends Employees123
{
   int bonus = 80000;	
   void displayBonus()
   {
	   System.out.println(bonus);
   }

}
class tester extends Programmer
{
     
	void displayTester()
	   {
		   System.out.println("i am tester");
	   }
}

public class InheritanceAnimalEx 
{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Programmer ob = new Programmer();
		tester ob = new tester();
		System.out.println(ob.bonus);
		System.out.println(ob.salary);
		ob.displaySay();
		ob.displayBonus();
		ob.displayTester();
	}

}
