package String;

public class Regular_expression_practice {

	public static void main(String[] args) {
		// Q1. write a program for remove special charecters in a string
		String str1= "a#c@b94$d!W";
		System.out.println(str1.replaceAll("[^a-z0-9A-Z]",""));
		
		
		
		//Q2.write program for remove extra space in a string
		
		String str2="  abs     shfgkdk     fdkb  ";
		System.out.println(str2.replaceAll("[\\s]",""));
		
		
		
		// Q3. write program for find number of words in a string
		
		 String str=str2.replaceAll("[\\s]","");
		 String words[]=str.split("\\s");
		 String words1[]=str2.split("\\s");
		 System.out.println(words.length);
		 System.out.println(words1.length);
		
	}

}
