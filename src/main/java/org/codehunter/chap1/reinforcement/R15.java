package org.codehunter.chap1.reinforcement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.LongStream;

/**
 * Write a short Java method that takes an integer n and returns the sum of all positive integers less than or equal to n.
 */
public class R15 {
    public static final Logger log = LogManager.getLogger(R15.class);

    public static void main(String[] args) {
        int value = Integer.MAX_VALUE;
        long currentTime = System.currentTimeMillis();
        log.info("Sum of {} is: {} | Calculated in {}", value, sum(value), System.currentTimeMillis() - currentTime);

        currentTime = System.currentTimeMillis();
        log.info("SumBySteam of {} is: {} | Calculated in {}", value, sumByStream(value), System.currentTimeMillis() - currentTime);

        currentTime = System.currentTimeMillis();
        log.info("SumByParallelSteam of {} is: {} | Calculated in {}", value, sumByParallelStream(value), System.currentTimeMillis() - currentTime);
    }

    static long sum(int n) {
        long sum = 0;
        long i = 0;
        while (i <= n) {
            sum += i;
            i++;
        }
        return sum;
    }

    static long sumByStream(int n) {
        return LongStream.rangeClosed(0, n).sum();
    }

    static long sumByParallelStream(int n) {
        return LongStream.rangeClosed(0, n).parallel().sum();
    }
}
