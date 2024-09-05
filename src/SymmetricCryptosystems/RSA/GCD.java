package cryptography.symmetricCryptosystems.rsa;

public class GCD {
	public static int gcd_calculator(int a,int b) {
		if(a % b ==0) {
			return b;
		}
		return gcd_calculator(b,a % b);
		
	}
}
