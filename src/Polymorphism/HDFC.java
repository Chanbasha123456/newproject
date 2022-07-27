package Polymorphism;

public class HDFC extends Method_overriding {
	double getRate()
	{
		System.out.println(super.getRate());
		return 10.25;
	}
	void show()
	{
		System.out.println(super.name);
		System.out.println("This is HDFC");
		//super.display();
		
	}


public static void main(String[] args)
{
	HDFC hdfc = new HDFC();
	System.out.println(hdfc.getRate());
	hdfc.display();
	hdfc.show();
	/*Method_overriding bank = new HDFC();
	System.out.println(bank.getRate());
	bank.display();*/
}
}
