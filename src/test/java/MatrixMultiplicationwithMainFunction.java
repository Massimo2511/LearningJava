import java.util.Scanner;

import static com.start.learn.matrixmaltiplication.MatrixMultiplication.*;

public class MatrixMultiplicationwithMainFunction {
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
        int[][] enteredArray1 = new int[rowsOfArray1][columnsOfArray1];
        System.out.println("Array1 is :");
        getArrayFilledWithRandomValues(enteredArray1, maxArrayValue_1);
        printArray(enteredArray1);

        /* Input and print of Array2 */
        System.out.println("Fill in size of Int array2: ");
        System.out.print("Enter number of rows for array2 ");
        int rowsOfArray2 = in.nextInt();
        System.out.print("Enter number of columns for array2 : ");
        int columnsOfArray2 = in.nextInt();
        System.out.print("Fill in the max Int Array2 value. Array2 will be filled with elements in a range from 1 to the [number] that you will define : ");
        int maxArrayValue_2 = in.nextInt();
        int[][] enteredArray2 = new int[rowsOfArray2][columnsOfArray2];
        System.out.println("Array2 is :");
        getArrayFilledWithRandomValues(enteredArray2, maxArrayValue_2);
        printArray(enteredArray2);

        /* Calling Multiplication basing on entered Array1 and Array2 */
        int[][] resultOfTwoArraysMultiplication = getMultipliedArrayFromTwoEnteredArrays(enteredArray1, enteredArray2);
        if (resultOfTwoArraysMultiplication != null) {
            System.out.println("Result array :");
            printArray(resultOfTwoArraysMultiplication);
        }
    }
}
