package DaoDemopackage;

import java.util.List;

public class StudentDaoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDto  ob1 = new StudentDto(3,"def","defg@123");
		StudentDaoImpl ob2 = new StudentDaoImpl();
		int j =ob2.addStudent(ob1);
		if(j>0)
		{System.out.println("done");}
		else
		{
			System.out.println("not done");
		}
        List<StudentDto> l = ob2.getAllStudents();
        for(StudentDto x:l)
        {
        	System.out.println(x.email + " "+ x.id + " "+ x.name);
        }
        
        
        System.out.println("searching for student by id");
        StudentDto s1 = ob2.searchStudent(3);
        System.out.println(s1);
        
        System.out.println("Deletion of a student");
        int i= ob2.delStudent(1);
        if(i>0) {
        	System.out.println("deleted ");
        }
        else {
        	System.out.println("something went wrong");
        }
	}

}
