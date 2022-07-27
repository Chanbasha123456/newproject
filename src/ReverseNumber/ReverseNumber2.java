package ReverseNumber;

import java.util.Scanner;

public class ReverseNumber2 {

	public static void main(String[] args) {
	int num =0;
	int rev=0;
	System.out.println("ENTER THE NUMBER");
	Scanner sc = new Scanner(System.in);
	num=sc.nextInt();
	for(;num!=0;num=num/10)
	{
		int rem= num%10;
		rev=rev*10+rem;
		
	}
	
System.out.println("Reverse Number"+rev);
	}

}
