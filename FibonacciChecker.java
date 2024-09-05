import java.util.Scanner;

public class FibonacciChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number to check
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Variables to store the Fibonacci sequence
        int a = 0, b = 1, position = 1;

        // Loop to generate Fibonacci numbers until we find or exceed the number
        while (b < number) {
            int temp = b;
            b = a + b;
            a = temp;
            position++;
        }

        // Check if the number is a Fibonacci number
        if (b == number) {
            System.out.println(number + " is the " + position + "th Fibonacci number.");
        } else {
            System.out.println(number + " is not a Fibonacci number.");
        }
    }
}