package cryptography.assymmetricCryptosystems.ceaserCipher;

public class TestCeaser {

	public static void main(String[] args) {
		String text="TestMe";
		CeaserCypher cs=new CeaserCypher(text,27);
		System.out.println(cs.decrypt());
		CrackFreq cf=new CrackFreq(text);
		cf.crackCeaserFreq();
}

}
