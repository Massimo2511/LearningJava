package com.start.learn.checkemail;

import java.util.Arrays;
import java.util.Scanner;

public class CheckEmail {
    public static boolean isEmailValid(String enteredEmail) {
        String[] enteredEmailArray = enteredEmail.split("@");
        // check for @
        if (!enteredEmail.contains("@")) {
            System.out.println("@ is missed ");
            return false;
        }
        if (enteredEmailArray.length > 2) {
            System.out.println("More than 1 @ not allowed  ");
            return false;
        }
        // check for  local characters amount
        if (enteredEmailArray[0].length() == 0) {
            System.out.println("Local part empty   ");
            return false;
        }
        if (enteredEmailArray[0].length() > 64) {
            System.out.println("Local part  can't more then 64  ");
            return false;
        }
        // check for  domain characters amount
        if (enteredEmailArray.length<=1){
            System.out.println("Domain part  empty   ");
            return false;
        }
        if (enteredEmailArray[1].length() > 255) {
            System.out.println("Domain part  can't be more then 255  ");
            return false;
        }
        if (!enteredEmailArray[1].contains(".")) {
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
        char emailArray[] = enteredEmail.toCharArray();
        for (char c : emailArray) {
            if (!Character.isLetter(c) & !Character.isDigit(c) & c != '_' & c != '.' & c != '@') {
                System.out.println("Email contains special characters that is not allowed  ");
                return false;
            }
        }
        return true;
    }
}
