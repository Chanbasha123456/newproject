package Typesofinheritances;

public class Doctor extends person2{

	void display3()
	{
		System.out.println(id);
		System.out.println(name);
	}
	public static void main(String[] args)
	{
		Doctor doc = new Doctor();
		doc.display();
		doc.display3();
		System.out.println("-_____________________");
		Software soft = new Software();
		soft.display();
		soft.display2();
		
	}
}
