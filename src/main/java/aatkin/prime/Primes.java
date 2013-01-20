package aatkin.prime;

/**
 *  Author: Anssi Kinnunen, aatkin@utu.fi
 *  A small program for calculating prime numbers from natural numbers in a given range.
 */

public class Primes {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.print("Usage: [int range1] [int range2]");
            System.exit(0);
        }

        int range1 = Integer.parseInt(args[0]);
        int range2 = Integer.parseInt(args[1]);

        calculatePrimes(range1, range2);
    }

    public static void calculatePrimes(int limitFrom, int limitTo) {
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

    public static boolean isPrime(double number) {
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