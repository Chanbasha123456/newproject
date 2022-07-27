package ReverseNumber;

import java.util.Scanner;

public class ReverseNumber4 {
	public static void reverseNumber(int  n)
	{
		if(n<10)
		{
			System.out.println(n);
			return;
		}
		else
		{
			System.out.print(n%10);
			reverseNumber(n/10);
		}
	}

	public static void main(String[] args) {
	
		
		System.out.println("ENTER THE NUMBER");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		System.out.print("The reverse number");
		reverseNumber(num);
	}

}
