package Static_Keyword;

public class staticEx2 {
	int sid;
	String sname;
	static String clgname="ABC";
	
	staticEx2()
	{
		sid =101;
		sname ="Munawar";
		
	}
	void show()
	{
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(clgname);
		Student2.clgname="IJK";
	}
	public static void main(String[] args) {
		
		staticEx2 S1= new staticEx2();
		S1.show();
		Student2.display();
		
		

	}

}
