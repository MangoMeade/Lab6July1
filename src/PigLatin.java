import java.util.Scanner;

/**
 * Created by aibar on 6/30/2017.
 */
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
                createPig(userInput);
            }
            else {
                System.out.println("Type something!");
            }
            System.out.println("Continue? (y/n)");
            loop = scnr.nextLine();
        }
        if (loop.equalsIgnoreCase("n")) {
            System.out.println("Bye!");
        }
    }

    public static boolean isNum (String userInput) {
        try {
            int num = Integer.parseInt(userInput);
        }
        catch (NumberFormatException e){
                return false;
        }
        return true;
    }
    public static void createPig(String userInput) {
        StringBuffer textToBe = new StringBuffer();
        char firstLetter = ' ';
        char symbolLastIndex = ' ';
        String uiLowercase;

        textToBe.setLength(0);
        if (userInput.charAt(userInput.length() - 1) == '?' || userInput.charAt(userInput.length() - 1) == '!' || userInput.charAt(userInput.length() - 1) == '.' ) {
            symbolLastIndex = userInput.charAt(userInput.length() - 1);
            uiLowercase = userInput.toLowerCase();
            uiLowercase = uiLowercase.replace("?", "").replace("!", "").replace(".", "");
            if (Character.isUpperCase(userInput.charAt(0))) {
                if (uiLowercase.charAt(0) == 'a' || uiLowercase.charAt(0) == 'e' || uiLowercase.charAt(0) == 'i' || uiLowercase.charAt(0) == 'o' || uiLowercase.charAt(0) == 'u') {
                    textToBe.append(uiLowercase + "way");
                    firstLetter = textToBe.charAt(0);
                    textToBe.deleteCharAt(0);
                    textToBe.insert(0, Character.toUpperCase(firstLetter));
                    textToBe.append(symbolLastIndex);
                    System.out.println(textToBe);
                } else {
                    textToBe.append(uiLowercase + uiLowercase.charAt(0) + "ay");
                    textToBe.deleteCharAt(0);
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
                    textToBe.append(uiLowercase + uiLowercase.charAt(0) + "ay");
                    textToBe.deleteCharAt(0);
                    textToBe.append(symbolLastIndex);
                    System.out.println(textToBe);
                }
            }
        }
        else {
            uiLowercase = userInput.toLowerCase();
            if (Character.isUpperCase(userInput.charAt(0))) {
                if (uiLowercase.charAt(0) == 'a' || uiLowercase.charAt(0) == 'e' || uiLowercase.charAt(0) == 'i' || uiLowercase.charAt(0) == 'o' || uiLowercase.charAt(0) == 'u') {
                    textToBe.append(uiLowercase + "way");
                    firstLetter = textToBe.charAt(0);
                    textToBe.deleteCharAt(0);
                    textToBe.insert(0, Character.toUpperCase(firstLetter));
                    textToBe.append(symbolLastIndex);
                    System.out.println(textToBe);
                } else {
                    textToBe.append(uiLowercase + uiLowercase.charAt(0) + "ay");
                    textToBe.deleteCharAt(0);
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
                    textToBe.append(uiLowercase + uiLowercase.charAt(0) + "ay");
                    textToBe.deleteCharAt(0);
                    textToBe.append(symbolLastIndex);
                    System.out.println(textToBe);
                }
            }
        }
        if (isNum(userInput)) {
            System.out.println(userInput);
        }
    }

}
