package LabWork;
/**
 * The main class
 */
public class Main {
    static final int lengthArr = 10;
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
        double[] array = createArray();
        double minNumber = searchMin(array);
        outputArray(array, minNumber);
    }
    /**
     * Method for creating and filling an array with numbers in the range [0,1)
     * @return Verification of the converted array
     */
        public static double[] createArray(){
            double[] array = new double[lengthArr];
            for (int i=0; i<lengthArr; i++) {
                array[i] = Math.random();
            }
            return conversionArray(array);
        }
    /**
     * Accepts as a parameter an array that has been created and filled
     * @param array Created array
     * @return Returns an array that is converted to the value of cos(x)
     */
    public static double[] conversionArray(double[] array){
            for(int i=0; i<lengthArr;i++){
                double temp = array[i];
                array[i]=Math.cos(temp);
            }
            return array;
        }
    /**
     * Accepts the final array
     * @param array The final array
     * @param min The minimum value you were looking for
     */
    public static void outputArray(double[] array, double min){
            System.out.println("=======================================");
            System.out.println("\t\t\t\tArray");
            System.out.println("=======================================");
            for(double number:array){
                System.out.println(number);
            }

            System.out.println("=======================================");
            System.out.println("Min cos(x): " + min);
            System.out.println("=======================================");
        }
    /**
     * Finding the minimum number from an array
     * @param array The final array
     * @return Returns the minimum value from the array
     */
    public static double searchMin(double[] array){
            double min = array[0];
            for (int i=0; i<lengthArr-1; i++) {
                if(min > array[i+1]){
                    min = array[i+1];
                }
            }
            return min;
        }
    }
