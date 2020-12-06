package threadsdemo;

public class Conter extends Thread{
	
	public void run() {
		
		
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(i);
			}
			System.out.println(i);

		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conter c = new Conter();
		Conter c2 = new Conter();

		
		c.start();
		c2.start();

		
		
		

	}

}
