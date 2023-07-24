package org.codehunter.chap1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Write a short Java method, isEven, that takes an int i and returns true if and only if i is even.
 * Your method cannot use the multiplication, modulus, or division operators, however.
 */
public class R14 {
    public static final Logger log = LogManager.getLogger(R14.class);

    public static void main(String[] args) {
        int testValue = 4894;
        log.info("Test value: {}", testValue);
        log.info("isEven: {} ", isEven(testValue));
        log.info("isEvenByBinaryCheck: {} ", isEvenByBinaryCheck(testValue));
        log.info("isEvenRecursive: {} ", isEvenRecursive(testValue));
    }

    // this can throw StackoverflowException
    static boolean isEvenRecursive(int i) {
        if (i < 0) {
            log.error("negative");
            return false;
        }
        if (i == 0) return true;
        if (i == 1) return false;
        return isEvenRecursive(i - 2);
    }

    static boolean isEven(int i) {
        while (i > 0) {
            i = i - 2;
            if (i == 0) return true;
            if (i == 1) return false;
        }
        return false;
    }

    static boolean isEvenByBinaryCheck(int i) {
        String binaryString = Integer.toBinaryString(i);
        log.info("binary string of {} is : {} ", i, binaryString);
        return binaryString.charAt(binaryString.length() - 1) == '0';
    }
}
