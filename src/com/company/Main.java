package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);  //using the scanner to get the integers to assign to the array
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println(myIntegers[i]);
        }

        getAverage(myIntegers);
    }


    //use this to get the values for the array.
    public static int[] getIntegers(int number) {
        System.out.println("Enter "+ number + " integer values.\r");

        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
        //use this to get the average of then values of the array.
    public static double getAverage(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum+= array[i];
        }
        System.out.println((double) sum / (double)array.length);
        return (double) sum / (double)array.length;
    }
}
