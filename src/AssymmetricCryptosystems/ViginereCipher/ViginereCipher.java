package cryptography.assymmetricCryptosystems.viginereCipher;

public class ViginereCypher {
	private static final String alphabets="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz&é'(-è_çà)=0123456789+-*/";
public String encrypt(String pt,String key) {
	
	String cypher="";
	int Keyind=0;
	int index; 
	char c; 
	for(int i=0;i<pt.length();i++) {
		c=pt.charAt(i);
		index=Math.floorMod(alphabets.indexOf(c)+alphabets.indexOf(key.charAt(Keyind)),alphabets.length());
		Keyind++;
		Keyind=Keyind % key.length();
		cypher+=alphabets.charAt(index);
	} 
	return cypher;}
	public String decrypt(String pt,String key) {
		String plain="";
		int Keyind=0;
		int index;
		char c;
		for(int i=0;i<pt.length();i++) {
			c=pt.charAt(i);
			index=Math.floorMod(alphabets.indexOf(c)-alphabets.indexOf(key.charAt(Keyind)),alphabets.length());
			Keyind++;
			Keyind=Keyind % key.length();
			plain+=alphabets.charAt(index);
		}
		return plain;
} 
}
