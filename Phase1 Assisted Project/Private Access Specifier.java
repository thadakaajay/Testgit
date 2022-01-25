package privateaccessspecifier;

 class privatespe{

	   private void display() 
	    { 
	        System.out.println("You are using java program"); 
	    } 
	} 

	public class private1{

		public static void main(String[] args) {
			//private
			System.out.println("This is java");
			privatespe  obj = new privatespe(); 
	        //trying to access private method of another class 
	        //obj.display();

		}
	}


