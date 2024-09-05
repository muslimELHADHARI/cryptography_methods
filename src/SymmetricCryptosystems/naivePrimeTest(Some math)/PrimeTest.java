package cryptography.symmetricCryptosystems.naivePrimeTest;

public class PrimeTest {

	public static void main(String[] args) {
NaivePrimeTest p=new NaivePrimeTest();
int n=246556661;
boolean r=p.isPrime(n);
String res=(r) ? n+" is prime" :n+" is not prime";
System.out.println(res);
	}

}
