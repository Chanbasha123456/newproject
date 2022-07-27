package Static_Keyword;

public class student {
	int sid;
	String name;
	static String collegename ="ACB";
	student(int id , String sname)
	{
		sid =id;
		name = sname;
		
	}
	void show()
	{
		System.out.println(sid);
		System.out.println(name);
		System.out.println(collegename);
		display();
		sum();
	}
	static void display()
	{
		System.out.println(collegename);
	}
	void sum()
	{
		
	}
public static void main(String[] args)
{
	student s1= new student(101, "Munawar");
	student.collegename="xyz";
		s1.show();
		//Student2.display();
		System.out.println(Student2.clgname="chan");
		
		//

	System.out.println("-----------------------");
	/*student s2= new student(102, "Usmaan");
	//student.collegename ="VXY";
	s2.show();*/
	
	/*System.out.println(collegename);//staticvariable
	display();//staticmethod*/
}
}
