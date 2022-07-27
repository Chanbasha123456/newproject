package collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetHashEx {

	public static void main(String[] args) {
	
		HashSet<String> hs = new HashSet<String>();
		hs.add(null);
		hs.add("Shafeera");
		hs.add("Shafeera");
		hs.add("Munawar");
		hs.add("Afifa");
		hs.add("HIFA");
		hs.add("Usmaan");
		System.out.println(hs.size());
		/*for(String str:hs)
		{
			System.out.println(str);
		}*/
		Iterator<String> it =  hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
