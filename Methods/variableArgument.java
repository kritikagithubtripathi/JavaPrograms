package Methods;

public class variableArgument {
	static void show(int ...A) {
		for(int x:A)
			System.out.println(x);
	}
	

	public static void main(String[] args) {
		 show();
		 show(2,3,4,5);
		 show(new int[] {3,4,56,7,88,9});
	}

}
