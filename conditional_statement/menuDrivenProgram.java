package conditional_statement;

import java.util.Scanner;

public class menuDrivenProgram {

	private static final int case1 = 0;

	public static void main(String[] args) {
		int a,b;
		System.out.println("enter two value a,b");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("1. add/n");
		System.out.println("2. sub/n");
		System.out.println("3. mul/n");
		System.out.println("4. div/n");
		System.out.println("enter which operation you want to do");
		int menu;
		menu=sc.nextInt();
		switch(menu) 
		{
		case1: System.out.println("addition is:"+(a+b));
		break;
		case2: System.out.println("subtraction is:"+(a-b));
		break;
		case1: System.out.println("multiplication is:"+(a*b));
		break;
		case1: System.out.println("divesion is:"+(a/b));
		break;
		
		
		}
	}

}
