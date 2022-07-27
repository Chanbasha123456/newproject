package Polymorphism;

public class ICICI extends Method_overriding{
	String name ="ICICIBANK";
	 double getRate()
	{
		 System.out.println(super.getRate());
		return 25.25;
	}
	 void show2()
	 {
		 System.out.println("This is icici");
	 }
	 void display2()
	 {
		 System.out.println(name);
		 System.out.println(super.name);
		 super.display();
		 
		 
	 }
public static void main(String[] args)
{
	ICICI 	icici = new ICICI();
	icici.display2();
	
	//HDFC hdfc = new HDFC();
	/*Method_overriding bank = new ICICI();//parent reference child object
	bank.display();
	System.out.println( bank.getRate());
	Method_overriding bank2 = new Method_overriding();//parent reference parent object
	bank2.display();
	System.out.println( bank2.getRate());
	ICICI icici = new ICICI();//child reference child object
	icici.display();*/
	icici.show2();
	System.out.println(icici.getRate());
	
			
	

	//double ri= hdfc.getRate();
	//System.out.println(ro);
}
}
