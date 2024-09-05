package cryptography.assymmetricCryptosystems.oneTimePad;

public class Test {

	public static void main(String[] args) {
OtpCypher cp=new OtpCypher();
String message="Test Test Test";
System.out.println("The plain Text to encrypt is:"+"'"+message+"'");
System.out.println("The Encrypted message using the random sequence is:");
String c=cp.encryptOtp(message);
for(int i=0;i<c.length();i++) {
	System.out.printf(c.charAt(i)+"\t");
}
System.out.println();
System.out.println("The final result is:");
System.out.println(c);
//System.out.println(cp.decryptOtp("ZX/yèML)OGQH"));
	}
}
