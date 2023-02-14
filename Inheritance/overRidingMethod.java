package Inheritance;
class tv{
	public void switchOn(){
		System.out.println("tv is switched on");
	}
	public void changeChannel() {
		System.out.println("channel changed");
	}
}
class smartTv extends tv{
	@Override
	public void switchOn(){
		System.out.println("smart tv is switched on");
	}
	@Override
	public void changeChannel() {
		System.out.println(" smart tv channel changed");
	}
	public void browse() {
		System.out.println("smart tv browsing")
	}
}

public class overRidingMethod {

	public static void main(String[] args) {
		tv t=new smartTv();
		t.switchOn();
		t.changeChannel();
		//((smartTv) t).browse();
	}

}
