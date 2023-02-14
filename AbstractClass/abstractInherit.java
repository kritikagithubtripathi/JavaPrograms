package AbstractClass; //abstruct class for run time pollymerphism
// or  for dyanamic dispatch
 abstract class Shape{
	
	public int radius;
	public abstract double parameter();
	public  abstract double area();
	
}
 class Circle extends Shape{
	 public double radius;
	 
	 public double parameter() {
		 return  2*Math.PI*radius;
	 }
	 public double area() {
		return Math.PI*radius*radius;
	 }
 }
 
 class Rectangle extends Shape{
	 double length;
	 double width;
	 public double parameter() {
		 
		return 2*(length+width);
	 }
	 public double area() {
		 
		return length*width;
	 }
 }
public class abstractInherit {

	public static void main(String[] args) {
		Circle c=new Circle();
		Rectangle s=new Rectangle();
	    Shape a=s;
		s.length=5;
		s.width=10;
		s.area();
		c.radius=30;
		System.out.println(c.area());
		System.out.println(s.area());
		

	}

}
