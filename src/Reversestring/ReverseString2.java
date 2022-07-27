package Reversestring;

public class ReverseString2 {

	public static void main(String[] args) {
		String str ="Chan";
		char[] res=str.toCharArray();
		//System.out.println(res);
		for (int i=res.length;i>0;i--)
		{
			System.out.print(res[i-1]);
		}

	}

}
