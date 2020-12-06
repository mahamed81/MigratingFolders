package exceptiondemos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.omg.CORBA.UserException;

public class EmployeeImple implements Employee{

	@Override
	public void add(Emp e) throws UserException {
		
			try {
				FileOutputStream f1 = new FileOutputStream("fd");
				
				
			} catch (FileNotFoundException e1) {
//				throw new UserExcetion("Something went wrong, try again later", e1); 
				
			}
		
		
	}

}
