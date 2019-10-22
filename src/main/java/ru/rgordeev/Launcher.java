package ru.rgordeev;

import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Integer a = in.nextInt();

        System.out.println(sum(a));
    }

    public static Integer sum(Integer a) {
        if (a == 0) return a;
        return sum(a / 10) + a % 10;
    }
}
