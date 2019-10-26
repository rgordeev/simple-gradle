package ru.rgordeev.tasks14;

import java.util.Scanner;

public class Task5 {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println(a & ~(-1 << b));
    }
}
