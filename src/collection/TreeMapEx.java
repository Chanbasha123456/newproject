package collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		TreeMap<Integer, String> hm = new TreeMap<Integer, String>();
		hm.put(101, "Shamshad");
		hm.put(104, "Shafeera");
		hm.put(103, "Jaffer");
	    hm.put(104, "Shafeera2");
	    hm.put(102, "Chanbasha");
	    hm.put(105, null);
	    
	    hm.put(106, null);
	    
		System.out.println(hm.get(103));
		for(Map.Entry<Integer, String> ent : hm.entrySet())
		{
			System.out.println(ent.getKey()+"    "+ent.getValue());
		}


	}

}
