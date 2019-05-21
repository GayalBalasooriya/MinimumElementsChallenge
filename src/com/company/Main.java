package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of integers need to enter");
        int count = scanner.nextInt();

        System.out.println("The minimum number is: "+findMin(readIntegers(count)));
    }

    public static int[] readIntegers(int count) {

        int[] inputArray = new int[count];

        for(int i=0; i<count;i++) {
            System.out.println("Enter integer "+(i+1)+" ,"+((count-1) - i)+" to go");

            inputArray[i]=scanner.nextInt();
        }
        return inputArray;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i=1; i<array.length; i++) {
            if (array[i]<min) {
                min = array[i];
            }
        }
        return min;
    }


}
