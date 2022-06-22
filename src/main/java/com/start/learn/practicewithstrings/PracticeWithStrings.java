package com.start.learn.practicewithstrings;

public class PracticeWithStrings {

    public static String getLowerCaseOfOriginalPhraseIfEnteredCharacterIsLetter(String originalPhrase, char letterOrSymbolInput) {
        if (Character.isLetter(letterOrSymbolInput)) {
            originalPhrase = originalPhrase.toLowerCase();
            return originalPhrase;
        }
        return originalPhrase;
    }

    public static char getLowerCaseOfEnteredCharacterIfItIsLetter(char letterOrSymbolInput) {
        if (Character.isLetter(letterOrSymbolInput)) {
            letterOrSymbolInput = Character.toLowerCase(letterOrSymbolInput);
            return letterOrSymbolInput;
        }
        return letterOrSymbolInput;
    }

    public static int getLettersAmount(String originalPhrase, char letterOrSymbolInput) {
        int letterOrSymbolInputCounter = 0;
        char originalPhraseArray[] = originalPhrase.toCharArray();
        for (int i = 0; i < originalPhrase.length(); i++) {
            if (originalPhraseArray[i] == letterOrSymbolInput)
                letterOrSymbolInputCounter++;
        }
        return letterOrSymbolInputCounter;
    }

    public static String getStringBetweenDefinedLetters(String originalPhrase, char letterOrSymbolInput) {
        int startIndex = originalPhrase.indexOf(letterOrSymbolInput);
        int endIndex = originalPhrase.lastIndexOf(letterOrSymbolInput);
        String resultString = originalPhrase.substring(startIndex + 1, endIndex);

        return resultString;
    }

    public static String getReplacedWithSpecialCharacterString(String originalPhrase, char letterOrSymbolInput) {
        String resultString = originalPhrase.replaceAll(String.valueOf(letterOrSymbolInput), "\"");
        return resultString;
    }

}
