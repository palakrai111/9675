import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Fileioexample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*FileInputStream fis = new FileInputStream("C:\\Users\\Administrator.TMFMW01\\eclipse-workspace\\9675Batch\\src\\first.txt");
		int i =0;
       while((i=fis.read())!= -1)
    		   {
    	         System.out.print((char)i);
    		   }*/
       
      /* FileOutputStream fos = new FileOutputStream("C:\\Users\\Administrator.TMFMW01\\eclipse-workspace\\9675Batch\\src\\second.txt");
       String x = "bbbb nnn mm ";
       byte b[] = x.getBytes();
       
       
       fos.write(b);*/
       
       FileWriter fw = new FileWriter("C:\\Users\\Administrator.TMFMW01\\eclipse-workspace\\9675Batch\\src\\fourth.txt");
       fw.write("nnnnnnnnnnnnnnnnmmmmmnnnn");
       fw.close();
       
       FileReader fr = new FileReader("C:\\Users\\Administrator.TMFMW01\\eclipse-workspace\\9675Batch\\src\\fourth.txt");
       int  i = 0;
       while((i=fr.read())!= -1)
	   {
         System.out.print((char)i);
	   }
       
	}

}
