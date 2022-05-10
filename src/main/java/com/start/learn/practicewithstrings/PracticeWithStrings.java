package com.start.learn.practicewithstrings;

import java.util.Locale;
import java.util.Scanner;

public class PracticeWithStrings {

    public static void lettersAndSymbolsRemover(String str) {
        StringBuilder symbolsRemover = new StringBuilder(str);
        symbolsRemover.deleteCharAt(str.length() - 1);
        symbolsRemover.deleteCharAt(0);
        symbolsRemover.toString();
        System.out.println("Phrase where removed first and last letters : ");
        System.out.println(symbolsRemover);
    }

    public static void replacingEnteredPhraseWithSymbols(String inputPhrase) {
        StringBuilder replacer = new StringBuilder(inputPhrase.length());
        for (int i = 0; i < inputPhrase.length(); i++) {
            replacer.append('\"');
        }
        System.out.println("Replaced phrase: " + replacer.toString());
    }

    public static void lettersCounter(String inputPhrase) {
        String originalTrimmedPhrase = inputPhrase.replaceAll(" ", "");
        int lettersAmount = originalTrimmedPhrase.length();
        System.out.println("Letters Amount: " + lettersAmount);
    }

    public static void stringDisplayBetweenEnteredValue(String originalPhrase, String completedString, char letter) {
        int counter1 = 0;
        letter = Character.toLowerCase(letter);
        char strArray1[] = originalPhrase.toCharArray();
        for (int i = 0; i < originalPhrase.length(); i++) {
            if (strArray1[i] == letter)
                counter1++;
        }
        if (counter1 >= 1) {
            completedString = completedString.toLowerCase(Locale.ROOT);
            char strArray2[] = completedString.toCharArray();
            int startIndex = 0;
            int endIndex = 0;
            int counter = 0;
            for (int i = 0; i < strArray2.length; i++) {
                if (strArray2[i] == letter && counter == 0) {
                    startIndex = i + 1;
                    counter++;
                }
                if (strArray2[i] == letter && counter == 1) {
                    endIndex = i;
                }
            }
            String resultString = completedString.substring(startIndex, endIndex);
            System.out.println("RESULT1: " + resultString);
        } else {
            System.out.println("There is only one letter/symbol:" + letter);
            System.out.println("Entered phrase won't be changed");
            String resultString = completedString.substring(0, completedString.length());
            System.out.println("RESULT2: " + resultString);
        }
    }

    public static void main(String[] args) {
        //For entering phrase
        System.out.println("Write  your phrase: ");
        Scanner input = new Scanner(System.in);
        String originalPhrase = input.nextLine();
        originalPhrase = originalPhrase.trim();
        //For entering letter
        System.out.println("Write  your char letter or symbol: ");
        char enteredLetter = input.next().charAt(0);
        StringBuilder builder = new StringBuilder();
        builder.append(originalPhrase);
        builder.append(enteredLetter);
        String completedString = builder.toString();
        System.out.println("Complete String : " + completedString);
        //Method that counts letters/symbols without spaces
        lettersCounter(completedString);
        //Method that replace final phrase with "
        replacingEnteredPhraseWithSymbols(completedString);
        //Method  displays string that is between entered letter
        stringDisplayBetweenEnteredValue(originalPhrase, completedString, enteredLetter);
    }
}

