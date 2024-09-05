package cryptography.assymmetricCryptosystems.ceaserCipher;

import java.util.List;

public class LanguageDetector {
	private FileProcessor File;
	private List<String> wordlist;
public LanguageDetector() {
	File=new FileProcessor();
	wordlist=File.getWords();
}
private int countMatches(String s) {
	int n=0;
	String[] words=s.split(" ");
	for(String w:words) {
		if(wordlist.contains(w)) {
			n++;
		}
	}
	return n;
	
}
public boolean isEnglish(String s) {
	int numEnglish=countMatches(s); 
	if(numEnglish>s.split(" ").length/2) {
		return true;
	}
	return false;
}
}
