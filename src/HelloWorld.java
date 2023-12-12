public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int myFavoriteNumber = 52;
        System.out.println(myFavoriteNumber);
        // There are 208 bytes in 52. For every 1 int there are 4 bytes.

        String myString =  "3.14159";
        System.out.println(myString);

        float myNumber = 3.14F;
        System.out.println(myNumber);

        int z = 5;
        System.out.println(z++);
        System.out.println(z);

        int x = 5;
        System.out.println(++x);
        System.out.println(x);

        /* 11.) Try to create a variable named class. What happens?
        * You cannot/shouldn't use reserved words for names within variables.
        */

        String theNumberThree = "three";
        Object o = theNumberThree;
        int three = (int) "three";

        int ab = 4;
        x += 5;

        int abc = 3;
        int y = 4;
        y *= abc;

        int val = 10;
        int val2 = 2;
        val /= val2;
        val2 -= val;


        /*
         * Number too large error when exceeding the max int value,
         * Integers from -2,147,483,648 to 2,147,483,647.
         * Just like with ALL Primitives Types the value has to stay--
         * --within a certain specified value.
         */
        int whatIf = 2147483648;
        System.out.println(whatIf);

    }
}