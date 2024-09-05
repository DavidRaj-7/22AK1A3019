import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ReverseFileContent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "sample.txt";
        createSampleFile(fileName);
        System.out.print("Enter the number of characters to read from the start of the file: ");
        int n = scanner.nextInt();
        try {
            String content = readNCharacters(fileName, n);
            String reversedContent = new StringBuilder(content).reverse().toString();
            System.out.println("Reversed content: " + reversedContent);
        } catch (IOException e) {
            e.printStackTrace();
        }

        scanner.close();
    }
    private static void createSampleFile(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (int i = 1; i <= 10; i++) {
                writer.write("This is line number " + i + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static String readNCharacters(String fileName, int n) throws IOException {
        StringBuilder content = new StringBuilder();
        try (RandomAccessFile file = new RandomAccessFile(fileName, "r")) {
            byte[] buffer = new byte[n];
            int bytesRead = file.read(buffer, 0, n);
            if (bytesRead != -1) {
                content.append(new String(buffer, 0, bytesRead, StandardCharsets.UTF_8));
            }
        }
        return content.toString();
    }
}