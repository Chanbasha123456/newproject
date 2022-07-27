package Exceptions;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		System.out.println("program start");
		try
		{
			int[] arr = new int[3];
			arr[0]=1;
			arr[1]=2;
			arr[2]=3;
			arr[3]=40; //ArrayIndexout of bound exception
		}
		
			
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		finally
		{
			System.out.println("Finally Block");
		}
		
		
		
		System.out.println("program end");
		
	}

}
