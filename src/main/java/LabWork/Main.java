package LabWork;
import java.util.Scanner;
/**
 * The main class.
 */
public class Main {
    /**
     * This is the default constructor.
     */
    public Main(){
    }
    /**
     * The main method for running the application.
     * @param args Tape array.
     */
    public static void main(String[] args) {
        String sentence = writeText();
        reversText(sentence);
        System.out.println("\n===============================");
        reverseLetters(sentence);
    }

    /**
     * The method performs writes a sentence.
     * @return Returns the sentence.
     */
    public static String writeText(){
        Scanner in = new Scanner(System.in);
        String sentence;

        do {
            System.out.println("Please enter the sentence:");
            sentence = in.nextLine();
            System.out.println("\n===============================");

        } while (sentence.isEmpty());

        in.close();
        return sentence;
    }

    /**
     * The method separates the sentence and outputs it in the reverse order.
     * @param sentence Retrieves the previously entered sentence.
     */
    public static void reversText(String sentence){

        String[] words = sentence.split(" ");

        for (int i = words.length-1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }

    /**
     * The method converts the tape to an array, reads it in the reverse process and writes it to a new array.
     * @param sentence Retrieves the previously entered sentence.
     */
    public static void reverseLetters(String sentence){
        char[] charArray = sentence.toCharArray();
        char[] reversArray = new char[charArray.length];

        int count = 0;
        for(int i = charArray.length-1; i >= 0; i--) {
            char letters =  charArray[i];
            reversArray[count] = letters;
            count++;
        }
        String str = new String(reversArray);
        System.out.println(str);
        System.out.println("===============================");
    }
}