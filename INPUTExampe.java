import java.util.*;
public class INPUTExampe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char choice;
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String name = sc.nextLine();
		System.out.println(name);
		System.out.println("enetr age");
		int age = sc.nextInt();
		System.out.println(age);
		System.out.println("enetr gender");
		char c = sc.next().charAt(0);
		System.out.println(c);
		System.out.println("i you want to cntinue pree y else n");
		choice = sc.next().charAt(0);
		if(choice == 'n')
		{
			break;
		}
		}while(choice == 'y');
		
		
		
		

	}

}
