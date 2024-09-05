package cryptography.assymmetricCryptosystems.ceaserCipher;
public class CeaserCypher {
	private String message="";
	private String plain_text="";
	private String cypher_text="";
	private int key;
	private int index;
	private static final String alphabets=" ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz&é'(-è_çà)=0123456789+-*/";
	public CeaserCypher(String pt,int k) {
		message=pt;
		if(k<0 || k>alphabets.length()) {
		   System.out.println("Error,key out of range !!!");
		}
		else {
		key=k;
		}
	}
	public static String alphabets() {
		return alphabets;
	}
	public String encrypt() {
		for(int i=0;i<message.length();i++) {
			index=alphabets.indexOf(message.charAt(i));
			index=(index+key) % alphabets.length();
			cypher_text+=alphabets.charAt(index);
		}
		return cypher_text;
	}
	public String decrypt(){
		for(int i=0;i<message.length();i++) {
			index=alphabets.indexOf(message.charAt(i));
			index=Math.floorMod(index-key, alphabets.length());
			plain_text+=alphabets.charAt(index);
			}
		return plain_text;

	}
	
	}
