import java.util.Scanner;

public class ConsoleIOLecture {
    public static void main(String[] args) {
//        System.out.println("I'm a message!");
//        System.out.println("I'm on the next line!");

//        System.out.print("I'm a message!");
//        System.out.print(" I'm not on the next line!\n");
//        System.out.println("Do I show up on the same line?!");

        String instructor = "David";
        int favoriteNum = 19;
        float pi = 3.14F;
        System.out.printf("\tHello, my name is %s, and my favorite numbers are %d and %.2f. Let's be friends!!!\n", instructor, favoriteNum, pi);
        System.out.format("\tHello, my name is %s, and my favorite numbers are %d and %.2f. Let's be friends!!!\n", instructor, favoriteNum, pi);
        System.out.println("Do I show up on the same line?!");

        System.out.println("Hello, my name is " + instructor + ", and my favorite numbers are " + favoriteNum + " and " + pi + ". Let's be friends!!!");

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n"); // More proper way to solve the change in delimiter skips my nextLine issue.

        System.out.print("Enter some number: ");
        int userInt = scanner.nextInt();
        System.out.print("Enter some number, this time it can have float number values: ");
        double userDouble = scanner.nextDouble();

        System.out.println("You entered: --> \"" + userInt + "\" <--");
        System.out.println("You entered: --> \"" + userDouble + "\" <--");

        System.out.print("Enter something: ");
//        scanner.nextLine(); // The hacky cool kid solution
//        String userInput = scanner.nextLine();
        String userInput = scanner.next();

        System.out.println("You entered: --> \"" + userInput + "\" <--");
    }
}