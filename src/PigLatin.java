import java.util.Scanner;

/**
 * Created by aibar on 6/30/2017.
 */
//Author: Andres
//This program converts a word to PigLatin
public class PigLatin {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Welcome to the Pig Latin Translator!");
        String userInput;
        String loop = "y";

        while (loop.equalsIgnoreCase("y")) {
            System.out.println("Enter a line to be translated: ");
            userInput = scnr.nextLine();
            if (!userInput.equals(null)) {
                createPig(userInput); //createPig is the method that does the converstion to PigLatin
            } else {
                System.out.println("Type something!");
            }
            System.out.println("Continue? (y/n)");
            loop = scnr.nextLine();
        }
        if (loop.equalsIgnoreCase("n")) {
            System.out.println("Bye!");
        }
    }

    public static void createPig(String userInput) {
        StringBuffer textToBe = new StringBuffer();
        char firstLetter = ' ';
        char symbolLastIndex = ' ';
        String firstVowel;
        String uiLowercase;
        String vowels = "aeiou";

        for (int i = 0; i < userInput.length(); i++) { //this for loop finds the first vowel in a word, removes leading consonants
            //and appends them in the end of the word.
            firstVowel = String.valueOf(userInput.charAt(i));
            if (vowels.contains(String.valueOf(userInput.charAt(i)))) {
                textToBe.setLength(0);
                //check if word contains punctuation marks.
                if (userInput.charAt(userInput.length() - 1) == '?' || userInput.charAt(userInput.length() - 1) == '!' || userInput.charAt(userInput.length() - 1) == '.') {
                    symbolLastIndex = userInput.charAt(userInput.length() - 1);
                    uiLowercase = userInput.toLowerCase();
                    uiLowercase = uiLowercase.replace("?", "").replace("!", "").replace(".", "");
                    //ifElses checks if the first letter is capitalized, and if the first letter is a vowel or a consonant
                    ifElses(userInput, textToBe, firstLetter, symbolLastIndex, uiLowercase, vowels, firstVowel);
                } else {
                    uiLowercase = userInput.toLowerCase();
                    ifElses(userInput, textToBe, firstLetter, symbolLastIndex, uiLowercase, vowels, firstVowel);
                }
                i = userInput.length();
            }
        }
        if (isNum(userInput)) { //find if input is a number
            System.out.println(userInput);
        }
    }
    public static boolean isNum(String userInput) {
        try {
            int num = Integer.parseInt(userInput);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
    public static void ifElses(String userInput, StringBuffer textToBe, char firstLetter, char symbolLastIndex, String uiLowercase, String vowels, String firstVowel) {

        if (Character.isUpperCase(userInput.charAt(0))) {
            if (uiLowercase.charAt(0) == 'a' || uiLowercase.charAt(0) == 'e' || uiLowercase.charAt(0) == 'i' || uiLowercase.charAt(0) == 'o' || uiLowercase.charAt(0) == 'u') {
                textToBe.append(uiLowercase + "way");
                firstLetter = textToBe.charAt(0);
                textToBe.deleteCharAt(0);
                textToBe.insert(0, Character.toUpperCase(firstLetter));
                textToBe.append(symbolLastIndex);
                System.out.println(textToBe);
            } else {
                textToBe.append(uiLowercase + uiLowercase.substring(0, uiLowercase.indexOf(firstVowel)) + "ay");
                textToBe.delete(0, textToBe.indexOf(firstVowel));
                firstLetter = textToBe.charAt(0);
                textToBe.deleteCharAt(0);
                textToBe.insert(0, Character.toUpperCase(firstLetter));
                textToBe.append(symbolLastIndex);
                System.out.println(textToBe);
            }
        } else {
            if (uiLowercase.charAt(0) == 'a' || uiLowercase.charAt(0) == 'e' || uiLowercase.charAt(0) == 'i' || uiLowercase.charAt(0) == 'o' || uiLowercase.charAt(0) == 'u') {
                textToBe.append(uiLowercase + "way");
                textToBe.append(symbolLastIndex);
                System.out.println(textToBe);
            } else {
                textToBe.append(uiLowercase + uiLowercase.substring(0, uiLowercase.indexOf(firstVowel)) + "ay");
                textToBe.delete(0, textToBe.indexOf(firstVowel));
                textToBe.append(symbolLastIndex);
                System.out.println(textToBe);
            }
        }

    }
}
