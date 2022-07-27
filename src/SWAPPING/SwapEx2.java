package SWAPPING;

import java.util.Scanner;

public class SwapEx2 {

	public static void main(String[] args) {
		int x;
		int y;
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter X value");
		x= sc.nextInt();
		System.out.println("Enter Y value");
		y=sc.nextInt();
		int t = x;
		x=y;
		y=t;
		System.out.println("x value "+x);
		System.out.println("y value "+y);
		

	}

}
