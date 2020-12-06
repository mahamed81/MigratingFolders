package exceptiondemos;
public class TryCatch {
	
	
	 
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a = Integer.parseInt(args[0]);
			 int b = Integer.parseInt(args[1]);
			 
			 int c = b/a;
			 
			 
			 
			}
		
		
			catch (ArithmeticException e) {
				System.out.println( " hey i catch you"+ e);
			}catch (ArrayIndexOutOfBoundsException e2) {
				System.out.println( " no value passed"+ e2);
			} 
		
		finally {
				System.out.println(" inside finally");
			}
			
		
	}

}
