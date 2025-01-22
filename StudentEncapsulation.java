package daoexample;

public class StudentEncapsulation {
	
	private int sid;
	private String sname;
	
	
	public void setid(int sid)
	{
		this.sid = sid;
	}
	public int getid()
	{
		return sid;
	}
	public void setName(String sname)
	{
		this.sname = sname;
	}
	public String getName()
	{
		return sname;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentEncapsulation ob = new StudentEncapsulation();
		ob.setid(101);
		ob.setName("palak");
		System.out.println(ob.getid() + ob.getName());
	}

}
