package cryptography.assymmetricCryptosystems.oneTimePad;

import java.util.Random;

import cryptography.assymmetricCryptosystems.ceaserCipher.CeaserCypher;
public class GenerateRandom {
private String alphabets=CeaserCypher.alphabets();
private Random myrandom;
public GenerateRandom(){
	myrandom=new Random();
}
public int[] getRandoms(int n) {
	int[] array=new int[n];
	for(int i=0;i<n;i++) {
		array[i]=myrandom.nextInt(alphabets.length());
	}
	return array;
}
}
