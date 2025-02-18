package DaoDemopackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements Studentdaoint
{

	@Override
	public int addStudent(StudentDto ob) {
		// TODO Auto-generated method stub
		
		int i = 0;
		try {
			Connection con = dbcon1.getCon();
			String q = "insert into student values(?,?,?)";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(1,ob.getId() );
			ps.setString(2, ob.getName());
			ps.setString(3, ob.getEmail());
			
			 i =ps.executeUpdate();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public int delStudent(int id) {
		// TODO Auto-generated method stub
		Connection con;
		int i=0;
		try {
			con=dbcon1.getCon();
			String query= "delete from Student where id=?";
			PreparedStatement ps1 = con.prepareStatement(query);
			ps1.setInt(1, id);
			i= ps1.executeUpdate();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public List<StudentDto> getAllStudents() {
		// TODO Auto-generated method stub
		List<StudentDto> l = new ArrayList<StudentDto>();
		StudentDto s1 = null;
		Connection con;
		try {
			con = dbcon1.getCon();
			String q = "select * from student";
			PreparedStatement ps = con.prepareStatement(q);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				 s1 = new StudentDto(id,name,email);
				 l.add(s1);
			}
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return l;
	}

	@Override
	public StudentDto searchStudent(int id) {
		// TODO Auto-generated method stub
		
		StudentDto s1 = null;
		Connection con;
		try {
			con = dbcon1.getCon();
			String q = "select * from student where id = ?";
			PreparedStatement ps1 = con.prepareStatement(q);
			ps1.setInt(1, id);
			ResultSet rs = ps1.executeQuery();
			
			if(rs.next())
			{
				int sid = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				 s1 = new StudentDto(id,name,email);
			
			}
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return s1;
		
		
		
	}

}
