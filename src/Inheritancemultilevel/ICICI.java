package Inheritancemultilevel;

public class ICICI extends Sbi {
	double getrate()
	{
		return 10.2666;
	}
	void show2()
	{
		System.out.println("This is child class of sbi");
	}

	public static void main(String[] args) {
		
		ICICI icici = new ICICI();
		System.out.println(icici.getrate());
		icici.display();
		icici.show();
		icici.show2();
		System.out.println(icici.str);
		/*Sbi sbi = new Sbi();
		sbi.display();
		System.out.println(sbi.str);
		sbi.show();
		System.out.println(sbi.getrate());*/
		
		

	}

}
