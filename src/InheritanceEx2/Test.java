package InheritanceEx2;

public class Test implements IntA, IntB{
	public void show()
	{
		System.out.println("This is from Int A");
		
	}
	public void display()
	{
		System.out.println("This is from Int B");
	}

	public static void main(String[] args) {
		Test t1 = new Test();
		t1.display();
		t1.show();

	}

}
