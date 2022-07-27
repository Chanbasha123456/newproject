package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashmapEx {

	public static void main(String[] args) {
	HashMap<Integer, String> hm = new HashMap<Integer, String>();
	hm.put(101, "Shamshad");
	hm.put(102, "Chanbasha");
	hm.put(103, "Jaffer");
	hm.put(104, "Shafeera");
    hm.put(104, "Shafeera2");
    hm.put(null, null);
    hm.put(null, null);
	System.out.println(hm.get(103));
	/*Iterator<String> it = hm.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}*/
	for(Map.Entry<Integer, String> ent : hm.entrySet())
	{
		System.out.println(ent.getKey()+"    "+ent.getValue());
	}
	}

}
