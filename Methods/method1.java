package Methods;

public class method1 {  
	
	/*
 in this method main method is static but class method is int type so 
 for retrun value we have to make object of class method.

	 */
	
	
	int max(int x,int y) {
		if(x>y) {
			return x;
		}
		else {
			return y;
		}
		
	}

	public static void main(String[] args) {
		int a=23, b=43;
		method1 m=new method1();
		System.out.println(m.max(a, b));
	}

}
