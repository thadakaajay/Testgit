package threads;

public class threadexe extends Thread
{
 	public void run()
 	{
  		System.out.println("concurrent thread started ....");
}
 	public static void main( String args[] )
 	{
  		threadexe mt = new threadexe();
  		mt.start();
 	}
}

