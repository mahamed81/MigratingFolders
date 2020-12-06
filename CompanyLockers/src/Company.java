import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Company {
	
	static Scanner scan = new Scanner(System.in);
	static ArrayList<File> files = new ArrayList<File>();

	public static void main(String[] args) {
		
		boolean flag = true;
		int choice=0;
		

		while(flag) {
			instructions();
			choice= scan.nextInt();


			switch(choice) {
			
			case 1: addFile();
				break;
				
			case 2: deleteFile();
			break;
			
			case 3: searchFile();
			break;
			
			case 4: printFiles();
			break;
			
			case 5: flag = false;
			break;
			
			}
			
		}
		

	}
	
	private static void printFiles() {
		for(Object ob: files) {
			System.out.println(ob);
		}
	}

	private static void searchFile() {
		// TODO Auto-generated method stub
		
	}

	private static void deleteFile() {
		// TODO Auto-generated method stub
		
	}

	public static void instructions() {
		System.out.println("What would you like to do: ");
		System.out.println("Enter 1 to Add a file");
		System.out.println("Enter 2 to Delete a file");
		System.out.println("Enter 3 to Search a file");
		System.out.println("Enter 4 to show list of files");
		System.out.println("Enter 5 to exit the program");

	}
	
	
	public static void addFile() {
		
		System.out.println("Enter the file name");
		String fileName = scan.nextLine();
		scan.nextLine();
		
		File file1 = new File(fileName);
		files.add(file1);
		
	}

}
