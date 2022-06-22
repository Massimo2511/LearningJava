import java.util.Scanner;

import static com.start.learn.practicewithstrings.PracticeWithStrings.*;

public class PracticeWithStringsWithMainFunction {
    public static void main(String[] args) {
        //For  phrase input
        System.out.println("Write  your phrase: ");
        Scanner input = new Scanner(System.in);
        String originalPhrase = input.nextLine();
        originalPhrase = originalPhrase.trim();
        //For  letter or symbol input
        System.out.println("Write  your char letter or symbol: ");
        char letterOrSymbolInput = input.next().charAt(0);
        if (originalPhrase.contains(String.valueOf(letterOrSymbolInput))) {
            System.out.println("Original String : " + originalPhrase);
            originalPhrase=getLowerCaseOfOriginalPhraseIfEnteredCharacterIsLetter(originalPhrase,letterOrSymbolInput);
            letterOrSymbolInput=getLowerCaseOfEnteredCharacterIfItIsLetter(letterOrSymbolInput);
            System.out.println("Letters counter : " + getLettersAmount(originalPhrase, letterOrSymbolInput));
            System.out.println("Formatted string : " + getStringBetweenDefinedLetters(originalPhrase, letterOrSymbolInput));
            System.out.println("Replaced string : " + getReplacedWithSpecialCharacterString(originalPhrase, letterOrSymbolInput));
        } else {
            System.out.println("WARNING!! Original String doesn't contain letter/symbol => " + letterOrSymbolInput);
            System.out.println("Original String : " + originalPhrase);
        }
    }
}
