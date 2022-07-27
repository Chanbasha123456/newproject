package Reversestring;

import java.util.Scanner;

public class Reverse5 {
	public static void main(String[] args)
	{
		String s;
		System.out.println("Enter a string");
	Scanner sc= new Scanner(System.in);
		s=sc.nextLine();
		System.out.println("Reverse String");
		for(int i= s.length();i>0;i--)
		{
			
			System.out.print(s.charAt(i-1));
		}
		
	}

}
