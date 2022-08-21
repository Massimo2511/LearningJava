package com.start.learn.arrayrevert;

import java.util.Scanner;
import java.lang.System;

public class ArrayRevert {
    public static void printArray(int[][] simpleArray) {
        for (int i = 0; i < simpleArray.length; i++) {
            for (int j = 0; j < simpleArray[i].length; j++) {
                System.out.print(simpleArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] getReversArray(int[][] simpleArray) {
        int[][] reversedArray = new int[simpleArray.length][];
        for (int i = 0; i < simpleArray.length; i++) {
            int[] rowOfSimpleArray = simpleArray[simpleArray.length - i - 1];
            reversedArray[i] = new int[rowOfSimpleArray.length];
            for (int j = 0; j < rowOfSimpleArray.length; j++) {
                reversedArray[i][j] = rowOfSimpleArray[rowOfSimpleArray.length - j - 1];
            }
        }
        return reversedArray;
    }

    public static int[][] getArrayFilledWithRandomValues(int[][] enteredArray) {
        int fillingArrayStartedWith = 1;
        for (int i = 0; i < enteredArray.length; i++) {
            for (int j = 0; j < enteredArray[i].length; j++) {
                enteredArray[i][j] = fillingArrayStartedWith;
                fillingArrayStartedWith++;
            }
        }
        return enteredArray;
    }

}
