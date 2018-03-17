package primes;

import java.util.stream.IntStream;

public class PrimeIntStream {
    public static IntStream upto(int initial) {
        return IntStream.range(2, initial + 1).filter (PrimeIntStream::isPrime);
    }

    private static boolean isPrime(int n) {
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i=3; i*i <= n; i+=2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}