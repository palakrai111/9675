package DaoDemopackage;

import java.util.List;

public interface Studentdaoint 
{
	public int addStudent(StudentDto ob);
	public int delStudent(int id);
	List<StudentDto> getAllStudents();
	public StudentDto searchStudent(int id);
	

}
