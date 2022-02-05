package abstract1;

 abstract class test {

	  
		abstract void draw();  
		}  
		//In real scenario, implementation is provided by others i.e. unknown by end user  
		class Rectangle extends test{  
		void draw(){System.out.println("drawing rectangle");}  
		}  
		class Circle1 extends test{  
		void draw(){System.out.println("drawing circle");}  
		}  
		//In real scenario, method is called by programmer or user  
		class abs{  
		public static void main(String args[]){  
		test s=new Circle1();//In a real scenario, object is provided through method, e.g., getShape() method  
		s.draw();  
		}  
		}  
