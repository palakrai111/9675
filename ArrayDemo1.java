import java.util.*;
public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[] = {1,2,3};
		int b[] = new int[3];
		//forward direction
		/*int sum  = 0;
		for(int i = 0; i< a.length; i++)
		{
			sum = sum+ a[i];
		   System.out.println(a[i]);	
		}*/
       //reverse drection
		/*System.out.println("revers");
		for(int i = a.length-1; i>=0; i--)
		{
		   System.out.println(a[i]);	
		}*/
		/*System.out.println("data of array b");
		for(int i = 0; i< b.length; i++)
		{
		   b[i]=sc.nextInt();	
		}
		for(int x:b)
		{
			System.out.println(x);
		}*/
		System.out.println("marks");
		int marks[] = {36,45,67,80,37};
		boolean flag = false;
		int total =0;
		for(int i = 0; i<marks.length; i++)
		{
			if(marks[i]<=35)
			{
				flag = true;
			}
			else
			{
				total = total + marks[i];
			}
		}
		if(flag) 
		{System.out.println("failed");}
		else
		{
			System.out.println("passed" + total);
		}
		System.out.println("max and min");
		int max = marks[0];
		int min = marks[0];
		for(int i = 0; i < marks.length;i++)
		{
			/*if(marks[i]>max)
			{
				max = marks[i];
			}*/
			if(marks[i]<min)
			{
				min = marks[i];
			}
		}
		System.out.println(min);
		
	}

}
