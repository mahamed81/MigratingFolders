package mypackage;

public class ThreadTest extends Thread {
	  public static int amount = 0;

	  public static void main(String[] args) {
	    ThreadTest thread = new ThreadTest();
	    
	    thread.start();
	    System.out.println(amount);
	    amount++;
	    System.out.println(amount);
	  }

	  public void run() {
	  System.out.println(" The amount is : "+  amount++);
	    
	    
	  }
	}
