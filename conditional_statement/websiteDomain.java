package conditional_statement;

import java.util.Scanner;

public class websiteDomain {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter domain name");
		String Domain=sc.nextLine();
		String ext=Domain.substring(Domain.lastIndexOf(".")+1);
		switch(ext) {
		case "com":System.out.println("commercial");
		break;
		case "org":System.out.println("organisation");
		break;
		case "net":System.out.println("network");
		break;
		case "gov":System.out.println("govenment");
		break;
		}
		
	}

}
