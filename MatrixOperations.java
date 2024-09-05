import java.util.Scanner;

public class MatrixOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows for matrices:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns for matrices:");
        int cols = scanner.nextInt();

        int[][] matrixA = new int[rows][cols];
        int[][] matrixB = new int[rows][cols];

        System.out.println("Enter elements for Matrix A:");
        readMatrix(scanner, matrixA);

        System.out.println("Enter elements for Matrix B:");
        readMatrix(scanner, matrixB);

        System.out.println("Matrix A:");
        printMatrix(matrixA);

        System.out.println("Matrix B:");
        printMatrix(matrixB);

        int[][] resultAddition = addMatrices(matrixA, matrixB);
        System.out.println("Matrix A + Matrix B:");
        printMatrix(resultAddition);

        int[][] resultSubtraction = subtractMatrices(matrixA, matrixB);
        System.out.println("Matrix A - Matrix B:");
        printMatrix(resultSubtraction);

        int[][] resultMultiplication = multiplyMatrices(matrixA, matrixB);
        System.out.println("Matrix A * Matrix B:");
        printMatrix(resultMultiplication);

        if (rows == cols) {
            System.out.println("Trace of Matrix A: " + traceMatrix(matrixA));
            System.out.println("Trace of Matrix B: " + traceMatrix(matrixB));
        } else {
            System.out.println("Trace can only be calculated for square matrices.");
        }

        scanner.close();
    }

    // Method to read a matrix from user input
    public static void readMatrix(Scanner scanner, int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int rowsB = B.length;
        int colsB = B[0].length;
        
        if (colsA != rowsB) {
            throw new IllegalArgumentException("Number of columns in A must be equal to the number of rows in B");
        }
        
        int[][] result = new int[rowsA][colsB];
        
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                result[i][j] = 0;
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    // Method to calculate the trace of a matrix
    public static int traceMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int trace = 0;
        
        for (int i = 0; i < rows; i++) {
            trace += matrix[i][i];
        }
        return trace;
    }

    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}