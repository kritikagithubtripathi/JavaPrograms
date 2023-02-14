package array;

public class maxElement {

	public static void main(String[] args) {
		int A[]= {2,3,4,5,6,98,7,6};
		int max=A[0];
		int i;
		for( i=1;i<A.length;i++) {
			if(A[i]>max) {
				max=A[i];
				
		}
		

	}
		System.out.println(max);
		
	}
}
