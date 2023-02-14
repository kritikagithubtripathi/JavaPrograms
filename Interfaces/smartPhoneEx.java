package Interfaces;

class phone{
	public void call() {
		System.out.println("phone call:");
	}
	public void sms() {
		System.out.println("sending SMS");
	}
}
interface Icamera{
	void click();
	void record();
}
interface ImusicPlayer{
	void play();
	void stop();
}
class SmartPhone extends phone implements Icamera,ImusicPlayer{
	public void videoCall() {
		System.out.println("Smart phone video calling");
		
	}
	public void click() {
		System.out.println("Smart phone clicking photoes");
		
	}
	public void record() {
		System.out.println("Smart phone recording video");
	}
	public void play() {
		System.out.println("Smart phone playing music");
	}
	public void stop() {
		System.out.println("Smart phone stopped playing music");
	}
}
public class smartPhoneEx {

	public static void main(String[] args) {
		SmartPhone s=new SmartPhone();
		s.call();
		s.videoCall();
		s.click();
		s.record();
		s.play();
		s.stop();
	}

}
