package daoexample;

public class Arrayinmethod {
  static int sum = 0;
	  static int sumofArray(int x[])
	  {
		  for(int z : x)
		  {
		  sum  = sum + z;
		  }
		  return sum;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int y[] = {1,2,13};
     
     int z = sumofArray(y);
     System.out.println(z);
	}

}
