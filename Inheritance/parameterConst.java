package Inheritance;

class rectangle{
	int length;
	int width;
	rectangle(){
		length=width=1;
	}
	rectangle(int l,int b){
		this.length=l;
	this.width=b;
	}
	
}
class cubid extends rectangle{
	int height;
	cubid(){
		height=1;
	}
	cubid(int h){
		this.height=h;
	}
	cubid(int l,int b,int h){
		super(l,b);
		height=h;
	}
	int volume() {
		return length*width*height;
	}
}
public class parameterConst {

	public static void main(String[] args) {
		cubid c=new cubid(2,3,4);
		System.out.println("volume:"+c.volume());
	}

}
