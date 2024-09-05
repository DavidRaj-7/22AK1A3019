import java.util.Scanner;

public class PrimeAndNextPalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        scanner.close();

        if (isPrime(number)) {
            System.out.println("The number is prime.");

            int nextPalindrome = findNextPalindrome(number);
            System.out.println("Next palindrome: " + nextPalindrome);
        } else {
            System.out.println("The number is not prime.");
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        int i = 5;
        while (i * i <= number) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }
        return true;
    }

    // Method to find the next palindrome number
    public static int findNextPalindrome(int number) {
        int nextPalindrome = number + 1;
        while (!isPalindrome(nextPalindrome)) {
            nextPalindrome++;
        }
        return nextPalindrome;
    }

    // Method to check if a number is palindrome
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        while (number != 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }
        return originalNumber == reversedNumber;
    }
}