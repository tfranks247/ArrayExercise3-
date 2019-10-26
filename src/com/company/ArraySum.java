package com.company;

public class ArraySum {
    public static void main (String [] args) {
        int tony [] = {21, 16, 86, 21, 3};
        int sum = 0;

        for (int counter=0; counter<tony.length; counter++){
            sum+=tony[counter];
        }
        System.out.println("The sum of these numbers is: " + sum);
    }
}
