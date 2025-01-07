
public class sumofevenandproductofodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int podd=1;
		int seven = 0;
		for(int i = 1; i<=10;i++)
		{
			if(i%2 == 0)
			{
				seven = seven + i;
			}else
			{
				podd = podd * i;
			}
		}
       System.out.println("seven"+ seven);
       System.out.println("podd"+ podd);
	}

}
