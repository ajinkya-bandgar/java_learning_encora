import java.io.IOException;
import java.util.Scanner;

public class Entry {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int number1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int number2 = sc.nextInt();

        System.out.println(
                "Select 1 for Addition of two numbers. \nSelect 2 for Substract two of numbers \nSelect 3 for Multiplication of two numbers \nSelect 4 for Division two of numbers");
        int operation = sc.nextInt();

        Action action = new Action();

        if (operation == 1) {
            action.addition(number1, number2);
        }
        String output = (operation == 1) ? action.addition(number1, number2)
                : (operation == 2) ? action.substraction(number1, number2)
                        : (operation == 3) ? action.multiply(number1, number2)
                                : (operation == 4) ? action.division(number1, number2) : "Invalid operation selected...";
        System.out.println(output);
    }
}