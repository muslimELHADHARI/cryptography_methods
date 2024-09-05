package cryptography.assymmetricCryptosystems.des;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
public class DES {
	private SecretKey secretKey;
	private SecureRandom random;
	private Cipher encryptCipher;
	private Cipher decryptCipher;
	private IvParameterSpec ivParams;
	public DES() { 
		try {
			secretKey=KeyGenerator.getInstance("DES").generateKey();
            random=new SecureRandom();	
            encryptCipher=Cipher.getInstance("DES/CBC/PKCS5Padding");
            decryptCipher=Cipher.getInstance("DES/CBC/PKCS5Padding");
            byte[] initializeVec=new byte[encryptCipher.getBlockSize()];
            random.nextBytes(initializeVec);
            ivParams=new IvParameterSpec(initializeVec);
            encryptCipher.init(Cipher.ENCRYPT_MODE,secretKey,ivParams);
            decryptCipher.init(Cipher.DECRYPT_MODE,secretKey,ivParams);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		} catch (InvalidAlgorithmParameterException e) {
			e.printStackTrace();
		}
}
public String encrypt(String plainText) {
	byte[] bytes=plainText.getBytes();
	byte[] cipherText=null;
	try {
		cipherText=encryptCipher.doFinal(bytes);
	} catch (IllegalBlockSizeException e) {
		e.printStackTrace();
	} catch (BadPaddingException e) {
		e.printStackTrace();
	}
	return Base64.getEncoder().encodeToString(cipherText);
}
public String decrypt(String CipherText) {
	byte[] plainText=null;
	try {
		plainText=decryptCipher.doFinal(Base64.getDecoder().decode(CipherText.getBytes()));
		return new String(plainText);
	} catch (IllegalBlockSizeException e) {
		e.printStackTrace();
	} catch (BadPaddingException e) {
		e.printStackTrace();
	}
	return null;
}
}
