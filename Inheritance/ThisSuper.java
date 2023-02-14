package Inheritance;

class rectangle{
	int length;
	int width;
	int x=40;
	rectangle(){
		length= width=1;
	}
	rectangle(int l,int b){
		this.length=l;
		this.width=b;
	}
	
}
class cubid extends rectangle{
	int height;
	int x=20;
	cubid(){
		height=1;
	}
	cubid(int h){
		this.height=h;
	}
	cubid (int l,int b,int h){
		super(l,b);
		height=h;
		
		}
	void display()
    {
        System.out.println(super.x);
        System.out.println(x);
    }
	int volume() {
		return length*width*height;
	}
	
}


public class ThisSuper {

	public static void main(String[] args) {
		cubid c=new cubid(5,6,9);
		System.out.println(c.volume());
	}

}
