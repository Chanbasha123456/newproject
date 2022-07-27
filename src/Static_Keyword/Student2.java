package Static_Keyword;

public class Student2 {
	int sid;
	String sname;
	static String clgname="abc";
	//static int a=25;
	
	Student2(int sid, String sname)
	{
		this.sid=sid;
		this.sname=sname;
		
	}
	void show()
	{
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(clgname);
		display();
	}
	
		static void display()
		{
		System.out.println(clgname);	
		}
	
	public static void main(String[] args) {
		
		Student2 S1= new Student2(101, "Munawar");
		Student2.clgname="xyz";
		S1.show();
		System.out.println("---------------------");
		Student2 s2 = new Student2(102,"Usmaan");
		Student2.clgname="lmn";
		s2.show();
		System.out.println("-------------------------");
		Student2 s3 = new Student2(103,"Afifa");
		Student2.clgname="klm";
		s3.show();
		System.out.println("-----------------------");
		Student2 s4 = new Student2(103,"Hifa");
		Student2.clgname="IJK";
		s4.show();
		display();
		

	}


	

}
