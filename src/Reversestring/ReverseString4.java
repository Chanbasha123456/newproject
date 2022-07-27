package Reversestring;

import java.util.Scanner;

public class ReverseString4 {

	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		s= sc.nextLine();
		
		StringBuffer sbr = new StringBuffer(s);
		sbr.reverse();
		System.out.println("Reverse String"+"     "    +sbr);
		/*System.out.println("After reverse string");
		for(int  i=s.length();i>0;i--)
		{
			System.out.print(s.charAt(i-1));
		}*/
		
		

	}

}
