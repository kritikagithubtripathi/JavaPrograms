package Methods;

public class method2 {
	 static void max(int x,int y) {  //void method can't return value
		if(x>y) {
			System.out.println(x);
		}
		else {
			System.out.println(y);
		}
	}

	public static void main(String[] args) {
		int a=3,b=4;
		max(a,b);      // method call
	}

}
