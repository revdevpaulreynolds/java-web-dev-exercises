package exercises;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>() {
            {
                add("buttface");
                add("butthead");
                add("butty");
                add("butly");
                add("wordle");
                add("swill");
                add("spill");
                add("swell");
                add("swole");
                add("stuff");
            }
        };
        printFive(words);
    }
    public static void printFive(ArrayList<String> words) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many letters?");
        int inputNumber = input.nextInt();
        for (String word : words) {
            if (word.length() == inputNumber) {
                System.out.println(word);
            }
        }
    }
}
