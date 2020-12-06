import java.io.Serializable;

public class Employee implements Serializable{

	private String empName;
	private String empId;
	private String empEmail;
	private double empSalary;
	
	
	public Employee(String empName, String empId, String empEmail, double empSalary) {
		
		this.empName = empName;
		this.empId = empId;
		this.empEmail = empEmail;
		this.empSalary = empSalary;
	}
	
	public Employee() {
		
	}
	
	public String getEmpName() {
		return empName;
	}


	public String getEmpId() {
		return empId;
	}


	public String getEmpEmail() {
		return empEmail;
	}


	public double getEmpSalary() {
		return empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", empEmail=" + empEmail + ", empSalary="
				+ empSalary + "]\n";
	}


	
	
	
	
	
}
