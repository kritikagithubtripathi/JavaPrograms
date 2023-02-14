package Inheritance;
class parent{
	public parent() {
		System.out.println("parent constructer:");
	}
	
}
class child extends parent{
	public child() {
		System.out.println("child constructer:");
	}
}

public class InheritConstruct {

	public static void main(String[] args) {
		child c=new child();
		
	}

}
