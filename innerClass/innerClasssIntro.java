package innerClass;

class outer{
	int x=10;
	class inner{
		int y=5;
		public void innerDisplay() {
			System.out.println(x+" "+y);
		}
	}
	public void OutterDisplay() {
		inner i=new inner();
		i.innerDisplay();
	
	}
}

public class innerClasssIntro {

	public static void main(String[] args) {
		outer o=new outer();
		o.OutterDisplay();
	}

}
