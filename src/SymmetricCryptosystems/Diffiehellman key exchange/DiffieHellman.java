package cryptography.symmetricCryptosystems.diffiehellman;

import java.math.BigInteger;
import java.util.Random;

public class DiffieHellman {
private Random random;
public DiffieHellman() {
	random=new Random();
}
public void generateKeys(BigInteger n,BigInteger g){
	int rand1=random.nextInt(n.intValue()-2)+1;
	//A private key//
	BigInteger x=new BigInteger(Integer.toString(rand1));
	//B private key//
	int rand2=random.nextInt(n.intValue()-2)+1;
	BigInteger y=new BigInteger(Integer.toString(rand2));
	//A calculate key and send it to B//
	BigInteger k1=g.modPow(x, n);
	//B calculate key and send it to A//
	BigInteger k2=g.modPow(y,n);
	//A calcualate the final shared private key using B key//
	BigInteger key1=k2.modPow(x,n);
	//B calcualate the final shared private key using A key//
	BigInteger key2=k1.modPow(y,n);
	//**********//
	System.out.println("A private key is:"+key1.intValue());
	System.out.println("B private key is:"+key2.intValue());

}
}
