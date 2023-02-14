package Loops;

import java.util.Scanner;

public class sumOfNmubers {

	public static void main(String[] args) {
		int sum = 0;
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		n=sc.nextInt();
		for( i=0; i<=n;i++) {
			sum=sum+i;
		}
		System.out.println("sum is:"+sum);
	}

}
