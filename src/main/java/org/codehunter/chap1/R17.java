package org.codehunter.chap1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;
import java.util.stream.IntStream;

/**
 * Write a short Java method that takes an integer n
 * and returns the sum of the squares of all positive integers
 * less than or equal to n.
 */
public class R17 {
    public static final Logger log = LogManager.getLogger(R17.class);

    public static void main(String[] args) {
        long currentTime = System.currentTimeMillis();
        int value = 400000000;
        log.info("sumOfSquare {} is: {} | Calculated in {}", value, sumOfSquare(value), System.currentTimeMillis() - currentTime);
    }

    static double sumOfSquare(int n) {
        BigDecimal sum = IntStream.rangeClosed(0, n)
                .mapToObj(i -> BigDecimal.valueOf(i).multiply(BigDecimal.valueOf(i)))
                .reduce(BigDecimal::add)
                .orElse(BigDecimal.ZERO);
        return sum.doubleValue();
    }
}
