package Loops;

import java.util.Scanner;

public class table {

	public static void main(String[] args) {
		
		
// write a code for display multiplication table using for loop
		
		
		
		
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number:");
		int n=sc.nextInt();
		for(i=1;i<=10;i++) {
			System.out.println(n+"*"+i+"="+i*n);
			
		}
		
		
// write a code for display multiplication table using while  loop
		
		
		int j=1;
		System.out.println("enter another number:");
		int m=sc.nextInt();
		while(j<=10) {
			System.out.println(m+"*"+j+"="+j*m);
			j++;
		}
	}

}
