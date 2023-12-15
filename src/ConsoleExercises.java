import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f\n", pi);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter some number: ");
        int userInt = scanner.nextInt();
        System.out.println("You entered: " + userInt);

        scanner.nextLine();

//      Three Words of your choice.
        System.out.print("Please enter 3 words of your choice: ");
        String Word1 = scanner.next();
        String Word2 = scanner.next();
        String Word3 = scanner.next();

        System.out.printf("Word 1: %s.%n",  Word1 );
        System.out.printf("Word 2: %s.%n",  Word2 );
        System.out.printf("Word 3: %s.%n", Word3 );


//      Single line sentence.
        System.out.print("Please enter a single line sentence: ");
        String oneLiner = scanner.nextLine();
        System.out.print("\nOne Line Sentence: ");

        System.out.println(oneLiner);

//      Length and Width
        System.out.println("What is the length of your room?");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.println("What is the width of your room?");
        int width = Integer.parseInt(scanner.nextLine());

        System.out.printf("The length of the room is %d.%nThe width of the room is %d.%nThe perimeter of the room is %d.%nThe area of the room is %d.%n", length, width, (2 * length) + (2 * width), length * width);
    }
}