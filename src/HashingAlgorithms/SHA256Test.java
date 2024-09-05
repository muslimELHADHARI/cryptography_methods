package cryptography.hashingAlgorithms;

public class SHA256Test {

	public static void main(String[] args) {
	    String message="Hash me if you can";
	    System.out.println(SHA256.digest(message));
	}

}
