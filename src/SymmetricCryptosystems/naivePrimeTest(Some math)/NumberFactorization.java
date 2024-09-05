package cryptography.symmetricCryptosystems.naivePrimeTest;

import java.math.BigInteger;

public class NumberFactorization {

    public static void main(String[] args) {
   BigInteger b=new BigInteger("999999999999");
   fact(b);
    }
     

    public static void fact(BigInteger n) {
        System.out.println("The factorization of " + n + " is:");
        StringBuilder res = new StringBuilder();
        BigInteger p = BigInteger.valueOf(2);
        while (n.compareTo(BigInteger.ONE) > 0) {
            if (n.mod(p).equals(BigInteger.ZERO)) {
                res.append(p).append(" ");
                n = n.divide(p);
            } else {
                p = nextPrime(p);
            }
        }
        System.out.println(res);
    }

    public static BigInteger nextPrime(BigInteger n) {
        NaivePrimeTest p = new NaivePrimeTest();
        n = n.add(BigInteger.ONE);
        while (!p.isPrime(n.intValue())) {
            n = n.add(BigInteger.ONE);
        }
        return n;
    }
}
