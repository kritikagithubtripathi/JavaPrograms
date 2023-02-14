package Classes;

class rectangle {
	private int length;
	private int breath;
	
	public int getLength() {
		return length;
	}
	public int getBreath() {
		return breath;
	}
	public  void  setLength(int l) {
		if(l>=0)
		   length=l;
		else
			length=0;
	}
	public void setBreath(int b) {
		if(b>=0)
		   breath=b;
		else
			breath=0;
	}
	public int area() {
		return length*breath;
	}
	public int parameter() {
		return 2*(length+breath);
	}
	public boolean isSquare() {
		if(length==breath)
			return true;
		else
			return false;
	}
}
public class DataHiding {

	public static void main(String[] args) {
		rectangle r=new rectangle();
		r.setLength(4);
		r.setBreath(4);
		System.out.println("area:"+r.area());
		System.out.println("is Square:"+r.isSquare());
	}

}
