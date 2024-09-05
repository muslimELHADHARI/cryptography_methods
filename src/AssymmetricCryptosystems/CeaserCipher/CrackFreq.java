package cryptography.assymmetricCryptosystems.ceaserCipher;
import java.util.Map;
public class CrackFreq {
	private String alphabets="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz&é'(-è_çà)=0123456789+-*/";
	private Map<Character,Integer> frequencies;
	private String text;
	public CrackFreq(String text) {
		this.text=text;	}
	public void crackCeaserFreq() {
		FrequencyAnalysis fq=new FrequencyAnalysis();
		frequencies=fq.run(text);
		Map.Entry<Character,Integer> max=null;
		for(Map.Entry<Character,Integer> entry :frequencies.entrySet()) {
			if(max==null || entry.getValue().compareTo(max.getValue())>0) {
				max=entry;
			}
		}
		char LetterMax=max.getKey();
		System.out.println(LetterMax);
		int approxKey=alphabets.indexOf(LetterMax)-alphabets.indexOf('e');
		approxKey=Math.abs(approxKey);
		System.out.println("The key maybe is:"+approxKey);
	}
}
