package datastructrue;

import java.util.Comparator;

public class Student implements Comparable<Student >{
	
	
	private String stuName;
	private String stuCity;
	private int stuId;
	private String subj;

	

	
	
	

	public Student(String stuName, String stuCity, int stuId, String subj) {
		super();
		this.stuName = stuName;
		this.stuCity = stuCity;
		this.stuId = stuId;
		this.subj = subj;
	}


	
	

	@Override
	public String toString() {
		return "Student [stuName=" + stuName + ", stuCity=" + stuCity + ", stuId=" + stuId + ", subj=" + subj + "]";
	}





	@Override
	public int compareTo(Student o) {
	
		return o.stuId-this.stuId;
	}
	

}
