package Typesofinheritances;

public class Software  extends person2{

void display2()
{
	System.out.println(id);
	System.out.println(name);
}
public static void main(String[] args)
{
	Software soft = new Software();
	soft.display();
	soft.display2();
	System.out.println("----------------------------");
	Doctor doc = new Doctor();
	doc.display();
	doc.display3();
}
}
