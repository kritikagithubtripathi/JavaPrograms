package Methods;

public class methodTest {
	static void update(int A[]) {
		A[2]=34;
		A[0]=20;
		
	}

	public static void main(String[] args) {
		int B[]= {2,3,45,6,89,6,0};
		update(B);
		for(int i=0;i<B.length-1;i++) {
			System.out.println(B[i]);
		}
		
		
	}

}
