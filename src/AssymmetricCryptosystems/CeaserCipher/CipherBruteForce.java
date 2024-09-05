package cryptography.assymmetricCryptosystems.ceaserCipher;

public class CypherBruteForce {
	private String alph=CeaserCypher.alphabets();
	private String message="";
	private LanguageDetector ld;
	public CypherBruteForce(String msg) {
		message=msg;
		ld=new LanguageDetector();
	}
	private String decrypt(int key){
		String test="";
		int index;
		for(int i=0;i<message.length();i++) {
			index=alph.indexOf(message.charAt(i));
			index=Math.floorMod(index-key, alph.length());
			test+=alph.charAt(index);
			}
		return test ;

	}
	public void crackCeaser() {
		for(int i=0;i<CeaserCypher.alphabets().length();i++) {
			System.out.println("with key:"+i+" the result got is:"+decrypt(i));
		}
		for(int j=0;j<CeaserCypher.alphabets().length();j++) {
			if(ld.isEnglish(decrypt(j))) {
			System.out.println("Using the english language detector the hidden messgae is:"+decrypt(j));
			System.out.println("The key is:"+j);
			break;
			}
		}
	}
	}
