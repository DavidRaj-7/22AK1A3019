import java.util.Scanner;

public class PrimeNumbersInRange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number of the range: ");
        int from = scanner.nextInt();
        System.out.print("Enter the ending number of the range: ");
        int to = scanner.nextInt();

        if (from > to) {
            System.out.println("Invalid range. The starting number should be less than or equal to the ending number.");
            return;
        }

        System.out.println("Prime numbers in the range [" + from + ", " + to + "]:");
        printPrimesInRange(from, to);

        scanner.close();
    }

    // Method to print all prime numbers in a given range
    public static void printPrimesInRange(int from, int to) {
        for (int number = from; number <= to; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}