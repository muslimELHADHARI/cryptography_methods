package cryptography.hashingAlgorithms;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {
private static MessageDigest msgDigest=null;
private static byte[]  msgDigestByte=null;
private static StringBuilder  hashResult=null;
public static String digest(String message) {
	try {
		msgDigest=MessageDigest.getInstance("MD5");
	    msgDigestByte=msgDigest.digest(message.getBytes());
	    hashResult=new StringBuilder(new BigInteger(1,msgDigestByte).toString(16));
	    while(hashResult.length()<32){
	    hashResult.insert(0,"0");
	    }
	} catch (NoSuchAlgorithmException e) {
		e.printStackTrace();
	}
	return hashResult.toString();
}
}
