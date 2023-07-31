package org.codehunter.chap1.creativity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Write a short Java method that takes an array of int values
 * and determines if there is a pair of distinct elements of the array whose product is even.
 */
public class C117 {
    private static final Logger log = LogManager.getLogger(C117.class);

    public static void main(String[] args) {
        log.info(" hasEvenElement : {}", hasEvenElement(new int[]{1, 2, 3}));

    }

    static boolean hasEvenElement(int[] arrays) {
        for (int e : arrays) {
            if (isEven(e)) {
                return true;
            }
        }
        return false;
    }

    static boolean isEven(int n) {
        return (n & 1) == 0;
    }
}
