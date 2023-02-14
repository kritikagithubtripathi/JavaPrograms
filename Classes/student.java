package Classes;

class studentTest{
	int rollNo;
	String name;
	int m1,m2,m3;
	String course;

	public double total() {
		return m1+m2+m3;
	}
	public double avg() {
		return total()/3;
	}
	public char grade() {
		if(avg()>60) {
			return 'A';
		}
		else
			return 'B';
	}
	public String Details() {
		return "rollNo:"+rollNo+"\n"+"Student:"+name+"\n"+"course:"+course+"\n";
	}
	
}
public class student {

	public static void main(String[] args) {
		studentTest S=new studentTest();
		S.name="Ram";
		S.rollNo=32;
		S.course="AI & machine Learning";
		S.m1=55;
		S.m2=70;
		S.m3=90;
		System.out.println("student details:"+S.Details());
		System.out.println("total:"+S.total());
		System.out.println("avg:"+S.avg());
		System.out.println("grade:"+S.grade());

	}

}
