package threadsdemo;

public class ThreadsDemo implements Runnable{
	
	

	public void run() {
		System.out.println("chld thread is running");
	}

	public static void main(String[] args) {

		ThreadsDemo t = new ThreadsDemo();
		
		Thread t1 = new Thread(t); // 
		
		t1.start(); // This will bring the thread in the runnable state and the CPU will call the run() method

		
		
	}

}
