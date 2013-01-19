import java.math.*;


// Author: Anssi Kinnunen, aatkin@utu.fi
//
// A small program for calculating prime numbers from natural numbers in a given range.

public class PrimeTest
{
	public static void main( String[] args )
	{
		if( args.length < 2 )
		{
			System.out.print( "Usage: [int range1] [int range2]" );
			System.exit( 0 );
		}
		
		int range1 = Integer.parseInt( args[0] );
		int range2 = Integer.parseInt( args[1] );
				
		calculatePrimes( range1, range2 );
	}
	
	public static void calculatePrimes( int limitFrom, int limitTo )
	{
		// if limitFrom exceeds limitTo, exit the program
		if( limitTo <= limitFrom )
		{
			System.out.println( "Limits out of boundary: limitFrom (" + limitFrom + ") >= limitTo (" + limitTo + ")" );
			System.exit( 0 );
		}
		// if limitFrom is smaller than 1 or limitTo is smaller than 1, exit the program
		else if( limitFrom < 1 || limitTo < 1 )
		{
			System.out.println( "Limits must be positive and non-zero! Limits: " + limitFrom + " " + limitTo );
			System.exit( 0 );
		}

		//check every number beginning from limitFrom to limitTo whether they pass the isPrime(...) check.
		//if so, print the number.
		for( int i = limitFrom; i <= limitTo; i++ )
		{
			if( isPrime(i) ) 
			{
				System.out.println( i );
			}
		}
	}
	
	public static boolean isPrime( double number )
        {
		//if number is 1, return true
                if( number == 1 ) return true;
		
		double limit = Math.sqrt( number );
		
		//check all numbers starting from 2 to given number minus 1
		//if given number modus integer i equals zero, number is not a prime, return false
                for( int i = 2; i <= limit; i++ )
                {
                        if( (int) number%i == 0 )
                        {
                                return false;
                        }
                }
		//the number is a prime, return true
                return true;
		
        }
	
} //PrimeTest-class