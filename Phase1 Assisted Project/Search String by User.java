package searchstring;

public class searchstr {
public static void main(String[] args) {
String[] strArray3 = { "robin2@gmail.com", "shan12@gmail.com", "tom16@gmail.com" };
boolean found = false;
int index = 0;
String s = "shan12@gmail.com";
for (int i = 0; i < strArray3.length; i++) {
if(s.equals(strArray3[i])) {
index = i; found = true; break;
}
}
if(found)
System.out.println(s +" found at the index "+index);
else
System.out.println(s +" not found in the array");
}
}

