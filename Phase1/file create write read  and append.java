//file create
package filehandling;
import java.io.*;

public class filef {
public static void main(String[] args) {
	try {
	File f=new File("E:\\tes.txt");
	if(f.createNewFile()) {
		System.out.println("file created successfully");
	}
	else {
		System.out.println("file already exists");
	}
	}
	catch(Exception e) {
		System.out.println("file not found");
		e.printStackTrace();
		}
}
}

//write in file

package filehandling;
import java.io.*;

public class write1 {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try {
		FileWriter f=new FileWriter("E:\\tes.txt");

		f.write("welcome to java");
		f.close();
		System.out.println("succesfully updated");
		}catch(IOException e) {
			e.printStackTrace();
		}
		}

	}



//read file
package filehandling;
import java.io.FileReader;  
	public class read{  
	    public static void main(String args[])throws Exception{    
	          FileReader fr=new FileReader("E:\\tes.txt");    
	          int i;    
	          while((i=fr.read())!=-1)    
	          System.out.print((char)i);    
	          fr.close();    
	    }    
	} 
   
//append file
package filehandling;
import java.io.*;
public class append {


	   public static void main(String[] args) throws Exception {
	      try {
	         BufferedWriter out = new BufferedWriter(new FileWriter("E:\\tes.txt"));
	         out.write("hello java\n");
	         out.close();
	         out = new BufferedWriter(new FileWriter("E:\\tes.txt",true));
	         out.write("welcome");
	         out.close();
	         BufferedReader in = new BufferedReader(new FileReader("E:\\tes.txt"));
	         String str;
	         
	         while ((str = in.readLine()) != null) {
	            System.out.println(str);
	         }
	      
	      
	      in.close();
	      }
	      catch (IOException e) {
	         System.out.println("exception occoured"+ e);
	      }
	   
	}
}

