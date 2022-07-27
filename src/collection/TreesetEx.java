package collection;

import java.util.TreeSet;

public class TreesetEx {

	public static void main(String[] args) {
		TreeSet<String> hs = new TreeSet<String>();
		
		hs.add("Shafeera");
		hs.add("Shafeera");
		hs.add("Munawar");
		hs.add("Afifa");
		hs.add("HIFA");
		hs.add("Usmaan");
		for(String str:hs)
		{
			System.out.println(str);
		}
		

	}

}
