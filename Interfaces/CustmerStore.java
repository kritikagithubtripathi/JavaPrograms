package Interfaces;

interface member{
	public void callback();
}

class Store{
	member members[]=new member[10];
	 int count=0;
	 
	 void register(member m) {
		 members[count++]=m;
	 }
	 void inviteSale() {
		 for(int i=0;i<count;i++)
			 members[i].callback();
	 }
}

class custmer implements member{
	String name;
	
	custmer(String n){
		name=n;
	}
	public void callback() {
		System.out.println("ok, I will visit "+name);
	}
}
	public class CustmerStore {

	public static void main(String[] args) {
		Store s=new Store();
		custmer c1=new custmer("Kritika");
		custmer c2=new custmer("Riya");
		
		s.register(c1);
		s.register(c2);
		
		s.inviteSale();

	}

}
