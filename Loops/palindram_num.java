package Loops;
import java.util.Scanner;

public class palindram_num {
// if the reverse of a number is equal to the actual number then it's called palindram number	

	public static void main(String[] args) {
		System.out.println("enter any number:");
		int rev=0,r;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=n;
		while(n>0) {
			r=n%10;
			n=n/10;
			rev=rev*10+r;
		}
		if(rev==m) {
			System.out.println("number is palindram");
		}
		else {
			System.out.println("number is  not palindram");
		}
		
;
		}

}
