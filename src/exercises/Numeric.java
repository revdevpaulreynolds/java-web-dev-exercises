package exercises;
import java.util.Scanner;

public class Numeric {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter length:");
        double length = input1.nextDouble();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter width:");
        double width = input2.nextDouble();
        double area = length * width;
        System.out.println("Area is " + area);
    }
}
