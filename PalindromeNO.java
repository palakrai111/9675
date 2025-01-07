
public class PalindromeNO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 154;
		int temp = no;
		int rev  = 0;
		double sum = 0;
		while(no != 0)
		{
			int d = no % 10;
			//rev = rev * 10 + d;
			sum = sum + Math.pow(d,3);
			no = no/10;
			
		}
		if(temp == sum)
		{System.out.println("Armstrong");}
		else {System.out.println("not Armstrong");}

	}

}
