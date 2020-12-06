package mypackage;

public class Student {
	
	private String stuName;
	private String stuCity;
	private int stuGrade;
	
	
	
	// default constructor
	public Student() {
		
	}
	
	
	
	
	
	
	public Student(String stuName, String stuCity, int stuGrade) {
		super();
		this.stuName = stuName;
		this.stuCity = stuCity;
		this.stuGrade = stuGrade;
	}








	@Override
	public String toString() {
		return "Student [stuName=" + stuName + ", stuCity=" + stuCity + ", stuGrade=" + stuGrade + "]";
	}






	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuCity() {
		return stuCity;
	}
	public void setStuCity(String stuCity) {
		this.stuCity = stuCity;
	}
	public int getStuGrade() {
		return stuGrade;
	}
	public void setStuGrade(int stuGrade) {
		this.stuGrade = stuGrade;
	}
	
	
	

}
