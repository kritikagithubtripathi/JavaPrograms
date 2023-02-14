package Methods;

public class reverseOverloading {
	public int reverse(int n) {
		int rev=0;
		while(n!=0) {
		rev=rev*10+n%10;
		n=n/10;
		}
		return rev;

	}
	public int [] reverse(int A[]) {
		int B[]=new int[A.length];
		for(int i=A.length-1,j=0;i>=0;i--,j++) {
	    B[j]= A[i];
		}
		return B;
	}
		
	public static void main(String[] args) {
		reverseOverloading R=new reverseOverloading();
		int x=12345;
		int X[]= {3,4,6,7,8,90};
		System.out.println(R.reverse(x));
		System.out.println(R.reverse(X));

	
}
}
