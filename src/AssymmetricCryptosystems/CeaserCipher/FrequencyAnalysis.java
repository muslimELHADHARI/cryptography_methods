package cryptography.assymmetricCryptosystems.ceaserCipher;
import java.util.Map;
import java.util.HashMap;
public class FrequencyAnalysis {
private String alphabets="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz&é'(-è_çà)=0123456789+-*/";
public Map<Character,Integer> run(String text){
	Map<Character,Integer> frequencies=new HashMap<>();
	for(int i=0;i<alphabets.length();i++) {
		frequencies.put(alphabets.charAt(i),0);
	}
	char c;
	for(int i=0;i<text.length();i++) {
		c=text.charAt(i);
		if(alphabets.indexOf(c) != -1) {
			frequencies.put(c, frequencies.get(c)+1);
		}
	}
	return frequencies;
}
public void showFrequencies(String text) {
Map<Character,Integer> frequencies=run(text); 
for(Map.Entry<Character,Integer> entry:frequencies.entrySet()) {
	System.out.printf("Character %s has frequency of : %s \n",entry.getKey(),entry.getValue());
}
}
}
