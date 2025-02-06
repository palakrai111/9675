
public class Book implements Comparable<Book>
{
     int bid;
     public Book(int bid, String bname) {
		super();
		this.bid = bid;
		this.bname = bname;
	}
	String bname;
	//@Override
	/*public int compareTo(Book o) {
		
		if(o.bid == this.bid)
		{
		return 0;
		}else if(this.bid > o.bid)
		{
			return 1;
		}else
		{
			return -1;
		}*/
	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return 0;
	}
	}

