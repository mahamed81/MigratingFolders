package mypackage;

import java.util.Scanner;

public class WecomeDemo {



	
	public static void main(String [] args) {
		
		
		// program 1
//		boolean b = true;
//		
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<10; j++) {
//				System.out.println(j + "\t");
//				if(j>5) {
//					break;
//				}
//			}
//			System.out.println("outer loop");
//
//		}
//		System.out.println("End ");

		
		
		
		
	
		// program 2
//		boolean b = true;
//		
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<10; j++) {
//				System.out.println(j + "\t");
//				if(j>5) {
//				System.out.println();
//				continue;
//
//				}
//			}
//			System.out.println("outer loop");
//
//		}
//		System.out.println("End ");
//
//		
		
		Scanner scan = new Scanner(System.in);
		String letter = null;
		
		System.out.println("Enter a grade letter");
		letter = scan.nextLine();
		
		
			switch(letter) {
		
			case "A":
			System.out.println(" 80- 100 ");
			break;
			
			case "B":
				System.out.println(" 73- 79 ");
				break;
				
			case "C":
				System.out.println(" 65 - 72 ");
				break;
				
			case "D":
				System.out.println(" 55 - 64 ");
				break;
				
				
			case "E":
				System.out.println(" <55 ");
				break;
				
				default:
					 System.out.println("Grade does not exist");
			}
		
	}
		
	
	
	
	
	
		
	
		
		
	
}
		
		

