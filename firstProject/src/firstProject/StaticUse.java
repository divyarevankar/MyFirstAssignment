package firstProject;

public class StaticUse {

	int roll_no;
	String name;
	static String college="JNNCE";
	/*static void change() {
		college="JNNCE";
	}*/
	StaticUse(int n, String r) {
		roll_no=n;
		name=r;
	}
	void display() {
		System.out.println(roll_no+" "+name+" "+college);
	}
	
	public static void main(String[] args) {
		
		//StaticUse.change();
		StaticUse s1=new StaticUse(1,"aaa");
		StaticUse s2=new StaticUse(2,"bbb");
		StaticUse s3=new StaticUse(3,"ddd");
		s1.display();
		s2.display();
		s3.display();
		
	}
	@Override
	public String toString() {
		return "StaticUse [roll_no=" + roll_no + ", name=" + name + "]";
	}

}
