
public class Arraysex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4};
		int t = a[0];
		int i;
		for( i = 0; i < 3; i++)
		{
			a[i]= a[i+1];
		}
         a[i] = t;
         for( i = 0; i < 4; i++)
         {
        	System.out.println(a[i]);
         }
         
	}//user input,rev

}
