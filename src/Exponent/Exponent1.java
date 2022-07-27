package Exponent;

public class Exponent1 {

	public static void main(String[] args) {
		int base=2;
		int exp=4;
		int temp= base;
		for(int i=1; i<exp;i++)
		{
			temp = temp*base;
		}
		System.out.println(temp);
	}

}
