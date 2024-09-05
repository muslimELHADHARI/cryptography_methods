package cryptography.assymmetricCryptosystems.aes;

public class TestAES { 

	public static void main(String[] args) {
AES aes=new AES();
String text="AAAAAAAEEEKK";
System.out.println(aes.encrypt(text));
System.out.println(aes.decrypt(aes.encrypt(text)));
System.out.println("------------------------------------------------");
String text1="AAAAAAEEEEKOPKP";
System.out.println(aes.encrypt(text1));
System.out.println(aes.decrypt(aes.encrypt(text1)));
	}

}
