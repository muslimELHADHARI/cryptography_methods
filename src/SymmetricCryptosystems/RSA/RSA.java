package cryptography.symmetricCryptosystems.rsa;

import java.math.BigInteger;
import java.security.SecureRandom;

public class RSA {
	private BigInteger e ; //Public Key
	private BigInteger d ; //Private Key
	private BigInteger n ; //TrapDoor
    private SecureRandom random ;
    public RSA() {
    this.random=new SecureRandom(); 
    }
    public void generateKeys(int length) {
    BigInteger p=BigInteger.probablePrime(length, random);
    BigInteger q=BigInteger.probablePrime(length, random);
    BigInteger n=p.multiply(q);
    BigInteger euler=(p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));
    BigInteger e=generatePublicFactor(euler);
    BigInteger d=e.modInverse(euler);
    this.e=e;
    this.d=d;
    this.n=n;
    }
    private BigInteger generatePublicFactor(BigInteger euler) {
		BigInteger e=new BigInteger(euler.bitLength(),random);
		while(!e.gcd(euler).equals(BigInteger.ONE)){
			e=new BigInteger(euler.bitLength(),random);
		}
		return e;
	}
	public BigInteger encrypt(String plainText) {
    	
    return encryptor(e,n,plainText);
    }
    private BigInteger encryptor(BigInteger e, BigInteger n, String plainText) {
		byte[] data=plainText.getBytes();
		BigInteger messageInt=new BigInteger(data);
		return messageInt.modPow(e,n);
	}
	public String decrypt(BigInteger cipherText) {
    	
    return decryptor(d,n,cipherText);
    } 
	private String decryptor(BigInteger d, BigInteger n, BigInteger cipherText) {
		BigInteger plainData=cipherText.modPow(d,n);
		return new String(plainData.toByteArray());
	}
}
