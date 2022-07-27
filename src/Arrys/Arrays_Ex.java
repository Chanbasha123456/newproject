package Arrys;

public class Arrays_Ex {

	public static void main(String[] args) {
    int[] a = new int[5];
    a[0]=10;
    a[1]=36;
    a[2]=45;
    a[3]=50;  
    a[4]=62;
    //int len=a.length;
   // System.out.println(len);
   // System.out.println(a[2]);
    /*for(int i=0; i<=4;i++)
    {
    	
    System.out.println(a[i]);
    
	}*/
   /*int i = 0;
    while(i<len)
    {
    	System.out.println(a[i]);
    	i++;
    }*/
    for(int i:a)
    {
    	System.out.println(i);
    }

}
}
