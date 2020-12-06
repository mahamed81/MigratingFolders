package seril;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SeriMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		Employee em = new Employee("hassan", "mdfd", "dfljdkf@m");
		
		
		
		
		FileOutputStream file = new FileOutputStream("data.txt");
		
		ObjectOutputStream ob = new ObjectOutputStream(file);
		
		ob.writeObject(em);
		
		System.out.println(em);
	}

}
