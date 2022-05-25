package com.start.learn.matrixmaltiplication;

import java.util.Scanner;
import java.util.Random;

public class MatrixMultiplication {

    public static int[][] getMultipliedArrayFromTwoEnteredArrays(int[][] simpleArray1, int rowsOfArray1, int columnsOfArray1, int[][] simpleArray2, int rowsOfArray2, int columnsOfArray2) {
        int[][] resultOfTwoMultipliedArrays = new int[rowsOfArray1][columnsOfArray2];
        if (columnsOfArray1 == rowsOfArray2) {
            for (int i = 0; i < rowsOfArray1; i++) {
                for (int j = 0; j < columnsOfArray2; j++) {
                    for (int k = 0; k < rowsOfArray2; k++) {
                        resultOfTwoMultipliedArrays[i][j] += simpleArray1[i][k] * simpleArray2[k][j];
                    }
                }
            }
        } else {
            String errorMessage=String.format("!!!Error: Multiplication not possible!!!");
            String errorMessageArrayRuleText=String.format("REASON>>: Two Arrays can be multiplied by each other if and only if the number of columns of the first array is equal to the number of rows of the second array. :");
            String errorMessageInfo1=String.format("Columns amount of Array 1 is>> %d", columnsOfArray1);
            String errorMessageInfo2=String.format ("and differs from rows amount of Array 2 which is>> %d", rowsOfArray2);
            String errorMessageAdviceText=String.format("%s","Please check your Arrays");
            System.out.println(errorMessage);
            System.out.println(errorMessageArrayRuleText);
            System.out.println(errorMessageInfo1);
            System.out.println(errorMessageInfo2);
            System.out.println(errorMessageAdviceText);
        }
        return resultOfTwoMultipliedArrays;
    }

    public static void printArray(int[][] arrayToBePrinted) {
        /* Method fills array with random values on defined boundary and prints that array */
        Random randomDefine = new Random();
        int randomNumber;
        for (int i = 0; i < arrayToBePrinted.length; i++) {
            for (int j = 0; j < arrayToBePrinted[i].length; j++) {
                System.out.print(arrayToBePrinted[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] getArrayFilledWithRandomValues(int[][] arrayForFilling, int maxArrayValue) {
        /* Method fills array with random values on defined boundary */
        Random randomDefine = new Random();
        int randomNumber;
        for (int i = 0; i < arrayForFilling.length; i++) {
            for (int j = 0; j < arrayForFilling[i].length; j++) {
                randomNumber = randomDefine.nextInt(maxArrayValue) + 1;//Generates random values in range from 1 to "maxArrayValue"
                arrayForFilling[i][j] = randomNumber;
            }
        }
        return arrayForFilling;
    }
}
