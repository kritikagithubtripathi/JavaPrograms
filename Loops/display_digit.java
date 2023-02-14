package Loops;

import java.util.Scanner;

public class display_digit {

	public static void main(String[] args) {
		System.out.println("enter any number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r;
		while(n>0) {
			r=n%10;
			n=n/10;
			System.out.println(" display digit "+r);
		}
	}

}
