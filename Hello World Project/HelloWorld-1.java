import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {

        System.out.print("Please type in the message, then hit enter: ");// asking user for input
        Scanner reader = new Scanner(System.in);// creates a scanner, names it reader
        String userInput = reader.nextLine();//reading in the next line, and storing it as userInput

        //calling printMessage 5 times
        for (int i = 0; i < 5; i++) {
            printMessage(userInput);
        }
    }

    //printing userInput
    public static void printMessage(String userInput) {
        System.out.println(userInput);
    }
}
