package mypackage;

public class Employee {
	
	private int  empId ;
	private String empName;
	private double income;
	private String depa;
	public Employee(int empId, String empName, double income, String depa) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.income = income;
		this.depa = depa;
	}
		
		public Employee() {
			
		}
		
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public String getDepa() {
		return depa;
	}
	public void setDepa(String depa) {
		this.depa = depa;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", income=" + income + ", depa=" + depa + "]";
	}
	
	
	
	

}
