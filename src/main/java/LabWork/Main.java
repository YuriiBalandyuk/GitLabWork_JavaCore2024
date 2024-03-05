package LabWork;
import java.util.Scanner;
/**
 * The main class.
 */

public class Main {
    /**
     * This is the default constructor.
     */

    Main(){
    }
    /**
     * The main method for running the application.
     * @param args Tape array.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence;

        do {
            System.out.println("==================================================");
            System.out.print("Enter your sentence: ");
            sentence = scanner.nextLine();

        } while (sentence.isEmpty());

        mainMenu(sentence, scanner);
    }
    /**
     * The main menu method
     * @param sentence /
     * @param scanner /
     */

    public static void mainMenu(String sentence, Scanner scanner){
        while (true) {
            System.out.println("==================================================");
            System.out.println("Enter your operation:");
            System.out.println("1.Count the number of punctuation marks in the text");
            System.out.println("2.Print all words with an even number of letters");
            System.out.println("3.Swap the first and last letters of each word");
            System.out.println("4.Close the application");
            System.out.println("==================================================");
            System.out.print("Enter your choice: ");

            int choiceSentence = scanner.nextInt();

            System.out.println("==================================================\n");

            switch (choiceSentence) {
                case 1: {
                    System.out.println("==================================================");
                    System.out.println("Count the number of punctuation marks in the text");


                    int count = symbolCounting(sentence);
                    System.out.println("Count: " + count);

                    System.out.println("==================================================\n");
                    break;
                }

                case 2: {
                    System.out.println("==================================================");
                    System.out.println("Print all words with an even number of letters");
                    System.out.println("Output:");

                    sameNumber(sentence);

                    System.out.println("\n==================================================\n");
                    break;
                }


                case 3: {
                    System.out.println("==================================================");
                    System.out.println("Swap the first and last letters of each word");
                    System.out.println("Output:");

                    reversChar(sentence);

                    System.out.println("\n==================================================\n");
                    break;
                }

                case 4: {
                    System.out.println("==================================================");
                    System.out.println("This programme is over!");
                    System.out.println("==================================================\n");

                    System.exit(0);
                }

            }
        }
    }
    /**
     * Counts the number of punctuation marks in the text.
     * @param sentence /
     * @return Returns the count.
     */

    public static int symbolCounting(String sentence) {
        char[] symbol = {',', '.', '/', '!', '?', '-', '(', ')', ';', ':', '<', '>', '[', ']', '{', '}'};
        char[] charArray = sentence.toCharArray();

        int count = 0;
        for (char c : symbol) {
            for (char value : charArray) {
                if (c == value) {
                    count++;
                }
            }
        }
        return count;
    }
    /**
     * Print all words with an even number of letters.
     * @param sentence /
     */

    public static void sameNumber(String sentence) {
        String[] words = sentence.split(" ");
        char[] symbol = {',', '.', '/', '!', '?', '-', '(', ')', ';', ':', '<', '>', '[', ']', '{', '}'};

        for (String word : words) {
            char[] reversChar = word.toCharArray();

            int count = 0;
            for (char firstValueArray : reversChar) {
                for (char secondValueArray : symbol) {
                    if (firstValueArray == secondValueArray) {
                        count++;
                    }
                }
            }

            char[] halfReversChar = new char[reversChar.length - count];
            int halfReversCharIndex = 0;

            if (reversChar.length >= 2) {
                for (char firstValueArray : reversChar) {
                    boolean isSymbol = false;

                    for (char secondValueArray : symbol) {
                        if (firstValueArray == secondValueArray) {
                            isSymbol = true;
                            break;
                        }
                    }

                    if (!isSymbol) {
                        halfReversChar[halfReversCharIndex] = firstValueArray;
                        if (halfReversCharIndex < halfReversChar.length - 1) {
                            halfReversCharIndex++;
                        }
                    }
                }

                String newWord = new String(halfReversChar);
                if (newWord.length() % 2 == 0) {
                    System.out.print(newWord + " ");
                }
            }
        }
    }
    /**
     * Swap the first and last letters of each word.
     * @param sentence /
     */

    public static void reversChar(String sentence) {
        String[] words = sentence.split(" ");

        char[] symbol = {',', '.', '/', '!', '?', '-', '(', ')', ';', ':', '<', '>' , '[' , ']' , '{' , '}'};

        for (String word : words) {
            char[] reversChar = word.toCharArray();

            int count = 0;
            for (char firstValueArray : reversChar) {
                for (char secondValueArray : symbol) {
                    if (firstValueArray == secondValueArray) {
                        count++;
                    }
                }
            }

            char[] halfReversChar = new char[reversChar.length - count];
            int halfReversCharIndex = 0;

            if (reversChar.length >= 2) {
                for (char firstValueArray : reversChar) {
                    boolean isSymbol = false;

                    for (char secondValueArray : symbol) {
                        if (firstValueArray == secondValueArray) {
                            isSymbol = true;
                            break;
                        }
                    }
                    if (!isSymbol) {
                        halfReversChar[halfReversCharIndex] = firstValueArray;
                        if (halfReversCharIndex < halfReversChar.length - 1) {
                            halfReversCharIndex++;
                        }
                    }
                }

                if (halfReversCharIndex >= 1) {
                char firstChar = halfReversChar[0];
                halfReversChar[0] = halfReversChar[halfReversChar.length - 1];
                halfReversChar[halfReversChar.length - 1] = firstChar;

                String newWord = new String(halfReversChar);
                System.out.print(newWord + " ");
                }
            }
        }
    }
}