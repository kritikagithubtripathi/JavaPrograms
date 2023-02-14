package conditional_statement;


// write a code for find the grades of marks



import java.util.Scanner;

public class elseIf {

	public static void main(String[] args) {
		int m1,m2,m3;
		System.out.println("enter your  three subject marks:");
		Scanner s=new Scanner(System.in);
		m1=s.nextInt();
		m2=s.nextInt();
		m3=s.nextInt();
		float avg=(m1+m2+m3)/3f;
		if(avg>=70) {
			System.out.println("you have passed with A grade ");
		}
		else if(avg>=60 && avg<70) {
			System.out.println("your grade is B");
			
		}
		else if(avg>=45 && avg<60) {
			System.out.println("your grade is C");
			
		}
		else if(avg>=33 && avg<45) {
			System.out.println("your grade is D");
			
		}
		else {
			System.out.println("you are failed .....in exam");
		}

	}

}
