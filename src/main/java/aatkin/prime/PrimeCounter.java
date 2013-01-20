package aatkin.prime;

public class PrimeCounter {

    public void calculatePrimes(int limitFrom, int limitTo) {
        validateParameters(limitFrom, limitTo);

        for (int i = limitFrom; i <= limitTo; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private void validateParameters(int limitFrom, int limitTo) {
        if (limitTo < limitFrom) {
            throw new IllegalArgumentException("Limits out of boundary: limitFrom (" + limitFrom + ") > limitTo (" + limitTo + ")");
        }
        else if (limitFrom < 1 || limitTo < 1) {
            throw new IllegalArgumentException("Limits must be positive and non-zero! Limits: " + limitFrom + " " + limitTo);
        }
    }

    private boolean isPrime(double number) {
        if (number == 1) return true;
        double limit = Math.sqrt(number);

        for (int i = 2; i <= limit; i++) {
            if ((int) number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
