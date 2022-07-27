package collection;

import java.util.ArrayList;

public class ArrayEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList arr = new ArrayList();
       arr.add("Shafeera");
       arr.add(10);
       arr.add('M');
       arr.add('U');
       arr.add(true);
       arr.add(56.23);
       for(Object obj:arr)
       {
    	   System.out.println(obj);
       }
       
	}

}
