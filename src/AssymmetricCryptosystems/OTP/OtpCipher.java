package cryptography.assymmetricCryptosystems.oneTimePad;

import cryptography.assymmetricCryptosystems.ceaserCipher.CeaserCypher;

public class OtpCypher {
	private int[] rand;
public String encryptOtp(String plainText) {
	rand=new GenerateRandom().getRandoms(plainText.length());
	String alphabets=CeaserCypher.alphabets();
	String cypherText="";
	char c;
	int index; 
	for(int i=0;i<plainText.length();i++) {
		c=plainText.charAt(i);
		index=alphabets.indexOf(c);
		index=Math.floorMod(index+rand[i],alphabets.length());
		cypherText+=alphabets.charAt(index);
	}
	for(int i:rand) {
		System.out.printf(i+"\t");
	}
	System.out.println();
	return cypherText;
}
}