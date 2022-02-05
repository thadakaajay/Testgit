public class proaccessspecifier {

	protected void display() 
    { 
        System.out.println("This is java program"); 
    } 
}

//create another package
package pack2;

import pack1.*;

public class accessSpecifiers3 extends proaccessspecifier {

	public static void main(String[] args) {
		accessSpecifiers3 obj = new accessSpecifiers3 ();   
	       obj.display();  
	}

}



