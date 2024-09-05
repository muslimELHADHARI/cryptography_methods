package cryptography.symmetricCryptosystems.rsa;

public class Modular_Inverse {
public int invModCalculator(int a,int m) {
	for(int inverse=0;inverse<m;inverse++) {
		if((a*inverse) % m == 1 ) {return inverse;}
	}
	return -1;
}
}
