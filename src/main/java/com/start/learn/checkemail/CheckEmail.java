package com.start.learn.checkemail;

import java.util.Arrays;
import java.util.Scanner;
public class CheckEmail {
    public static boolean isEmailValid(String enteredEmail) {
        String[] splittedStringPart = enteredEmail.split("@");

        // check for @
        if (Arrays.stream(splittedStringPart).count() == 1&& !enteredEmail.contains("@")) {
            System.out.println("@ is absent ");
            return false;
        }
        if (Arrays.stream(splittedStringPart).count() > 2) {
            System.out.println("More than 1 @  ");
            return false;
        }
        // check for  local characters amount
        if (splittedStringPart[0].length() == 0) {
            System.out.println("Local part empty   ");
            return false;
        }
        if (splittedStringPart[0].length() > 64) {
            System.out.println("Local part  can't more then 64  ");
            return false;
        }
        // check for  domain characters amount

        if (  splittedStringPart[1].length()== 0){
            System.out.println("Domain part  can't be empty   ");
            return false;
        }
        if (splittedStringPart[1].length() > 255) {
            System.out.println("Domain part  can't be more then 255  ");
            return false;
        }
        if (!splittedStringPart[1].contains(".")) {
            System.out.println("Domain part without '.'   ");
            return false;
        }
        // General email check
        if (enteredEmail.contains("..") || enteredEmail.contains(".@") || enteredEmail.contains("@.") || enteredEmail.contains("._.")) {
            System.out.println("Check you email for next mistakes: 1)\"..\" 2) \".@\" 3)\"@.\" 4)\"._.\"  ");
            return false;
        }
        if (enteredEmail.endsWith(".") || enteredEmail.startsWith(".")) {
            System.out.println("Email can't start or end with '.'   ");
            return false;
        }
        if (enteredEmail.endsWith("@") || enteredEmail.startsWith(".")) {
            System.out.println("Email can't start or end with '@'   ");
            return false;
        }
        char strArray1[] = enteredEmail.toCharArray();
        for (char c : strArray1) {
            if (!Character.isLetter(c) & !Character.isDigit(c) & c != '_' & c != '.' & c != '@') {
                System.out.println("Email contains special characters that is not allowed  ");
                return false;
            }
        }
        return true;
    }

    public static void printResults(String enteredEmail) {
        if (isEmailValid(enteredEmail) == true) {
            System.out.println("Entered email is VALID: ");
            System.out.println(enteredEmail);
        } else {
            System.out.println(">>Entered email is NOT VALID => correct mistakes above:<< ");
            System.out.println(enteredEmail);
        }
    }
    public static void main(String[] args) {
        //For entering phrase
        System.out.println("Write  your email: ");
        Scanner input = new Scanner(System.in);
        String enteredEmail = input.nextLine();
        enteredEmail = enteredEmail.trim();
        printResults(enteredEmail);
    }
}
