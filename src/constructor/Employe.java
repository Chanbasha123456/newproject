package constructor;

public class Employe {
	int empid;
	String empname;
	double salary;
	Employe()
	{
		empid =10;
		empname="Mercy";
		salary=10.256;
	}
	void display()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
	}

		public static void main(String[] args)
		{
			Employe emp= new Employe();//default constructor
			emp.display();
		}
	
}
