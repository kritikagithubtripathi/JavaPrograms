package Methods;

public class FindGCD {
	static int gcd(int m,int n) {
		while(m!=n) {
		if(m>n) {
			m=m-n;
		
		}
		else {
			n=n-m;
		}
		

	}
		return n;
	}

	public static void main(String[] args) {
		System.out.println(gcd(13,91));
	}

}