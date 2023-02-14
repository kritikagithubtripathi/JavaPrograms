package conditional_statement;

import java.util.Scanner;

public class if_else {

	
	// write a program to check the number is even or odd
	
	
	
	public static void main(String[] args) {
		int a;
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		
		if(a%2==0) {
			System.out.println("even number");
		}
		else {
			System.out.println("odd number");
		}
			

	}

}
