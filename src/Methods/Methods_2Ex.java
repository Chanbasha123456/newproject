package Methods;

public class Methods_2Ex {
	int x, y;
/*int sum(int a, int b)
{
	x=a;
	y=b;
	return x+y;
}*/
	int sum()
	{
	int a=20;
	int b=60;
		return a+b;
	}
int add(int m, int n)
{
	x=m;
	y=n;
	return m+n;
}

	public static void main(String[] args) {
		
		Methods_2Ex cal = new Methods_2Ex();
		int sum1 =cal.sum();
		System.out.println(sum1);
		System.out.println("-----------------------");
	    int sum2 = cal.add(10, 40);
	    System.out.println(sum2);
	
	}

}
