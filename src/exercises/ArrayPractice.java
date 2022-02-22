package exercises;
import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
        String suess = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = suess.split("\\.");
        System.out.print(Arrays.toString(words));

    }
}
