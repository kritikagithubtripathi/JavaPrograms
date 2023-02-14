package array;
import java.util.*;
public class SearchingElement {

	public static void main(String[] args) {
		int A[]= {2,4,6,78,0,8,95,};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter key element:");
		int key=sc.nextInt();
		for(int i=0;i<A.length;i++) {
			
			if(key==A[i]) {
				System.out.println("the element found at index "+i);
				System.exit(0);
			}
		}
		System.out.println("element not found:");
	}

}
