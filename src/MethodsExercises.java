import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

        int addSum = add(8, 8);
        int subtractSum = Subtract(18, 8);
        int multiplySum = Multiplication(8, 8);
        int divideSum = division(8, 2);
        int modSum = Modulus(18, 8);



        System.out.println("Addition :" + addSum);
        System.out.println("Subtraction: " + subtractSum);
        System.out.println("Multiplication: " + multiplySum);
        System.out.println("Division: " + divideSum);
        System.out.println("Modulus: " + modSum);
    }


    public static int add(int a, int b) {
        return a + b;
    }

    public static int Subtract(int a, int b) {
        return a - b;
    }

    public static int Multiplication(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        return a / b;
    }

    public static int Modulus(int a, int b) {
        return a % b;
    }
}