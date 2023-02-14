package Interfaces;
//  Interface  is work like abstract class

interface Test{
	
	void meth1();
	void meth2();
}
class Test2 implements Test{
	public void meth1() {
		System.out.println("meth1 of test2");
	}
	public void meth2() {
		System.out.println("meth2 of test2:");
	}
	public void meth3() {
		System.out.println("meth3 of test2");
	}
}
public class intro {

	public static void main(String[] args) {
		Test t=new Test2();//cwe can not make object of abstract class or interface class
        t.meth1();
        t.meth2();
        //t.meth3();
	}

}
