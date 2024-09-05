package cryptography.assymmetricCryptosystems.ceaserCipher;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
public class FileProcessor {
private List<String> words;
public FileProcessor() {
	words=new ArrayList<>();
	getData();
}
private void getData() {
	try {
		FileReader file=new FileReader(new File("/home/muslim/eclipse-workspace/Final/Source Folder/Cryptography/CeaserCypher/wordlist.txt"));
		BufferedReader mybuffer=new BufferedReader(file);
		String line="";
		while((line=mybuffer.readLine())!=null) {
			words.add(line);
		}
	} 
	catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	catch(IOException eo) {
		eo.printStackTrace();

	}
}
public List<String> getWords(){
	return words;
}
}
