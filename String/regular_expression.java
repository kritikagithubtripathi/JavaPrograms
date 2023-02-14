package String;

public class regular_expression {

	public static void main(String[] args) {
		String str="kritikatripathi02092004@gmail.com";
		int i=str.indexOf("@");
		String uname=str.substring(0,i);
		String domain=str.substring(i+1,str.length());
		System.out.println("username is:"+uname);
		System.out.println("domain name:"+domain);
		System.out.println(domain.startsWith("gmail"));
		
	};

}
