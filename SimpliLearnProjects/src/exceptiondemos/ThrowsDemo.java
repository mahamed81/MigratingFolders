package exceptiondemos;

public class ThrowsDemo {
	
	
	
	
	public static void demoProc() {
		
		try {
			throw new  NullPointerException("Inside demo method");
		}catch(Exception e) {
			
		}
	}

	public static void main(String[] args) {
		
		demoProc();
	}

}
