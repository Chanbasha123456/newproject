package Final_Keyword;

public class Test1 extends Final_Ex1 {
	@Override
	void show() {
		x=30;
		System.out.println(x);
	}

	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		t1.show();
	}

}
