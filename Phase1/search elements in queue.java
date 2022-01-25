package removeelementasinqueue;
import java.util.*;

public class queue {


public static void main(String[] args) 
{
        		Queue<String> locationsQueue = new LinkedList<>();
locationsQueue.add("Kolkata");
        		locationsQueue.add("hyderabad");
        		locationsQueue.add("Delhi");
        		locationsQueue.add("Kolkata");
        		locationsQueue.add("Banglore");
System.out.println("Queue is : " + locationsQueue);
        		System.out.println("Head of Queue : " + locationsQueue.peek());
        		locationsQueue.remove();
        		System.out.println("After removing Head of Queue : " + locationsQueue);
        		System.out.println("Size of Queue : " + locationsQueue.size());
    	}
}

