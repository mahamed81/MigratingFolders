package seril;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BusEmpMain {
	
	private static final String nameRegex = "^[A-Za-z]+$";
	private static final String incRegex = "^[0-9]{1,8}$";
	private static final String emRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
	private static final String statRegex = "^[A-Za-z]{1,3}$";
	
	public static void main(String[] args) throws IOException {
		
		
		
		if(!(checkString(nameRegex, args[0]))) {
			System.out.println(" name is invalid");
		}
		if(!(checkString(incRegex, args[1]))) {
			System.out.println(" income is invalid");
		}
		if(!(checkString(emRegex, args[2]))) {
			System.out.println(" Email is invalid");
		}
		if(!(checkString(statRegex, args[3]))) {
			System.out.println(" state is invalid");
		}
		
		
		
		FileOutputStream out = new FileOutputStream("data.txt");
		
		
		ObjectOutputStream ob = new ObjectOutputStream(out);
		
		
		BusEmployee em = new BusEmployee(args[0], Integer.parseInt(args[1]), args[2], args[3]);
		
		ob.writeObject(em);
		
		System.out.println(em);
		
		ob.close();
		
	}
	
	
	
	
	public static boolean checkString( String rex, String input) {
		
		Pattern p = Pattern.compile(rex);
		
		Matcher m2 = p.matcher(input);
		
		if(m2.matches()) {
			return true;
		}else {
			return false;
		}

	}

}
