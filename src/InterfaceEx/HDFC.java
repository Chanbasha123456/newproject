package InterfaceEx;

public class HDFC implements Bank{
	public double getRate()
	{
		return 10.22;
	}
	void show()
	{
		System.out.println(Bank.name);
	}
	public static void main(String[] args)
	{
		Bank b = new HDFC();
		System.out.println(b.getRate());
		
		//System.out.println(name);
	//	System.out.println(Bank.name="chan");
		
		
		
	}

}
