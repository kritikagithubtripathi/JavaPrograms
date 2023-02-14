package Inheritance;

class car{
	public void start() {System.out.println("car started");}
	public void accelerate() {System.out.println("car accelerated");}
	public void changeGear() {System.out.println("car gear changed");}
}
class luxaryCar extends car{
	public void changeGear() {System.out.println("automatic change gear");}
	public void openRoof() {System.out.println("Sun roof is opened");}
	
}

public class overRidingExample {

	public static void main(String[] args) {
		luxaryCar c=new luxaryCar();
		c.start();
		c.accelerate();
		c.changeGear();
		c.openRoof();
	}

}
