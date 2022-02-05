package files;
import java.io.*;

public class file {
	public static void main(String[] args) {
		try {
		File f=new File("H:\\text2.txt");
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