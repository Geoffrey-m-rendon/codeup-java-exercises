public class TypesVariablesSyntaxLecture {
    public static void main(String[] args) {
        System.out.println("This is an example of a statement.");
        System.out.println("Notice that it ends with a semicolon.");
        System.out.println("When we create statements: they MUST end with a semicolon");
        System.out.println("Or Java gets mad at us..."); // This is a single line comment.

        /*
         * This is a multiline comment
         * It can go on for multiple lines.
         * Ain't that neat?
         */

        int smallNum = 19;
        System.out.println(smallNum);
        smallNum = 127;
        smallNum++;
        System.out.println(smallNum);

//        int numDefault;
//        numDefault = 0; // you MUST set a value for a variable before accessing it. i.e.: no default value.
//        System.out.println(numDefault);


        char firstLetterOfDavid = 'C';

        String message = "I'm a string!";
        String quote = "\t\"Better out than in, I always say.\" - Shrek, but also Joe Stephens?!";
        System.out.println(message);
        System.out.println(quote);

        final String EMPEROR_OF_CONFUSION = "Rick \"SARCASTIC\" Sanchez";

        byte tinyNum = 22;
        short stillSmallNum = (short) (tinyNum + 3);
        System.out.println(stillSmallNum);
        float almostPi = 3.14F;
        int almostAlmostPi = (int) almostPi;
        System.out.println(almostPi);
        System.out.println(almostAlmostPi);
        long bigNum = 200L;
    }
}