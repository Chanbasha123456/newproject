package Exponent;

import java.util.Scanner;

public class Exponent2 {

	public static void main(String[] args) {
		int base;
		int exp;
		System.out.println("Enter Base Value");
		Scanner sc  = new Scanner(System.in);
		base=sc.nextInt();
		System.out.println("Enter Exponent Value");
		exp=sc.nextInt();
		int temp=base;
		for(int i=1; i<exp;i++)
		{
			temp = temp*base;
		}
		System.out.println("Result"+temp);

	}

}
