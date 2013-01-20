package aatkin.prime;

import java.util.ArrayList;
import java.util.List;

public class PrimeCounter {
    public static List<Integer> getPrimesForRange(int limitFrom, int limitTo) {
        validateParameters(limitFrom, limitTo);
        return calculatePrimes(limitFrom, limitTo);
    }

    private static void validateParameters(int limitFrom, int limitTo) {
        if (limitTo < limitFrom) {
            throw new IllegalArgumentException("Limits out of boundary: limitFrom (" + limitFrom + ") > limitTo (" + limitTo + ")");
        } else if (limitFrom < 1 || limitTo < 1) {
            throw new IllegalArgumentException("Limits must be positive and non-zero! Limits: " + limitFrom + " " + limitTo);
        }
    }

    private static List<Integer> calculatePrimes(int limitFrom, int limitTo) {
        List<Integer> primes = new ArrayList<Integer>();
        for (int i = limitFrom; i <= limitTo; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    private static boolean isPrime(int number) {
        return number == 1 || isNotDividable(number);
    }

    private static boolean isNotDividable(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
