import java.util.Scanner;

public class StringLec {
    public static void main(String[] args) {
        System.out.println("con" + "cat");

        String con = "con";
        System.out.println(con.concat("cat"));
        System.out.println(con);

        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = scanner.next();
        if (name.toUpperCase().startsWith("D")) {
            System.out.println("OMG MY NAME STARTS WITH A D TOO!!!");
        }

        if (name.toLowerCase().endsWith("d")) {
            System.out.println("OMG MY NAME ENDS WITH A D TOO!!!");
        }

        if (name.endsWith("d") && name.startsWith("D") && !name.equals("David")) {
            System.out.println("How do you manage to start with a D, end with a d, and not have the name \"David?!?!?!\"");
        }

        String sample = "\nI like turtles.   Donkey Rattle.     ";
        System.out.println(sample.charAt(15));
        System.out.println(sample.substring(1,16));
        System.out.println(sample.indexOf("turtles"));
        System.out.println(sample.indexOf("."));
        System.out.println(sample.lastIndexOf("."));
        System.out.println(sample.length());
        System.out.println(sample.replace("turtles", "chocolate"));
        System.out.println(sample.toLowerCase());
        System.out.println(sample.toUpperCase());
        System.out.println(sample.trim());
        System.out.println("toucan toucan two cans toucan toucan toucan".replace("toucan", "pickles"));
    }
}