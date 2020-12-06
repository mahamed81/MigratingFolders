package seril;

import java.io.Serializable;

public class BusEmployee implements Serializable{

	private String empName;
	private int empIncom;
	private String empEmail;
	private String empState;
	
	
	public BusEmployee(String empName, int empIncom, String empEmail, String empState) {
		
		this.empName = empName;
		this.empIncom = empIncom;
		this.empEmail = empEmail;
		this.empState = empState;
	}

	
	public String getEmpName() {
		return empName;
	}



	public int getEmpId() {
		return empIncom;
	}


	public String getEmpEmail() {
		return empEmail;
	}



	public String getState() {
		return empState;
	}




	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empIncom=" + empIncom + ", empEmail=" + empEmail + "]";
	}
	
	
	
	
	
	
}

