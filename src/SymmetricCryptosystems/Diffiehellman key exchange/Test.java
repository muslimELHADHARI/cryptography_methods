package cryptography.symmetricCryptosystems.diffiehellman;

import java.math.BigInteger;

public class Test {

	public static void main(String[] args) {
BigInteger n=new BigInteger(Integer.toString(37));
BigInteger g=new BigInteger(Integer.toString(13));
DiffieHellman algorithm=new DiffieHellman();
algorithm.generateKeys(n, g);
	} 
}
