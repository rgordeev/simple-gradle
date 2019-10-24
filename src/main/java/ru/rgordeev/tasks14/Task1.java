package ru.rgordeev.tasks14;

import java.util.Scanner;

public class Task1 {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int mask = Integer.parseInt("1111111111111111111111111111111", 2);


        System.out.println(a & (mask << b));
    }
}
