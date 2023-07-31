package org.codehunter.chap1.creativity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The p-norm
 */
public class C118 {
    private static final Logger log = LogManager.getLogger(C118.class);

    public static void main(String[] args) {
        int[] v = {3, 4, 5};
        log.info("the norm of  : {} is : {}", v, norm(v, 2));
    }

    static double norm(int[] v, int p) {
        double sum = 0;
        for (int i : v) {
            sum += Math.pow(i, p);
        }
        log.info("sum = {}", sum);
        return Math.round(Math.pow(sum, 1.0 / (double) p));
    }
}
