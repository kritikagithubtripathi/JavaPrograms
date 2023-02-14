package Classes;
import java.util.Scanner;
public class Cylinder {
	double radius;
	double hieght;
	public double area() {
		return 2*Math.PI*radius*hieght;
	}
	public double totalArea() {
		return Math.PI*2*radius*(radius+hieght);
	}
	public double valume() {
		return Math.PI*radius*radius*hieght;
	}

	public static void main(String[] args) {
		Cylinder C=new Cylinder();
		Scanner s=new Scanner(System.in);
		System.out.println("enter radius and hieght:");
		C.radius=s.nextDouble();
		C.hieght=s.nextDouble();
		System.out.println(" Area:"+C.area());
		System.out.println("totalArea:"+C.totalArea());
		System.out.println("valume:"+C.valume());
	}

}
