package array;

public class CopyOfArray {

	public static void main(String[] args) {
		int A[]= {2,3,4,5,6,89,7};
		int B[] = new int [A.length];
		B=A;
		B[0]++;
		System.out.println("array A:");
		for(int i=0;i<A.length;i++) {
			System.out.print(A[i]+" ");
		}
		System.out.println("");
		System.out.println("capy array B:");
		for(int i=0;i<A.length;i++) {
			System.out.print(B[i]+" ");}
		System.out.println("");

}
	
}
