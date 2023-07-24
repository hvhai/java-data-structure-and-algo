package org.codehunter.chap1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.IntStream;

/**
 * Write a short Java method that takes an integer n and returns the sum of all positive integers less than or equal to n.
 */
public class R15 {
    public static final Logger log = LogManager.getLogger(R15.class);
    public static void main(String[] args) {
        int value = 9;
        log.info("Sum of {} is: {}", value, sum(value));
        log.info("SumBySteam of {} is: {}", value, sumByStream(value));
    }

    static int sum(int n) {
        int sum = 0;
        int i = 0;
        while (i <= n) {
            sum +=i;
            i++;
        }
        return sum;
    }

    static int sumByStream(int n) {
        return IntStream.rangeClosed(0, n).sum();
    }
}
