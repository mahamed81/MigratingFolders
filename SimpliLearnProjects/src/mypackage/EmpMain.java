package mypackage;

import java.util.Scanner;

public class EmpMain {

	
	
	public static void main(String[] args) {
		
		
		int n, x, flag=1, loc=0;
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println(" Enter number of ele");
		n= scan.nextInt();
		
		int a[] = new int[n];
		
		System.out.println(" Enter all the ele");
		
		for(int i =0; i<n; i ++) {
			
			a[i] = scan.nextInt();
		}
		
		
		System.out.println(" Enter the elem you want to delete");
		
		x = scan.nextInt();
		
		for(int i =0; i<n; i++) {
			
			if(a[i]==x) {
				
				flag = 1;
				loc=i;
				break;
			}else {
				flag=0;
			}	
		}
		
		
		if(flag==1) {
			
			for(int i=loc+1; i<n; i++) {
				a[i-1]= a[i]; 
			}
		}
		
		
		
}
}
