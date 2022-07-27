package InterfaceEx3;

public class Test  implements HDFC{

	
	
	@Override
	public double getRate() {
		// TODO Auto-generated method stub
		return 10.02323;
	}
	
	@Override
	public int getint() {
		// TODO Auto-generated method stub
		return 100;
	}
	
	public static void main(String[] args)
	{
		Test t1 = new Test();
	System.out.println(t1.getint());
	System.out.println(t1.getRate());
	
	System.out.println(name);
	
	System.out.println("-------------");
	HDFC hdfc = new Test();
	System.out.println(hdfc.getint());
	System.out.println(hdfc.getRate());
	
	
	}
}
