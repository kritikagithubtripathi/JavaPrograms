//Display name  of day based on number




package conditional_statement;
import java.util.Scanner;
public class DisplayName {
	public static void main(String args[]) {
		int day;
		System.out.println("enter day number:");
		Scanner sc=new Scanner(System.in);
		day=sc.nextInt();
		if(day==1) {
			System.out.println("monday");
		}
		else if(day==2) {
			System.out.println("tuesday");
		}
		else if(day==3) {
			System.out.println("wednesday");
		}
		else if(day==4) {
			System.out.println("thursday");
		}
		else if(day==5) {
			System.out.println("friday");
		}
		else if(day==6) {
			System.out.println("saturday");
		}
		else if(day==7) {
			System.out.println("sunday");
		}
		
	}

}