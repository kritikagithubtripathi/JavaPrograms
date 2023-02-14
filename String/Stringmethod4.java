package String;

public class Stringmethod4 {

	public static void main(String[] args) {
		int b=01;// find a number is hexadecimal or not
		String str=String.valueOf(b);
		System.out.println(str.matches("[01]+"));
		String str1="AB67";
		System.out.println(str1.matches("[0-9A-F]+"));
	}

}
