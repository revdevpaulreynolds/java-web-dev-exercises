package exercises;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String line = "Alice was beginning to get very " +
                "tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice " +
                "she had peeped into the book her sister was " +
                "reading, but it had no pictures or conversations " +
                "in it, 'and what is the use of a book,' thought " +
                "Alice 'without pictures or conversation?'";
        Scanner search = new Scanner(System.in);
        System.out.println("Enter word to search:");
        String searchTerm = search.nextLine().toLowerCase();
        System.out.println(line.toLowerCase().indexOf(searchTerm));
        System.out.println(searchTerm.length());
        String[] split = line.split(searchTerm);
        System.out.println(split[0].concat(split[1].trim()));

    }
}
