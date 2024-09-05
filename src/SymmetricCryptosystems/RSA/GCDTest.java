package cryptography.symmetricCryptosystems.rsa;

import java.math.BigInteger;

public class GCDTest {

	public static void main(String[] args) {
		String cr="Test Test Test";
		RSA rsa=new RSA();
        rsa.generateKeys(2048);
        BigInteger cipher=rsa.encrypt(cr);
        System.out.println(cipher);
        System.out.println("--------------------------------");
        String plain=rsa.decrypt(cipher);
        System.out.println(plain);
	}
}
