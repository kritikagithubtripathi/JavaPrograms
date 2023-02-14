package array;

public class sumOfArray {

	public static void main(String[] args) {
		int sum =0;
		int A[]= {3,4,5,7,8,9,6,3,1};
		for(int i=0;i<A.length;i++) {
			sum=sum+A[i];
			sum++;
		}
		System.out.println("sum is:"+sum);
	}

}
