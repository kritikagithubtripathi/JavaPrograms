package Inheritance;
class Super{
	public void Display() {
		System.out.println("super display");
	}
}
class Sub{
	public void Display() {
		System.out.println("sub display");
	}
}

public class OverRiding {

	public static void main(String[] args) {
		Super s= new Super();
		s.Display();
		Sub r= new Sub();
		r.Display();

	}

}
