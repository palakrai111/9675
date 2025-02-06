import java.util.ArrayList;
import java.util.Collections;

public class Collectionsex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList a1 = new ArrayList();
		a1.add(1);
		a1.add(13);
		a1.add(0);
		a1.add(15);
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println(a1);
		
		System.out.println(Collections.binarySearch(a1,15));
		System.out.println(Collections.min(a1));
		System.out.println(Collections.max(a1));
		

	}

}
