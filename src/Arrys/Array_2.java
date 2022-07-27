package Arrys;

public class Array_2 {

	public static void main(String[] args) {
		int[][] a = new int[2][2];
		a[0][0]=10;
		a[0][1]=20;
		a[1][0]=30;
		a[1][1]=40;
//System.out.println(a[1][1]);
	/*	for(int i =0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();*/
	//	}
		/*int i=0; int j=0;
		while(i<=1)
		{
			i++;
			while(j<=1)
			{
				
				System.out.println(a[i][j]);
				j++;
			}
		}*/
for(int[] i:a)
{
	for(int j:i)
		System.out.print(j+"  ");
	{

	}
	System.out.println();

}
}
}
