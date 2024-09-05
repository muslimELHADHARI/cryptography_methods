package cryptography.hashingAlgorithms;

public class MD5Test {

	public static void main(String[] args) {
    String message="Hash me if you can";
    System.out.println(MD5.digest(message));

	}

}
