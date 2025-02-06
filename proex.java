import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class proex {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader
				("C:\\Users\\Administrator.TMFMW01\\eclipse-workspace\\9675Batch\\src\\info.properties");
   Properties p = new Properties();
   p.load(fr);
   System.out.println(p.getProperty("email") + " " + p.getProperty("name"));
	
   
   p.setProperty("name","Sonoo Jaiswal");  
   p.setProperty("email","sonoojaiswal@javatpoint.com");  
   FileWriter fr1 = new FileWriter
		   ("C:\\Users\\Administrator.TMFMW01\\eclipse-workspace\\9675Batch\\src\\info.properties");
   p.store(fr1,"java properties ex");
   p.setProperty("name","Sonoo1 Jaiswal");  
   p.setProperty("email","sonoo1jaiswal@javatpoint.com");     
	}

}
