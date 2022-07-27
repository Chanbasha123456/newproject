package Polymorphism;

public class Method_Overloading {

	void sum(int a , int b)
	{
		System.out.println(a+b);
	}
	void sum(double x , int y)
	{
		System.out.println(x+y);
	}
	public static void main(String[] args)
	
	{
		Method_Overloading cal = new Method_Overloading();
		cal.sum(10, 20);
		cal.sum(1.52, 20);
	}
}
