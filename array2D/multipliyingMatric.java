package array2D;

public class multipliyingMatric {

	public static void main(String[] args) {
		int A[][]= {{2,4,6},{4,8,5},{6,9,1}};
		int B[][]= {{2,4,6},{4,8,5},{6,9,1}};
		int C[][]=new int[3][3];
		for(int i=0;i<A.length;i++) { 
			for(int j=0;j<A.length;j++) {
				C[i][j]=0;
			for(int k=0;k<3;k++) {
				C[i][j]= C[i][j]+A[i][k]*B[k][j];
			}
		}
		}
		for(int x[]:C) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println(" \n");
		}

}
}
