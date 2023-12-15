import java.util.Scanner;

public class MethodsLec{
    public static String sayHello(String name) {
        return String.format("Hello, %s!", name);
    }

    public static void sayHello(int numberOfRepetitions) {
        for (int i = numberOfRepetitions; i > 0; i--) {
            System.out.println("Hello, World!");
        }
    }

    public static String sayHello(String greeting, String name) {
        return String.format("%s, %s!", greeting, name);
    }

    public static String sayHello() {
        return "Hello, World!";
    }

    public static int returnThree() {
        return 3;
    }

    public static void printHello(String name) {
        System.out.printf("Howdy, %s!\n", name);
    }

    public static void areWeThereYet(Scanner scanner) {
        System.out.println("Are we there yet?");
        String resp = scanner.nextLine();
        if (resp.equalsIgnoreCase("yes")) {
            System.out.println("Whoopee!!!");
        } else {
            areWeThereYet(scanner);
        }
    }

    public static void countdown(int start) {
        if (start <= 0) {
            System.out.println("HAPPY NEW YEAR!!!");
            return;
        }
        System.out.println(start + "!");
        countdown(start - 1);
    }

    public static void main(String[] args) {
        System.out.println(sayHello("David"));
        System.out.println(sayHello("Yes, I can hear you", "Clem Fandango"));
        System.out.println(sayHello());
        sayHello(30);
        int three = returnThree();
        System.out.println(three);
        String name = "David";
        printHello(name);
        Scanner sc = new Scanner(System.in);
        areWeThereYet(sc);
        countdown(-10);
    }
}