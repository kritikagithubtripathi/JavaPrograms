package Classes;
import java.util.Scanner;
public class Rectangle {
	float length;
	float breath;
	public float area() {
		return length*breath;
	}
	public float parameter() {
		return 2*(length+breath);
	}
	public boolean isSquare() {
		if(length==breath)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Rectangle X=new Rectangle();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the lenngth and breath:");
		X.length=sc.nextFloat();
		X.breath=sc.nextFloat();
		System.out.println("area is:"+X.area());
		System.out.println("parameter:"+X.parameter());
		System.out.println("is it square:"+X.isSquare());
		

	}

}
