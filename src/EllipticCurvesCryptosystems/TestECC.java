package cryptography.ellipticCurvesCryptosystems;

import java.util.Random;

public class TestECC {

	public static void main(String[] args) {
		ECC ecc=new ECC(3,7);
		Point generator =new Point(-2,1);
		Random random=new Random();
		//EC Diffie Hellman//
		int a=random.nextInt(10000);
		int b=random.nextInt(10000);
		//Public Keys//
		Point alicePK=ecc.doubleAndAdd(a,generator);
		Point bobPK=ecc.doubleAndAdd(b,generator);
		//Private Keys//
		Point alicePVK=ecc.doubleAndAdd(a,bobPK);
		Point bobPVK=ecc.doubleAndAdd(b,alicePK);
		System.out.println(alicePVK);
		System.out.println(bobPVK);
	}

}
