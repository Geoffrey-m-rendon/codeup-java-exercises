import java.util.Scanner;

public class ControlStatmentAndLoopsLecture {
    public static void main(String[] args) {

        boolean isThisTrue = 5.0 == 5;
        boolean thisisnotTrue = 5.0 != 5;

        System.out.println(isThisTrue);
        System.out.println(thisisnotTrue);

        System.out.println(19 < 55);
        System.out.println(122 < 55);
        System.out.println(19 >= 5);
        System.out.println(55 <= 55);

        System.out.println(true && false);
        System.out.println(true || false);
        System.out.println(true && true);

        System.out.println(!true);

        Scanner sc = new Scanner(System.in);
        System.out.println("Continue? [y/N] ");
        String userInput = sc.next();

        boolean confirmation = userInput.equalsIgnoreCase("y");

        if(confirmation){
            System.out.println("Thanks here's more about Java.");
        } else {
            System.out.println("Fine then!");
        }


        int caseSwitch = 1;

        switch (caseSwitch) {
            case 1:
                System.out.println("Case 1");
            case 2:
                System.out.println("Case 2");
                break;
            default:
                System.out.println("Case 3");
                break;
        }

        int z = 0;
        while (z < 10) {
            System.out.println("z is " + z);
            z++;
        }

        for(int i = 0; i < 10; i += 1) {
            System.out.println("i is " + i);
        }

        do {
            System.out.println("You will see this despite the condition!");
        } while (false);

        for(int i = 1; i < 100; i++) {
            System.out.println(i);
            if (i == 5) {
                break; // --------------+
            } //                        |
        } //                            |
// <----------------------------+

        for(int i = 1; i <= 10; i++) { // <--+
            if(i % 2 == 1) { //              |
                continue; // ----------------+
            }
            System.out.println(i);
        }

    }
}
