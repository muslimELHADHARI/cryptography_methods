package cryptography.assymmetricCryptosystems.des;
public class TestDES {

	public static void main(String[] args) {
		DES ds=new DES();
		String plainText="Test for DES algorithm";
		System.out.println("-----------------------------------------");
		System.out.println("The encrypted message is:");
		String cipherText=ds.encrypt(plainText);
		System.out.println(cipherText);
		System.out.println("-----------------------------------------");
		System.out.println("The decrypted message is:");
		System.out.println(ds.decrypt(cipherText));
		System.out.println("-----------------------------------------");
	}

}
