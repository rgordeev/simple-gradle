package ru.rgordeev.tasks14;

import java.util.Scanner;

public class Task2 {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(1L << n);
    }
}
