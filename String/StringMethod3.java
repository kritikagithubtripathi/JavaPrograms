package String;

public class StringMethod3 {

	public static void main(String[] args) {
		//these are regular expression 
		String str1="xyz";
		String str2="K";
		System.out.println(str2.matches("."));
		System.out.println(str2.matches("[Kriti]"));
		System.out.println(str1.matches("[^xyz]"));
		System.out.println(str2.matches("a-z A-Z 0-9]"));

	}

}
