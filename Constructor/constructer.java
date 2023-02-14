package Constructor;
class Recatangle {
	private int length;
	private int breath;
	public  Recatangle() {
		length=1;
		breath=1;
	}
	public Recatangle(int l,int b) {
		setLength(l);
		setBreath(b);
	}
	public int getLength() {
		return length;
	}
	public int getBreath() {
		return breath;
	}
	public void setLength(int l) {
		if(length>=0)
			length=l;
		else
			length=0;
	}
	public void setBreath(int b) {
		if(breath>=0)
			 breath=b;
		else
			breath=0;
	}
	public Recatangle(int s) {
		length=breath=s;
	}
	public int area() {
		return getLength()*getBreath();
	}
	public int parameter() {
		return 2*(length+breath);
	}
}

public class constructer {

	public static void main(String[] args) {
		Recatangle r=new Recatangle(10,4);   //constructer means its automatic call when function call
		System.out.println("area:"+r.area()); //and in constructer mathos name and class name wil same
		System.out.println("parameter:"+r.parameter());
	
	}

}
