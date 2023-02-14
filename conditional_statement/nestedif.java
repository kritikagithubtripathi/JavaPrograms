//write code for find the person is young or not



package conditional_statement;
import java.util.Scanner;
public class nestedif {

	public static void main(String[] args) {
		int age;
		System.out.println("enter the age of person:");
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
		if(age>=14 && age<=55) {
			System.out.println("young person");
			
		}
		else {
			if(age<14) {
				System.out.println(" He is child");
			}
			else {
				System.out.println("he is old");
			}
		}
		
	}

}
