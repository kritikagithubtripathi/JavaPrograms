package Loops;

import java.util.Scanner;

public class armstrong_num {

	public static void main(String[] args) {
// if the sum of  cubes of the digit is equal to the number then its called armstrong number 
// like 153=1^3+5^3+3^3=153
		System.out.println("enter any number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=n;
		int r;
		int sum=0;
	    while(n>0) {
	    	 r=n%10;
	    	 n=n/10;
	    	 sum=sum+r*r*r;
	    	 
	    }
	    if(sum==m) {
	    	System.out.println("number is armstrong number"+sum);
	    }
	    else {
	    	System.out.println("number is  not armstrong number");
	    }
	    
	}

}
