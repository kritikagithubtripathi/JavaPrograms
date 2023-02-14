package Loops;

import java.util.Scanner;

public class count_digit {

	public static void main(String[] args) {
		int count=0;
		System.out.println("enter a number:");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		while(n>0) {
			n=n/10;
			count++;
			
			
		}
		System.out.println("number of digit is :"+count);
		
	}

}
