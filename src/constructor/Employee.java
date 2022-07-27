package constructor;

public class Employee {
	int empid;
	String empname;
	double salary;
	Employee()
	{
		empid=10;
		empname="chan";
		salary=10.00;
	}
	Employee(int empid, String empname, double salary)
	{
		this.empid = empid;
		this.empname=empname;
		this.salary=salary;
		
	}
	void display()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
	}

		public static void main(String[] args)
		{
			Employee emp= new Employee();//default constructor
			emp.display();
			System.out.println("---------------");
			Employee emp1 = new Employee(100, "chanbasha", 10.65);
			
			emp1.display();
			System.out.println("----------------------------");
			Employee emp2 = new Employee(101, "Munawar", 10.00);
			emp2.display();
			
		}
	
}
