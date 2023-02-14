package Methods;

public class methodOverloadAera {
	static float area(float length,float breadth) {
		return length*breadth;
	}
	static float area(float radious) {
		return (float) (Math.PI*radious*radious);
	}

	public static void main(String[] args) {
		float a=3.2f,b=4.56f;
		float r=4.55f;
		System.out.println("area of reatangle :"+area(a,b));
		System.out.println("area of circle :"+area(r));
	}

}
