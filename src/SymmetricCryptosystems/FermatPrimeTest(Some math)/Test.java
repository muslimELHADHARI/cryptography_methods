package cryptography.symmetricCryptosystems.fermatPrimeTest;

import java.math.BigInteger;

public class Test {

	public static void main(String[] args) {
		FermatPrimeTest fpt=new FermatPrimeTest();
		System.out.println(fpt.isPrime(BigInteger.valueOf(466545648),100));
	}

}
