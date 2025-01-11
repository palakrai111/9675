package daoexample;

public class Stringex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 /*  String x = "i am palak";
			   String y = "am"; // i palak
			   String newstr = "";
			   
			   String w[] = x.split(" ");
			   for(String h : w)
			   {
				   if(!h.equals(y))
				   {
					    newstr = newstr + h + " ";
				   }
			   }
			   System.out.println(newstr );*/
		
		StringBuffer sb = new StringBuffer("hello");
		sb.append("world");
		System.out.println(sb);
		sb.insert(1,"abc");
		System.out.println(sb);
		sb.delete(1, 3);
		System.out.println(sb);
		sb.replace(1, 3, "xyz");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		
		
			   
			   
			   
	}
			  

}
