import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the date of birth in dd-mm-yyyy format
        System.out.print("Enter your date of birth (dd-mm-yyyy): ");
        String dob = scanner.nextLine();

        // Remove hyphens from the date of birth
        dob = dob.replace("-", "");

        // Calculate the sum of digits
        int sum = 0;
        for (int i = 0; i < dob.length(); i++) {
            sum += Character.getNumericValue(dob.charAt(i));
        }

        // Reduce sum to a single digit
        while (sum > 9) {
            int tempSum = 0;
            while (sum > 0) {
                tempSum += sum % 10;
                sum /= 10;
            }
            sum = tempSum;
        }

        // Output the lucky number
        System.out.println("Your lucky number is: " + sum);
    }
}