package org.codehunter.chap1.creativity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

/**
 * Write a short program that takes as input three integers, a, b, and c,
 * from the Java console and determines if they can be used in a correct arithmetic formula (in the given order),
 * like “a + b = c,” “a = b − c,” or “a ∗ b = c.”
 */
public class C116 {
    private static final Logger log = LogManager.getLogger(C116.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        log.info(" a={}, b={}, c={}", a, b, c);
        log.info(" isArithmeticFormula : {}", isArithmeticFormula(a, b, c));

    }

    static boolean isArithmeticFormula(int a, int b, int c) {
        return (a + b == c || a == b - c || a * b == c);
    }
}
