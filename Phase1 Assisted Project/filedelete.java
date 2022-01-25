package files;
import java.io.File;  
	import java.io.IOException;  
	public class deletefile{  
	
	public static void main(String[] args)  
	{  
	File temp;  
	try  
	{  
	temp = File.createTempFile("H:\\text2.txt", "temp");     //creating a .temp file  
	System.out.println("Temp file created at location: " + temp.getAbsolutePath());      
	temp.deleteOnExit();                     //delete file on runtime exit  
	System.out.println("Temp file exists : " + temp.exists());  
	}   
	catch (IOException e)  
	{  
	e.printStackTrace();  
	}  
	}  
	}  
