package Methods;

public class MethodPractice {
	 static void change(int A[],int index,int value) {
		A[index]=value;
	}

	public static void main(String[] args) {
		int B[]= {2,4,5,6,8,9};
		change(B,2,20);
		for(int x:B) {
			System.out.println(x);
		}
	}

}
