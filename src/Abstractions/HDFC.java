package Abstractions;

public class HDFC extends Bank {

	@Override
	double getRate() {
		return 10.0225;
		
		
	}
public static void main(String[] args) {
	Bank B = new HDFC();
	B.show();
	System.out.println(B.getRate());
	
}

}
