package org.codehunter.chap1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Write a short Java method, isEven, that takes an int i and returns true if and only if i is even.
 * Your method cannot use the multiplication, modulus, or division operators, however.
 *
 */
public class R14 {
    public static final Logger log = LogManager.getLogger(R14.class);
    public static void main(String[] args) {
        log.info(Integer.MAX_VALUE);
        log.info("is even {} ", isEven(Integer.MAX_VALUE));
    }

    static boolean isEvenRecursive(int i) {
        if (i < 0) {
            log.error("negative");
            return false;
        }
        if (i == 0) return true;
        if (i == 1) return false;
        return isEvenRecursive(i-2);
    }

    static boolean isEven(int i) {
        while (i > 0) {
            i = i-2;
            if (i == 0) return true;
            if (i == 1) return false;
        }
        return false;
    }
}
