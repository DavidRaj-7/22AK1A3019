import java.math.BigInteger;
import java.util.Scanner;
public class RelationalOperationsOnLargeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first 10-digit integer: ");
        String num1Str = scanner.nextLine();
        System.out.print("Enter the second 10-digit integer: ");
        String num2Str = scanner.nextLine();
        BigInteger num1 = new BigInteger(num1Str);
        BigInteger num2 = new BigInteger(num2Str);
        System.out.println("First integer: " + num1);
        System.out.println("Second integer: " + num2);
        System.out.println("Is the first integer equal to the second? " + num1.equals(num2));
        System.out.println("Is the first integer greater than the second? " + (num1.compareTo(num2) > 0));
        System.out.println("Is the first integer less than the second? " + (num1.compareTo(num2) < 0));
        System.out.println("Is the first integer greater than or equal to the second? " + (num1.compareTo(num2) >= 0));
        System.out.println("Is the first integer less than or equal to the second? " + (num1.compareTo(num2) <= 0));
        scanner.close();
    }
}