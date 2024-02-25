package LabWork;
import java.util.Random;
/**
 * The main class
 */
public class Main {
    /**
     * Array length
     */
    public static final int arrayLength = 15;
    /**
     * This is the default constructor
     */
    public Main(){
    }
    /**
     * The main method for running the application
     * @param args Tape array
     */
    public static void main(String[] args) {
        int[] arr = array();
        displayArr(arr);
        int multiplicationElements = multiplicationElements(arr);
        System.out.println("Multiplication elements: " + multiplicationElements);
        System.out.print("=====================================================================\n");
        int sumElements = sumElements(arr);
        System.out.println("Sum elements: " + sumElements);
        arraySort(arr);
    }

    /**
     * The method fills the array with random numbers in the range {5;5}
     * @return array of numbers
     */
    public static int[] array(){
       int minRange = -5;   // Мінімальне значення
       int maxRange = 5; // Максимальне значення
       Random random = new Random();

        int[] arr = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            arr[i] = randomNumber;
        }

        return arr;
    }

    /**
     * The method calculates the sum of the numbers between the first and last zero element in the array
     * @param arr takes an array of numbers
     * @return returns the sum of elements
     */
    public static int sumElements(int[] arr){
        int sum = 0;
        int firstZeroElements = 0;
        int lastZeroElements = 0;

        for (int i = 0; i < arrayLength; i++) {
            if(arr[i] == 0){
                firstZeroElements = i;
                break;
            }
        }

        for (int i = firstZeroElements + 1; i < arrayLength; i++) {
            if(arr[i] == 0){
                lastZeroElements = i;
                break;
            }
        }

        for (int i = firstZeroElements; i < lastZeroElements; i++){
            sum += arr[i];
        }

       return sum;
    }

    /**
     * The method blames multiplication of numbers with even numbers
     * @param arr takes an array of numbers
     * @return returns the product of array numbers
     */
    public static int multiplicationElements(int[] arr){
        int multiplication = 1;

        for (int i = 0; i < arrayLength; i++){
            if(i % 2 == 0){
                multiplication *= arr[i];
            }
        }
        return multiplication;
    }

    /**
     * The method sorts the elements of an array from largest to smallest
     * @param arr takes an array of numbers
     */
    public static void arraySort(int[] arr){
        for (int i = 0; i < arrayLength-1; i++) {
            for (int j = 0; j < arrayLength-i-1; j++) {
                if (arr[j] < arr[j+1]) {
                    // Міняємо місцями елементи, якщо вони стоять в неправильному порядку
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
       displayArr(arr);
    }

    /**
     * The method displays an array on the screen
     * @param arr takes an array of numbers
     */
    public static void displayArr(int[] arr){
        System.out.println("=====================================================================");
        for(int number:arr){
            System.out.print(number + " ");
        }
        System.out.print("\n=====================================================================\n");
    }


}