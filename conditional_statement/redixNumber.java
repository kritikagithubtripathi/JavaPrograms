// FIND REDIX OF ANY NUMBER



package conditional_statement;

import java.util.Scanner;

public class redixNumber {

	public static void main(String[] args) {
		String num;
		System.out.println("enter any number:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextLine();
		if(num.matches("[01]+")) {
			System.out.println("binary number REDIX = 2");
		}
		else if (num.matches("[0-9]+")) {
			System.out.println("decimal number REDIX = 9");
			
		}
		else if(num.matches("[0-7]+")) {
			System.out.println("octal number REDIX = OCTAL");
		}
		else if(num.matches("[0-9A-F]+")) {
			System.out.println("Hexa decimal number REDIX=16");
		}
		else {
			System.out.println("inalid syntax............");
		}
	}

}
