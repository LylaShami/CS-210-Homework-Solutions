import java.util.Scanner;

public class WordArray {
    // Setting up word array search.
    public static void main(String[] args) {
        System.out.println("*****************************************************************************");
        System.out.println("This program calls a method to search an array of fruits for a specific fruit.");
        System.out.println("*****************************************************************************");
       //putting each step into methods
        Scanner reader = new Scanner(System.in);
        String[] wordlist = fillArray(reader);
        String target = getTargetWord(reader);
        int count = searchTargetWord(wordlist, target);
        output(wordlist, target, count);
        reader.close();
    }
    //Prompting the user and using scanner for searching target word
    public static String getTargetWord(Scanner reader) {
        System.out.print("\nPlease enter the fruit you want to search for: ");
        //searchWord will store the user input
        String searchWord = reader.next();
        return searchWord;
    }
    //setting an array of 5 words and using words input by user
    public static String[] fillArray(Scanner reader) {
        String[] wordlist = new String[5]; // Array of five words
        System.out.println("\nPlease enter in the name of five fruits, one at a time.");
        for (int i = 0; i < wordlist.length; i++) {//begining at the 0th index, traverse/parse till the last index
            System.out.print("\nPlease enter word " + (i + 1) + ", then hit enter:");
            wordlist[i] = reader.next(); //store the word at the i index
        }
        return wordlist;
    }
    // searching the array for target word
    public static int searchTargetWord(String[] wordlist, String target) {
        int found = 0;
        for (int i = 0; i < wordlist.length; i++) {
            //added .equalsIgnore case to ignore upper case or lower case
            if (wordlist[i].equalsIgnoreCase(target)) {
                found++;
            }
        }
        return found;

    }
     //showing results and adding list of words
    public static void output(String[] wordlist, String target, int count) {
        System.out.println(">>>>>>>>>>RESULTS<<<<<<<<<");

        System.out.print("\nThe array of words: " + wordlist[0]);
        for (int i = 1; i < wordlist.length; i++) {
            System.out.print( ", " + wordlist[i]);
        }

        System.out.println( "\nThe search word: " + target);

        if (count > 0) { //if the target word shows up more than 0 times then the value exists
            printValueExists(target, count);
        } else {
            System.out.println("\nValue is not in they array.");
        }


    }
    //Letting user know how many times the target word is counted in array
    private static void printValueExists(String target, int count) {
        if (count == 1) { //added count ==1 incase word only shows up once
            System.out.println("\nThe array contains " + target + " " + count + " time");
        } else { //if target word only shows up once
            System.out.println("\nThe array contains " + target + " " + count + " times");
        }
    }
}



