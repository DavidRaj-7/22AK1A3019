import java.util.Scanner;

public class NumberTypeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int sumOfFactors = sumOfProperFactors(number);

        if (sumOfFactors > number) {
            System.out.println(number + " is an Abundant Number.");
        } else if (sumOfFactors < number) {
            System.out.println(number + " is a Deficient Number.");
        } else {
            System.out.println(number + " is a Perfect Number.");
        }

        scanner.close();
    }

    // Method to calculate the sum of proper factors of a number
    public static int sumOfProperFactors(int number) {
        int sum = 1; // 1 is a proper factor of any number
        int sqrt = (int) Math.sqrt(number);

        for (int i = 2; i <= sqrt; i++) {
            if (number % i == 0) {
                sum += i;
                if (i != number / i) {
                    sum += number / i;
                }
            }
        }

        return sum;
    }
}