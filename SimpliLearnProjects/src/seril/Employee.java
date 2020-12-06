package seril;

import java.io.Serializable;

public class Employee implements Serializable{
	
	private transient String emName;
	private String emCity;
	private String email;
	public Employee(String emName, String emCity, String email) {
		super();
		this.emName = emName;
		this.emCity = emCity;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [emName=" + emName + ", emCity=" + emCity + ", email=" + email + "]";
	}
	
	
	

}
