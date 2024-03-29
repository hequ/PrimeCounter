package aatkin.prime;

/**
 * Author: Anssi Kinnunen, aatkin@utu.fi
 * A small program for calculating prime numbers from natural numbers in a given range.
 */

public class Primes {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.print("Usage: [int range1] [int range2]");
            System.exit(0);
        }

        PrimeCounter.getPrimesForRange(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
    }
}
