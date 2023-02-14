package array2D;

public class addMatrices {

	public static void main(String[] args) {
		int A[][]= {{2,3,4},{6,5,7},{9,8,7}};
		int B[][]={{1,4,8},{3,9,57},{2,6,5}};
		int C[][]=new int[3][3];
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<A[0].length;j++) {
				C[i][j]=A[i][j]+B[i][j];
			
			}
			
		}
		for(int x[]:C) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println("\n");
		}
	}

}
