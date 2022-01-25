package default1;
class A{  
	  void msg(){System.out.println("Hello");}  
	}  
	//save by B.java  
	 
	class best{  
	  public static void main(String args[]){  
	   A obj = new A();//Compile Time Error  
	   obj.msg();//Compile Time Error  
	  }  
	}  
