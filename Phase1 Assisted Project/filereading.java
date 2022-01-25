package files;
import java.io.FileReader;  
public class readfile {  
    public static void main(String args[])throws Exception{    
          FileReader fr=new FileReader("H:\\text2.txt");    
          int i;    
          while((i=fr.read())!=-1)    
          System.out.print((char)i);    
          fr.close();    
    }    
}    
