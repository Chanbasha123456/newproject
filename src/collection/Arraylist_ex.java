package collection;

import java.util.ArrayList;

public class Arraylist_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayList<String> arr = new ArrayList<String>();
         arr.add("chan");
         arr.add("Mercy");
         arr.add("C#");
         System.out.println(arr.size());
         System.out.println(arr.get(1));
         for(int i=0; i<arr.size();i++)
         {
        	 System.out.println(arr.get(i));
         }
        /* for(String str:arr)
         {
        	 System.out.println(str);
         }*/
	}

}
