package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsetEx {

	public static void main(String[] args) {
		LinkedHashSet<String> setex = new LinkedHashSet<String>();
		setex.add("Afifa");
		setex.add("Munawar");
		setex.add("Usmaan");
		setex.add("Hifa");
		setex.add("Afifa");
		setex.add("Mercy");
		Iterator<String> it = setex.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
