package array;

public class insertElement {

	public static void main(String[] args) {
		int A[]= new int[7];
		A[0]=5;
		A[1]=2;
		A[2]=53;
		A[3]=4;
		A[4]=8;
		A[5]=7;
		
		for(int x:A) {
			System.out.print(x+" " );
			
			
		} 
		System.out.println(" ");
		
		int index=3;
		int value=500;
		int i;
		for( i=A.length-1;i>index;i--) {
			A[i]=A[i-1];
			
		}
		A[index]=value;
		
		
		for(int x:A) {
			System.out.print(x+" " );
			

	}
		System.out.println(" ");

}
}
