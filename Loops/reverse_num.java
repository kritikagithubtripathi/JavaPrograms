package Loops;

import java.util.Scanner;

public class reverse_num {

	public static void main(String[] args) {
		System.out.println("enter any number");
		int rev=0,r;
		Scanner s=new Scanner(System.in);
		int n =s.nextInt();
		while(n>0) {
			r=n%10;
			n=n/10;
			rev=rev*10+r;
		}
		System.out.println("reverse of number is:"+rev);

	}

}
