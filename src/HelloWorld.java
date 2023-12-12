public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("This is an example of a statement");

        /*
        * This is a Comment example!
        *
        */

        byte smallNum = 19;
        System.out.println(smallNum);
        smallNum = 127;
        int notAsSmallNum = smallNum;
        smallNum ++;
        notAsSmallNum ++;
        System.out.println(smallNum);
        System.out.println(notAsSmallNum);

        int numDefault;
        /*  numDefault = 0; -- you MUST set a value for a variable.
        *   In other words there is no default value.
        System.out.println(numDefault); */

        char firstLetterOfGeoff = 'G';

        String message = "I'm a string!";
        String quote = "\"I'm a better String!.\" - Word ";
        System.out.println(message);
        System.out.println(quote);

        final String EMPEROR_OF_CONFUSION = "Rick Sanchez";
        System.out.println(EMPEROR_OF_CONFUSION);
    }
}
