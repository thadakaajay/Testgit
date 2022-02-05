package collection;

 
	import java.util.*;

	public class coll{

		public static void main(String[] args) {
			//creating arraylist
			System.out.println("ArrayList");
			ArrayList<String> city=new ArrayList<String>();   
		      city.add("Bangalore");//
		      city.add("Delhi");    	   
		      System.out.println(city);  
			
			//creating vector
		      System.out.println("\n");
		      System.out.println("Vector");
		      Vector<Integer> vec = new Vector();
		      vec.addElement(15); 
		      vec.addElement(30); 
		      System.out.println(vec);
			
			//creating linkedlist
		      System.out.println("\n");
		      System.out.println("LinkedList");
		      LinkedList<String> names=new LinkedList<String>();  
		      names.add("Alex");  
		      names.add("John");  	      
		      Iterator<String> itr=names.iterator();  
		      while(itr.hasNext()){  
		       System.out.println(itr.next());  
		       
		       //creating hashset
		       System.out.println("\n");
		       System.out.println("HashSet");
		       HashSet<Integer> set=new HashSet<Integer>();  
		       set.add(20);  
		       set.add(40);  
		       set.add(60);
		       set.add(80);
		       System.out.println(set);
		       
		       //creating linkedhashset
		       System.out.println("\n");
		       System.out.println("LinkedHashSet");
		       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
		       set2.add(10);  
		       set2.add(30);  
		       set2.add(50);
		       set2.add(70);	       
		       System.out.println(set2);
		      	} 
		      }  
		}
