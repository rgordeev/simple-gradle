package ru.rgordeev;

import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Integer a = in.nextInt();

        System.out.println(nextEven(a));
    }

    public static Integer sum(Integer a) {
        if (a == 0) return a;
        return sum(a / 10) + a % 10;
    }

    public static Integer nextEven(Integer a) {
        return a % 2 == 0 ? a + 2 : a + 1;
    }
}
