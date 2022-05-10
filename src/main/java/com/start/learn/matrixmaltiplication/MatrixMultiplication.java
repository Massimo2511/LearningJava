package com.start.learn.matrixmaltiplication;

import java.util.Scanner;
import java.util.Random;

public class MatrixMultiplication {

    public static void matrixMultiplication(int[][] array1, int[][] array2) {
        /* Method multiplies 2 Arrays with check for arrays conformance (length) */
        if (array1.length == array2.length) {
            System.out.println("Multiplied array");
            int[][] array3 = new int[array1.length][array1.length];
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array2[i].length; j++) {
                    array3[i][j] = 0;
                    for (int k = 0; k < array3.length; k++) {
                        array3[i][j] = array3[i][j] + (array1[i][k] * array2[k][j]);
                    }
                    System.out.print(array3[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Error:");
            System.out.println("Size of Array2 is: " + array2.length + " and differs from size of Array1: " + array1.length);
            System.out.println("Please check you Arrays");
        }
    }

    public static void matrixPrint(int[][] array1, int maxArrayValue) {
        /* Method fills array with random values on defined boundary and prints that array */
        Random randomDefine = new Random();
        int randomNumber;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                randomNumber = randomDefine.nextInt(maxArrayValue) + 1;//Generates random values in range from 1 to "maxArrayValue"
                array1[i][j] = randomNumber;
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /* Input and print of Array1 */
        System.out.println("Fill in size of Int array1: ");
        System.out.print("Enter number of rows for array1 ");
        int rowsOfArray1 = in.nextInt();
        System.out.print("Enter number of columns for array1 : ");
        int columnsOfArray1 = in.nextInt();
        System.out.print("Fill in the max Int Array1 value. Array1 will be filled with elements in a range from 1 to the [number] that you will define : ");
        int maxArrayValue_1 = in.nextInt(); // Array elements numeration started from:
        int[][] array1 = new int[rowsOfArray1][columnsOfArray1];
        System.out.println("Array1 is :");
        matrixPrint(array1, maxArrayValue_1);//Array1 print
        /* Input and print of Array2 */
        System.out.println("Fill in size of Int array2: ");
        System.out.print("Enter number of rows for array2 ");
        int rowsOfArray2 = in.nextInt();
        System.out.print("Enter number of columns for array2 : ");
        int columnsOfArray2 = in.nextInt();
        System.out.print("Fill in the max Int Array2 value. Array2 will be filled with elements in a range from 1 to the [number] that you will define : ");
        int maxArrayValue_2 = in.nextInt();
        int[][] array2 = new int[rowsOfArray2][columnsOfArray2];
        System.out.println("Array2 is :");
        matrixPrint(array2, maxArrayValue_2);//Array2 print
        /* Calling Multiplication basing on entered Array1 and Array2 */
        matrixMultiplication(array1, array2);//Array multiplication
    }
}
