package polymorphism;

public class poly {

	
	    public int sum(int x, int y) 
	    { 
	        return (x + y); 
	    } 
	    public int sum(int x, int y, int z) 
	    { 
	        return (x + y + z); 
	    } 
	    public double sum(double x, double y) 
	    { 
	        return (x + y); 
	    } 
	    public static void main(String args[]) 
	    { 
	        poly s = new poly(); 
	        System.out.println(s.sum(20, 40)); 
	        System.out.println(s.sum(16, 20, 60)); 
	        System.out.println(s.sum(10.5, 30.5)); 
	    } 
	}

