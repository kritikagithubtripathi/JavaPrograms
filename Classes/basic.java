package Classes;
	

public class basic {
	public double radius;
	public double area() {
		return Math.PI*radius*radius;
	}
	public double parameter() {
		return Math.PI*2*radius;
	}
	public double circumference() {
		return parameter();
		
	}


	public static void main(String[] args) {
		basic c =new basic();
		c.radius=4;
		System.out.println(c.area());
		System.out.println(c.circumference());
		System.out.println(c.parameter());
		
	}

}
