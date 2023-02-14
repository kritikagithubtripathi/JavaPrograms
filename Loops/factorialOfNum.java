package Loops;
import java.util.Scanner;
public class factorialOfNum {

	public static void main(String[] args) {
		int i,n;
		int fact=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter any number:");
		n=s.nextInt();
		for(i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("factorial is:"+fact);
	}

}
