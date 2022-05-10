package com.start.learn.arrayrevert;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.System;
import static java.lang.Math.random;

public class ArrayRevert {
    public static void arrayPrint(int[][] simpleArray, int fillingArrayStartedWith) {
        System.out.println("Entered Array");
        for (int i = 0; i < simpleArray.length; i++) {
            for (int j = 0; j < simpleArray[i].length; j++) {
                simpleArray[i][j] = fillingArrayStartedWith;
                fillingArrayStartedWith++;
                System.out.print(simpleArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void arrayRevert(int[][] simpleArray) {
        System.out.println("Reverted Array");
        for (int i = simpleArray.length - 1; i >= 0; i--) {
            for (int j = simpleArray[i].length - 1; j >= 0; j--) {
                System.out.print(simpleArray[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Fill in size of Int array: ");
        System.out.print("Enter number of rows ");
        int rowsOfArray = in.nextInt();
        System.out.print("Enter number of columns: ");
        int columnsOfArray = in.nextInt();
        int fillingArrayStartedWith = 1; // Array elements started from:
        int[][] simpleArray = new int[rowsOfArray][columnsOfArray];
        arrayPrint(simpleArray, fillingArrayStartedWith);
        arrayRevert(simpleArray);
    }
}
