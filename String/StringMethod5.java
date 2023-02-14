package String;

public class StringMethod5 {

	public static void main(String[] args) {
		String str1="02/09/2004";
		
		//find is the data in format( dd/mm/yyyy)
		System.out.println(str1.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));

	}

}
