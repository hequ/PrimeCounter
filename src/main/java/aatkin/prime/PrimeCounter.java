package aatkin.prime;

public class PrimeCounter {

    public void calculatePrimes(int limitFrom, int limitTo) {
        if (limitTo < limitFrom) {
            System.out.println("Limits out of boundary: limitFrom (" + limitFrom + ") > limitTo (" + limitTo + ")");
            System.exit(0);
        }
        else if (limitFrom < 1 || limitTo < 1) {
            System.out.println("Limits must be positive and non-zero! Limits: " + limitFrom + " " + limitTo);
            System.exit(0);
        }

        for (int i = limitFrom; i <= limitTo; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
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
