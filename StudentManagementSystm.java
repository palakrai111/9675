package daoexample;

import java.util.Scanner;

public class StudentManagementSystm {
	int id;
	String name;
	Scanner sc = new Scanner(System.in);
	void acceptInfo()
	{
		System.out.println("ener id");
		 id = sc.nextInt();
        System.out.println("ener name");
		name = sc.next();
	}
     void display()
     {
    	 System.out.println(id + name);
     }
	
//     boolean search(int uid)
//     {
//    	 if(id == uid)
//    	 {
//    		 return true;
//    		}
//    	 else {
//    		 return false;
//    	 }
//     }
    void search(StudentManagementSystm obs[],int uid) {
    	 for(StudentManagementSystm ob:obs) {
    		 if(ob.id==uid) {
    			 System.out.println(ob.name);
    			 break;
    		 }
    	 }
     }
	@Override
	public String toString() {
		return id+"*"+name;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentManagementSystm s1[] = new StudentManagementSystm[3];
		for(int i = 0; i < s1.length;i++)
		{
			s1[i] = new StudentManagementSystm();
			s1[i].acceptInfo();
		}
		for(int i = 0; i < s1.length;i++)
		{
			
			//s1[i].display();
			System.out.println(s1[i]);
		}
		System.out.println("Enter uid");
		//StudentManagementSystm.search(s1, 102);
		
		
		
		StudentManagementSystm ob = new StudentManagementSystm();
		ob.search(s1, 102);
		
//		for(int i = 0; i < s1.length;i++)
//		{
//			
//			boolean b = s1[i].search(102);
//			if(b)
//			{
//				
//				System.out.println(s1[i].name);
//				break;
//			}
//			
//		}
		

	}

}
