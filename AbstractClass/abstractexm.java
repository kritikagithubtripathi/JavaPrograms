package AbstractClass;

abstract class Super{ // if under any class have any abstract method then class have to be absract class
	public Super() {
		System.out.println("super constructer:");
	}
	public void meth1() {
		System.out.println("meth1 of super");
	}
	abstract public void meth2(); //abstract method not return anything
}

class Sub extends Super{
	public Sub() {
		System.out.println("sub constructer:");
	}
	@Override
	public void meth2() {
		System.out.println("meth2 of sub");
	}
	
}

public class abstractexm {

	public static void main(String[] args) {
		Sub s=new Sub(); // we can't make object of abstract class
		s.meth1();
		s.meth2();
		
	}

}
