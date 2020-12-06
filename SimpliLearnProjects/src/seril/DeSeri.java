package seril;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class DeSeri {
	
	public static final String regex = "^(.+)@(.+)$";

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		FileInputStream file = new FileInputStream("data.txt");
		
		ObjectInputStream ob = new ObjectInputStream(file);
		
		Employee em = (Employee) ob.readObject();
		
		System.out.println(em);
		
	
		
		
	}
		

}
