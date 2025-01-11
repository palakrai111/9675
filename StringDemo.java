package daoexample;

import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s1 = "Welcome"; 
		// 65 - 90
		//String s3 = "ABC";
		/*String s2 = new String("welcome"); // 97 - 122
		boolean flag = false;
		if(s1.equals(s2))
		{
			flag = true;
			
		}
		if(flag)
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equal");
		}
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1 + s3);
		System.out.println(s1.concat(s3));*/
		
		
		/*String rev = "";
		for(int i = s3.length()-1; i>=0;i--)
		{
			char c = s3.charAt(i);
			rev = rev + c;
		}
		
		System.out.println(rev); */
		String s1 = "raae";
		String s2 = "care";
		if(s1.length() == s2.length())
		{
			char c1[] =s1.toCharArray();
			char c2[] = s2.toCharArray();
			Arrays.sort(c2);
			Arrays.sort(c1);
			boolean b = Arrays.equals(c1, c2);
			if(b)
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("not Anagram de to char ");
			}
			
		}
		else
		{
			System.out.println("not anagram bcoz of length");
		}
		
		
		
		
		

	}

}
