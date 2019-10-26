package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter all the elements:");
        int n, sum = 0;
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();

        int[] a;
        a = new int[9];

        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Sum:" + sum);

    }
}
