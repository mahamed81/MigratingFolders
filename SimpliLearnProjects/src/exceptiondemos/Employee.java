package exceptiondemos;

import java.io.FileNotFoundException;

import org.omg.CORBA.UserException;

public interface Employee {
	
	public void add(Emp e) throws UserException;

}
