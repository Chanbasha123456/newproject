package Typesofinheritances;

public class MathsTeacher extends Teacher {//multi level inheritance

void display3()
{
	System.out.println(id);
	System.out.println(name);
}
public static void main(String[] args)
{
	MathsTeacher teach = new MathsTeacher();
	teach.display();
	teach.display2();
	teach.display3();
	System.out.println("----------------------------------------");
	Teacher teach2 = new Teacher();
	teach2.display();
	teach2.display2();
	System.out.println("____________________________________________________");
person p = new person();
p.display();

}
}
