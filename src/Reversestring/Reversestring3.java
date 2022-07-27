package Reversestring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Reversestring3 {

	public static void main(String[] args) {
		String s;
		//String str ="Chan";
		System.out.println("Enterstring");
		Scanner sc = new Scanner(System.in);
		s=sc.nextLine();
		
		char[] str1 = s.toCharArray();
		
		List<Character> res = new ArrayList<Character>();
		for(char c :str1)
		{
			res.add(c);
		}
//Collections.reverse(res);
int size= res.size();
/*Iterator<Character> li =res.iterator();
while(li.hasNext())
{
	
	System.out.print(li.next());
}*/
for(int i=size;i>0;i--)
{
	System.out.print(res.get(i-1));
}
	}

}
