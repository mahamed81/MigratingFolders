package mypackage;

public class Students {
	
	private int studentID;
	char studentType;
	
	
	public Students() {
	
		this.studentID = 10;
		this.studentType = 'F';
	}



	
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public char getStudentType() {
		return studentType;
	}
	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}

	
	
	public static void main(String[] args) {
		
		
		Students s1 = new Students();
		
		
		s1.setStudentID(121);
		s1.setStudentType('S');
		
		
		System.out.println(s1);
		
	System.out.println(	s1.getStudentID()  + " "  + s1.getStudentType());
		
	}
	
}
