package conditional_statement;
import java.util.Scanner;
public class websiteProtocal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any url");
		String url=sc.nextLine();
		String protocal=url.substring(0,url.indexOf(":"));
		if(protocal.equals("http")) {
			System.out.println("Hypertext transfer protocal");
		}
		else if(protocal.equals("ftp")) {
			System.out.println("File transfer protocal");
		}
		
		
		
		
		
		
		String ext= url.substring(url.lastIndexOf(".")+1);
		
		
		if(ext.equals("com")) {
			System.out.println("commercial");
		}
		else if(ext.equals("org")) {
			System.out.println("organisation");
		}
		else if(ext.equals("net")) {
			System.out.println("network");
		}
	}

}
