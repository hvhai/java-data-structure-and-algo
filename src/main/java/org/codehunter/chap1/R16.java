package org.codehunter.chap1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Write a short Java method that takes an integer n
 * and returns the sum of all the odd positive integers
 * less than or equal to n.
 */
public class R16 {
    public static final Logger log = LogManager.getLogger(R16.class);
    public static void main(String[] args) {
        int value = Integer.MAX_VALUE;
        long currentTime = System.currentTimeMillis();
        log.info("sumOdd {} is: {} | Calculated in {}", value, sumOdd(value), System.currentTimeMillis() - currentTime);
    }

    static long sumOdd(int n) {
        long sum = 0;
        long i = 0;
        while (i <= n) {
            if (isOdd(i)) {
                sum +=i;
            }
            i++;
        }
        return sum;
    }

    public static boolean isOdd(long n) {
        return (n & 1) == 1;
    }
}
