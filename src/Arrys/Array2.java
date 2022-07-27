package Arrys;

public class Array2 {
	static String str="Chanbasha";
	void show()
	{
		System.out.println("Print all values");
		System.out.println(str);
	}
	static void display()
	{
		int[] a = new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		for(int i:a)
	    {
	    	System.out.println(i);
	    }
		 

	}
	

	public static void main(String[] args) {
		
	Array2  a = new Array2();
	a.show();
		display();
	}

}
