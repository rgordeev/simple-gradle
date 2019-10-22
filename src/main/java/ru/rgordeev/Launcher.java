package ru.rgordeev;

import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Integer a = in.nextInt();

        System.out.println(a % 10);
    }

    public static Integer sum(Integer a, Integer b) {
        return a + b;
    }
}
