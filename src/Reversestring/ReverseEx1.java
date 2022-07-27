package Reversestring;

public class ReverseEx1 {

	public static void main(String[] args) {
		String str="Chan";
		
		for(int i = str.length(); i>0;i--)
		{
			System.out.print(str.charAt(i-1));
		}
		
	}

}
