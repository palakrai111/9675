package daoexample;


public class Switch_Demo {
	
	static String display() {
		return "abc";
	}
public static void main(String args[]) {
	int a=1;
String s=switch(a)
			{
	case 0,1->{ yield display();}	    	 
	case 2->{yield "case 2";}
	
	default->{yield "case default";}
	};
	System.out.println(s);
}
}
