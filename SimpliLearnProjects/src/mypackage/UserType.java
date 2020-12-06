package mypackage;

public class UserType {
	
	private String name;
	


	public UserType(String name) {
		super();
		this.name = name;
	}


	public UserType() {
		
	}	

	public static void main(String[] args) {
		UserType u1 = new UserType("fal");
		UserType u2 = new UserType();

		System.out.println(u1.name);
		System.out.println(u2.name);


	}

}
