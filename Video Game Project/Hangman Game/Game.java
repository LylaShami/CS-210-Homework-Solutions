import java.util.Scanner;

public class Game {
    // class/global variables=> because we use them in lots of places
    static String targetWord;
    static Scanner reader;    //declared scanner and named it reader
    static String userGuess;
    static String userGuessStatus = "------";
    static int mistakeCount;


    public static void main(String args[]) {

        printTitleAndInstructions();
        targetWord = "string";  //initialize target word
        reader = new Scanner(System.in);  //initialize Scanner

        System.out.println("\n ------STARTING GAME------");
        String wantToContinue;
        do {
            while (mistakeCount < 6) { //keep user guessing while mistakeCount < 6
                userGuess = getCurrentGuess();
                boolean successfulGuess = checkIfTargetContainsUserGuess();
                printUpdatedStatus(successfulGuess);
                if (userGuessStatus.equals(targetWord)) {
                    System.out.println("You got the right answer");
                    break; //break from inner while loop
                }
            } // end of the inner while if game is lost
            resetGame();
            System.out.print("Do you wish to restart? Type yes or no, then hit enter : ");
            wantToContinue = reader.next();

        } while (wantToContinue.equalsIgnoreCase("yes"));
        reader.close();
    }

    private static void resetGame() {
        mistakeCount = 0;
        userGuessStatus = "------";
    }


    private static void printBody(int mistakeCount) { //Abstract them to another class to just show the user the main point
        switch (mistakeCount) {
            case 1:
                // print head
                System.out.println(PrintHangMan.getPrintSmiley());
                break;
            case 2:
                // print head and torso
                System.out.println(PrintHangMan.getPrintSmileyTorso());
                break;
            case 3:
                // print head, torso, right arm
                System.out.println(PrintHangMan.printSmileyTorsoRightArm());

                break;
            case 4:
                //prints head, torso, both arms
                System.out.println(PrintHangMan.printSmileyTorsoRightArmLeftArm());
                break;
            case 5:
                // prints head, torso, both arms, right leg
                System.out.println(PrintHangMan.printSmileyTorsoRightArmLeftArmRightLeg());

                break;
            case 6:
                // prints whole body
                System.out.println(PrintHangMan.printSmileyTorsoRightArmLeftArmRightLegLeftLeg());
                break;
            default:
                //print if there are no mistakes yet
                System.out.println("No mistakes yet!");
                break;
        }
    }


    private static void printTitleAndInstructions() {
        //making banner
        System.out.println("*********************************************");
        System.out.println("*              HANGMAN GAME                 *");
        System.out.println("*********************************************");
        // Letting the user the rules of the game and how to play
        System.out.println("Instructions:" + "\nYou get 6 tries to guess the letters of a word." + "\nEnter one letter at a time. For every letter you get wrong, " + "\npart of the man's body will be hung.");
    }

    private static boolean checkIfTargetContainsUserGuess() {
        if (targetWord.contains(userGuess)) { //using the .contains utility from String class
            System.out.println("That was correct :)");
            return true;
        } else {
            System.out.println("That was wrong :(");
            mistakeCount++;
            return false;
        }
    }

    private static void printUpdatedStatus(boolean successfulGuess) {
        if (successfulGuess) {
            userGuessStatus = userGuessStatus.substring(0, targetWord.indexOf(userGuess)) + userGuess + userGuessStatus.substring(targetWord.indexOf(userGuess) + 1);
            System.out.println(userGuessStatus);
        } else {
            printBody(mistakeCount);//outside of if, because we want this to happen everytime

        }
    }

    private static String getCurrentGuess() {
        System.out.print("\nPlease guess a letter, then hit enter:");
        return reader.next();
    }
}
