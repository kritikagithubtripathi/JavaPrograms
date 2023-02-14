package Constructor;

public class Cylinder {
	private double radius;
	private double height;
	public Cylinder (int r) { //constructor
		radius=height=r;
		
	}
	public Cylinder (double r,double h) {  //constructor
		radius=r;
		height=h;
	}
	public double getRadius() {
		return radius;
	}
	public double getHeight() {
		return height;
	}
	public void setRadius(double r) {
		if(radius>=0)
			radius=r;
		else
			radius=0;
	}
	public void setHeight(double h) {
		if(height>=0)
			height=h;
		else
			height=0;
	}
	public double area() {
		return 2*Math.PI*radius*height;
	}
	public double parameter() {
		return Math.PI*radius*radius*height;
	}

	public static void main(String[] args) {
		Cylinder c=new Cylinder (5);  //constructor automatic call
		System.out.println("Area:"+c.area());
		System.out.println("parameter:"+c.parameter());

	}

}
