import java.util.Scanner;
public class ComplexNumber {
    private double real;
    private double imaginary;
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }
    public ComplexNumber subtract(ComplexNumber other) {
        return new ComplexNumber(this.real - other.real, this.imaginary - other.imaginary);
    }
    public ComplexNumber multiply(ComplexNumber other) {
        double realPart = this.real * other.real - this.imaginary * other.imaginary;
        double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(realPart, imaginaryPart);
    }
    public ComplexNumber conjugate() {
        return new ComplexNumber(this.real, -this.imaginary);
    }
    @Override
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + (-imaginary) + "i";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the real part of the first complex number: ");
        double real1 = scanner.nextDouble();
        System.out.print("Enter the imaginary part of the first complex number: ");
        double imaginary1 = scanner.nextDouble();
        ComplexNumber c1 = new ComplexNumber(real1, imaginary1);
        System.out.print("Enter the real part of the second complex number: ");
        double real2 = scanner.nextDouble();
        System.out.print("Enter the imaginary part of the second complex number: ");
        double imaginary2 = scanner.nextDouble();
        ComplexNumber c2 = new ComplexNumber(real2, imaginary2);
        System.out.println("Complex Number 1: " + c1);
        System.out.println("Complex Number 2: " + c2);
        ComplexNumber sum = c1.add(c2);
        System.out.println("Sum: " + sum);
        ComplexNumber difference = c1.subtract(c2);
        System.out.println("Difference: " + difference);
        ComplexNumber product = c1.multiply(c2);
        System.out.println("Product: " + product);
        ComplexNumber conjugateC1 = c1.conjugate();
        ComplexNumber conjugateC2 = c2.conjugate();
        System.out.println("Conjugate of Complex Number 1: " + conjugateC1);
        System.out.println("Conjugate of Complex Number 2: " + conjugateC2);

        scanner.close();
    }
}