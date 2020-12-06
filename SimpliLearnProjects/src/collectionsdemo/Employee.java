package collectionsdemo;

public class Employee implements Comparable<Employee>{
	
	private String empName;
	private int empId;
	private String empCity;
	public Employee(String empName, int empId, String empCity) {
		this.empName = empName;
		this.empId = empId;
		this.empCity = empCity;
	}
	public String getEmpName() {
		return empName;
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpCity() {
		return empCity;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", empCity=" + empCity + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empCity == null) ? 0 : empCity.hashCode());
		result = prime * result + empId;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empCity == null) {
			if (other.empCity != null)
				return false;
		} else if (!empCity.equals(other.empCity))
			return false;
		if (empId != other.empId)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		return true;
	}
	@Override
	public int compareTo(Employee o) {
		return o.empId - this.empId;
	}

	

}
