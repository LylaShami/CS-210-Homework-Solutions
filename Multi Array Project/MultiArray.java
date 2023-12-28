import java.util.Scanner;


public class MultiArray {
    static final int LENGTH = 10;

    public static void main(String[] args) {
//todo: make class constant of
        int[][] array = new int[10][10];  //declaring empty array
        loadWithOnes(array); //load it with ones
        other(array);//print
        System.out.println();


        patternRow(array);//loading alternating rows of 0 and 1's
        other(array);//print
        System.out.println();

        patternCheckered(array);//
        other(array);//print
        System.out.println();

        third(array);//
        other(array);//print
        System.out.println();

        System.out.println("----------USER'S CHOICE----------");
        userChoice(array, input(), input(), input());// created variables of the number's user may choose because answers may vary
        other(array);//print
        System.out.println();

        sumArray(array);
//        printing(array);//print
        System.out.println();

    }

    /**
     * This method loads 1s into the 10 by 10 array
     *
     * @param array
     */
    public static void loadWithOnes(int[][] array) {
        System.out.println("\nInitial loading with ones....");
        for (int row = 0; row < LENGTH; row++) { // traversing the row
            for (int col = 0; col < array[row].length; col++) { //traversing the column
                array[row][col] = 1; //loading
            }
        }

    }

    /**
     * this method prints a multidimensional array
     *
     * @param array
     */
    public static void other(int[][] array) {
        System.out.println("Printing array: ");
        for (int row = 0; row < LENGTH; row++) { // traversing the row
            for (int col = 0; col < array[row].length; col++) { //traversing the column
                System.out.print(array[row][col] + " "); //printing
            }
            System.out.println();
        }

    }

    /**
     * this method loads array with alternating rows of 0's and 1's
     *
     * @param array
     */
    public static void patternRow(int[][] array) {
        System.out.println("Loading the array with pattern of 1s and 0s...");
        for (int row = 0; row < LENGTH; row++) { // traversing the row
            for (int col = 0; col < array[row].length; col++) { //traversing the column
                if (row % 2 == 0) { // this means even row
                    array[row][col] = 0;
                } else {
                    array[row][col] = 1;
                }

            }
        }
    }

    /**
     * This method loads array with alternating values of 0 and 8's
     *
     * @param array
     */
    public static void patternCheckered(int[][] array) {
        System.out.println("Loading the array with alternating values of 8 and 0's... ");
        for (int row = 0; row < LENGTH; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if ((row + col) % 2 == 0) {
                    array[row][col] = 0;
                } else {
                    array[row][col] = 8;
                }
            }
        }

    }

    /**
     * This method loads array with alternating third value of 0 and 3's
     *
     * @param array
     */
    public static void third(int[][] array) {
        System.out.println("Loading array with alternating third value...");
        for (int row = 0; row < LENGTH; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if ((row + col) % 3 == 2) {
                    array[row][col] = 3;
                } else {
                    array[row][col] = 0;
                }


            }
        }
    }

    /**
     * This method loads array with alternating numbers the user chooses
     *
     * @param array
     */
    public static void userChoice(int[][] array, int firstVal, int secondVal, int thirdVal) {
        System.out.println("\nLoading array with three numbers set by user");

        for (int row = 0; row < LENGTH; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if ((row + col) % 3 == 0) {
                    array[row][col] = firstVal;

                } else if ((row + col) % 3 == 1) {
                    array[row][col] = secondVal;

                } else if ((row + col) % 3 == 2) {
                    array[row][col] = thirdVal;
                }

            }
        }

    }

    /**
     * This method prompts the user to enter three digits, stores the values then returns values to method call
     *
     * @return
     */
    public static int input() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter a one-digit number, then hit enter:");
        int val = reader.nextInt();
        return val;
    }

    /**
     * This method adds elements in each row, then gives each row sum, Then gives grand sum off all rows
     *
     * @param
     */
    public static void sumArray(int[][] array) {
        System.out.println("--------------TOTALS--------------");
        System.out.println("Loading array with all array sums added up");
        int grandSum = 0;//cannot init within for loop so keep it above for loop to as well widen the for loop.

        for (int row = 0; row < LENGTH; row++) {
            int rowSum = 0;
            for (int col = 0; col < array[row].length; col++) {

                grandSum = grandSum + array[row][col];
                rowSum = rowSum + array[row][col];

            }
            System.out.println("\nSum of row" + " " + row + ":" + " " + rowSum);
        }
        System.out.println("\nGrand sum of all rows: " + " " + grandSum);
    }
}

