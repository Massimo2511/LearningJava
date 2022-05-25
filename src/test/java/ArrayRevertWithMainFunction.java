import java.util.Scanner;

import static com.start.learn.arrayrevert.ArrayRevert.*;

public class ArrayRevertWithMainFunction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Fill in size of Int array: ");
        System.out.print("Enter number of rows ");
        int rowsOfArray = in.nextInt();
        System.out.print("Enter number of columns: ");
        int columnsOfArray = in.nextInt();
        int[][] enteredArray = new int[rowsOfArray][columnsOfArray];
        getArrayFilledWithRandomValues(enteredArray);
        System.out.println("Entered Array");
        printArray(enteredArray);
        //Reverted array
        int[][] reversedArray = getReversArray(enteredArray);
        System.out.println("Reverted Array");
        printArray(reversedArray);
    }
}
