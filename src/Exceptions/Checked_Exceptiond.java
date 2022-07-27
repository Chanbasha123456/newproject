package Exceptions;

public class Checked_Exceptiond {
	static void m1() throws InterruptedException
	{
		Thread.sleep(1000);
	}

	public static void main(String[] args)  {
		System.out.println("Program start");
		try
		{
			m1();	
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("PROGRAM END");

	}

}
