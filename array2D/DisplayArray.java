package array2D;

public class DisplayArray {

	public static void main(String[] args) {
		int A[][]=new int[3][3];
		int B[][]= {{2,3,4},{4,5,6},{5,7,8}};
		for(int i=0;i<B.length;i++) {
			for(int j=0;j<B[0].length;j++) {
				System.out.print(B[i][j]);
			}
			System.out.println("\n");
		}
	}

}
