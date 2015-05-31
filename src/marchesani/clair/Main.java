package marchesani.clair;

// This software finds the index of the first term in the Fibonacci sequence to contain 1000 digits

import java.math.BigInteger;
import java.util.HashMap;

public class Main {

    private static final BigInteger ONE = BigInteger.ONE;
    private static final BigInteger TWO = BigInteger.ONE.add(BigInteger.ONE);

    public static void main(String[] args) {
        HashMap<BigInteger, BigInteger> results = new HashMap<BigInteger, BigInteger>();
        results.put(ONE, ONE);
        results.put(TWO, ONE);
        BigInteger i = TWO.add(ONE);
        while (results.get(i.subtract(ONE)).toString().length() != 1000) {
            results.put(i, results.get(i.subtract(ONE)).add(results.get(i.subtract(TWO))));
            i = i.add(ONE);
        }
        System.out.println(i.subtract(ONE));
    }
}