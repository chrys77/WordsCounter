import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n*** This program counts the number of words in a text. If you want to exit, just type exit. ***");
        Scanner sc = new Scanner(System.in);

        while(true) {
            int counter = 0;

            System.out.print("\n> Enter the text: ");
            String inputText = sc.nextLine();

            if (inputText.equalsIgnoreCase("exit")) {
                System.out.println("> See you soon!");
                break;
            }

            String[] words = inputText.split(" ");
            for (String word : words) {
                if (!word.isEmpty()) {
                    counter++;
                }
            }

            System.out.println("> This text has " + counter + " words.");
        }
    }
}