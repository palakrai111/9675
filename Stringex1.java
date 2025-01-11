package daoexample;

public class Stringex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "hello woaeiorlddddlll";
		String s[] = x.split(" ");
		for(String y : s)
		{
			System.out.println(y);
		}
         String z = s[0].toUpperCase();
         String h = s[1].substring(0, 3);
         System.out.println(z + " "+ h);
         
         String x1 = s[1].replaceAll("[AEIOUaeiou]", "*");
         System.out.println(x1);
         
         /*int i = 10;
         String x2 = String.valueOf(i);
         System.out.println(10+x2);*/
         
         System.out.println("newstr");
         String uplow = "HellO"; //hELLo
         String newstr = "";
         
         for(int i = 0; i< uplow.length();i++)
         {
        	 char c1 = uplow.charAt(i);
        	 
        	 if(c1 >= 'A' && c1<= 'Z')
        	 {
        		 int u = c1+32;
        		 char w = (char)u;
        		 
        		 newstr = newstr +w;
        	 }
        	 else
        	 {
        		 int low = c1-32;
        		 char w = (char)low;
        		 newstr = newstr +w;
        		 
        	 }
         }
         
         System.out.println(newstr);
         
         
         
         
	}

}
