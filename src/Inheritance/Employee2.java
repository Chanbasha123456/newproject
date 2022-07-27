package Inheritance;

public class Employee2 extends Employee {   //extends
	
	void testsalary()
	{
		
		
		int bonus=5000;
		
		System.out.println(salary+bonus);
		
	}
	
public static void main(String[] args)
{
	Employee2 emp = new Employee2();
	emp.basesalary();
	emp.testsalary();
	System.out.println(Employee.x);
			} 
	
}
