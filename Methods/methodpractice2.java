package Methods;

public class methodpractice2 {
	static int max(int x,int y) {
		 return x>y?x:y;
	}
// that is called method overloading 	
	static float max(float a, float b) {
		if(a>b) {
			return a;
			}
		else {
			return b;
		}
	}
	static int max(int x,int y,int z) {
		if(x>y&&x>z)
			return x;
		else if(y>z)
			return y;
		else
			return z;
	}

	public static void main(String[] args) {
		int a=3,b=4,c=6;
		System.out.print(max(a,b,c));
		
	}

}
