package mypackage;

public class PassByVal {
	
	
	public void passByVal(int id) {
		id =10;
		System.out.println(" the id is " + id);
	}
	
	

	public static void main(String[] args) {
		int id = 25;
		PassByVal val = new PassByVal();
		System.out.println(id);
		val.passByVal(id);
		System.out.println("The id is " + id);

	}

}
