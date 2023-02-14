//Switch case allow int,short,String,char,Byte  data type
//but it dose not allow float data type  

package conditional_statement;

import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {
		int day;
		System.out.println("enter day number:");
		Scanner sc=new Scanner(System.in);
		day=sc.nextInt();
		switch(day) {
		case 1:System.out.println("monday");
		       break;
		case 2:System.out.println("tuesday");
		break;
		case 3:System.out.println("wednesday");
		break;
		case 4:System.out.println("thursday");
		break;
		case 5:System.out.println("friday");
		break;
		case 6:System.out.println("saturday");
		break;
		case 7:System.out.println("sunday");
		break;
		
		}
		
		

	}

}
