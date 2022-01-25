package email;
  import java.util.regex.*;    
import java.util.*;    
public class EmailValidation1{  
    public static void main(String args[]){  
        ArrayList<String> emails = new ArrayList<String>();  
        emails.add("john10@email.co.in");  
        emails.add("ravi@email.com");  
        emails.add("robin56#@email.co.in");  
        emails.add("akash@email.com");  
        emails.add("dhanu@email.com");  
        //Add invalid emails in list  
        emails.add("@yahoo.com");  
        emails.add("shan#domain.com");  
        //Regular Expression   
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";  
        //Compile regular expression to get the pattern  
        Pattern pattern = Pattern.compile(regex);  
        //Iterate emails array list  
        for(String email : emails){  
            //Create instance of matcher   
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +" : "+ matcher.matches()+"\n");  
        }  
    }  
}  

