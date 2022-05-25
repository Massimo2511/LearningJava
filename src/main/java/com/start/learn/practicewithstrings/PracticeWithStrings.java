package com.start.learn.practicewithstrings;

import java.util.Locale;
import java.util.Scanner;

public class PracticeWithStrings {

    public static int getLettersAmount(String originalPhrase, char letterOrSymbolInput) {
        if (Character.isLetter(letterOrSymbolInput)) {
            originalPhrase = originalPhrase.toLowerCase(Locale.ROOT);
            letterOrSymbolInput = Character.toLowerCase(letterOrSymbolInput);
        }
        int letterOrSymbolInputCounter = 0;
        char originalPhraseArray[] = originalPhrase.toCharArray();
        for (int i = 0; i < originalPhrase.length(); i++) {
            if (originalPhraseArray[i] == letterOrSymbolInput)
                letterOrSymbolInputCounter++;
        }
        return letterOrSymbolInputCounter;
    }

    public static String getStringBetweenDefinedLetters(String originalPhrase, char letterOrSymbolInput) {
        if (Character.isLetter(letterOrSymbolInput)) {
            originalPhrase = originalPhrase.toLowerCase(Locale.ROOT);
            letterOrSymbolInput = Character.toLowerCase(letterOrSymbolInput);
        }
        int startIndex = originalPhrase.indexOf(letterOrSymbolInput);
        int endIndex = originalPhrase.lastIndexOf(letterOrSymbolInput);
        String resultString = originalPhrase.substring(startIndex, endIndex);
        resultString = resultString.substring(1);
        return resultString;
    }

    public static String getReplacedWithSpecialCharacterString(String originalPhrase, char letterOrSymbolInput) {
        if (Character.isLetter(letterOrSymbolInput)) {
            originalPhrase = originalPhrase.toLowerCase(Locale.ROOT);
            letterOrSymbolInput = Character.toLowerCase(letterOrSymbolInput);
        }
        String resultString = originalPhrase.replaceAll(String.valueOf(letterOrSymbolInput), "\"");
        return resultString;
    }

}

