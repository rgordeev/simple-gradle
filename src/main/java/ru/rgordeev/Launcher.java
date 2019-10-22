package ru.rgordeev;

import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Integer a = in.nextInt();
        Integer b = in.nextInt();
        Integer n = in.nextInt();

        System.out.println(printPrice(a, b, n));
    }

    public static Integer sum(Integer a) {
        if (a == 0) return a;
        return sum(a / 10) + a % 10;
    }

    public static Integer nextEven(Integer a) {
        return a % 2 == 0 ? a + 2 : a + 1;
    }

    public static String printPrice(Integer a, Integer b, Integer n) {
        Integer c = (100 * a + b) * n;
        return String.format("%d %d", c / 100, c % 100);
    }
}
