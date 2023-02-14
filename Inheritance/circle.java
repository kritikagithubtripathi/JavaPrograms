package Inheritance;

class Circle_1{
	public double  radius;
	
	public double area() {
		return Math.PI*radius*radius;
		
	}
	public double parameter() {
		return 2*Math.PI*radius;
	}
	
	
}
class cylinder extends Circle_1{
	public double height;
	public double volume() {
		return Math.PI*radius*height;
	}
}
public class circle {

	public static void main(String[] args) {
		cylinder c=new cylinder();
		c.height=5;
		c.radius=5;
		System.out.println("area:"+c.area());

	}

}
