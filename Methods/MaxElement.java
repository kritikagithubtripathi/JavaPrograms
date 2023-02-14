package Methods;

public class MaxElement {
	static int Max(int A[]) {
		int i, max=A[0];
		for(i=0;i<A.length-1;i++) {
			if(A[i]>max)
				max=A[i];
			
		}
		return A[i];
	}

	public static void main(String[] args) {
		int B[]= {3,4,5,67,89};
		MaxElement m= new MaxElement();
		System.out.println(m.Max(B));
	}
}
