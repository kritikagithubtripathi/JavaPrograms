package array;
import java.util.Scanner;
public class array1D {

	public static void main(String[] args) {
		int A[]=new int[7];
		
		A[0]=2;
		A[1]=4;
		A[2]=6;
		A[3]=8;
		A[4]=10;
		A[5]=12;
		A[6]=14;
		
		
		for(int x:A) {    // we can easily access array element by using for each loop
			System.out.println("element of array A "+x);
		}
	}

}
