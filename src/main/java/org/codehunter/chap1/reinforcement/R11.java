package org.codehunter.chap1.reinforcement;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * Write a short Java method, inputAllBaseTypes,
 * that inputs a different value of each base type from the standard input device
 * and prints it back to the standard output device.
 */
public class R11 {
    public static void main(String[] args) {
        // basic type: boolean, byte, short, int, long, char, float, double
        Scanner scanner = new Scanner(System.in);
        boolean bool = scanner.nextBoolean();
        byte b = scanner.nextByte();
        short s = scanner.nextShort();
        int i = scanner.nextInt();
        long l = scanner.nextLong();
        char c = scanner.next().charAt(0);
        float f = scanner.nextFloat();
        double d = scanner.nextDouble();
        List<Object> list = new ArrayList<>();
        list.add(Objects.toString(bool));
        list.add(Objects.toString(b));
        list.add(Objects.toString(s));
        list.add(Objects.toString(i));
        list.add(Objects.toString(l));
        list.add(Objects.toString(c));
        list.add(Objects.toString(f));
        list.add(Objects.toString(d));
        System.out.println(list);


    }
}
