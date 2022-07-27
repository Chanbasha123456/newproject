package Exceptions;

public class Unchecked_Exceptions {

	public static void main(String[] args) {
System.out.println("Program start");
//int n=10/0; //Arithmetic Exception
/*int[] arr = new int[3];
arr[0]=1;
arr[1]=2;
arr[2]=3;
//arr[3]=40;*///ArrayIndexout of Bound Exception

/*String str = "Chan";
//String str = null;// Null pointer Exception
System.out.println(str.length());*/
String str = "12345";
int n = Integer.parseInt(str);
System.out.println(n);
System.out.println("-------------------------");
String str1 = "12345abc";//number format exceptions
int a = Integer.parseInt(str1);
System.out.println(a);
System.out.println("Program End");
	}

}
