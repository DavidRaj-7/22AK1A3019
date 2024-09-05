import java.util.Scanner;

public class ReverseWordsInString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        scanner.close();
        
        String reversed = reverseWords(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }

    public static String reverseWords(String str) {
        // Split the input string into words
        String[] words = str.split(" ");

        // StringBuilder to store the result
        StringBuilder reversedString = new StringBuilder();

        // Iterate through each word
        for (String word : words) {
            // Reverse the current word and append it to the result
            String reversedWord = reverseString(word);
            reversedString.append(reversedWord).append(" ");
        }

        // Convert StringBuilder to String and remove trailing space
        return reversedString.toString().trim();
    }

    public static String reverseString(String str) {
        // StringBuilder to store the reversed word
        StringBuilder reversed = new StringBuilder();

        // Iterate from the end of the word to the beginning
        for (int i = str.length() - 1; i >= 0; i--) {
            // Append each character to the StringBuilder
            reversed.append(str.charAt(i));
        }

        // Convert StringBuilder to String and return
        return reversed.toString();
    }
}