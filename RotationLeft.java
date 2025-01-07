
public class RotationLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x[] = {1,2,3,4};
		int temp = x[0];
		int i;
		
		for( i = 0; i < x.length-1;i++)
		{
			x[i] = x[i+1];
		}
		x[i] = temp;
		
		for( i = 0; i < x.length;i++)
		{
			System.out.print(x[i]);
		}

	}

}
