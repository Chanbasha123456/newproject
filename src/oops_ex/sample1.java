package oops_ex;

public class sample1 {

	int empid;
	String empname;
	double salary;
	/*sample1(int id,String name,double sal)
	{
		empid=id;
		empname=name;
		salary=sal;
	}*/
	void initialize(int id,String name,double sal)
	{
		empid=id;
		empname=name;
		salary=sal;
	}

	void display()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);

		
	}
	public static void main(String[] args)
			{
		/*sample1 emp= new sample1();
		emp.empid=1;
		emp.empname="Shafeera";
		emp.salary=102.65;
		emp.display();
		
		System.out.println("_______________________________________");
		sample1 emp2= new sample1();
		emp2.empid=2;
		emp2.empname="Mercy";
		emp2.salary=102.65;
		emp2.display();*/
		
		/*sample1 emp1 = new sample1(101, "chan", 104.65);
		emp1.display();
		System.out.println("_______________");
		sample1 emp2 = new sample1(102, "Mercy",105.65);
		emp2.display();*/
		
		sample1 emp1 = new sample1();
		emp1.initialize(101, "chan", 105.56);
		emp1.display();
		
		
				
			}
	}


