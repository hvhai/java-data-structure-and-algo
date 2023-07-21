package org.codehunter.chap1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Write a short Java method, isMultiple, that takes two long values, n and m,
 * and returns true if and only if n is a multiple of m, that is, n = mi for some integer i.
 */
public class R13 {
    public static final Logger log = LogManager.getLogger(R13.class);
    public static void main(String[] args) {
        log.info("is multiple {} ", isMultiple(912348,3));
        log.info("is multiple {} ", isMultipleEnhanced(912348,3));
    }

    static boolean isMultiple(long n, long m) {
        long i = 0;
        while ( m*i <= n || i == Long.MAX_VALUE) {
            if (n == m*i){
                return true;
            }
            i++;
        }
        log.info("i = {}", i);
        return false;
    }

    static boolean isMultipleEnhanced(long n, long m) {
        return n%m == 0;
    }

}
