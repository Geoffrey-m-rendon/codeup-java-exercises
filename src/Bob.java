import java.util.Scanner;

    public class Bob {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("....Sights Bob..");
        while(true) {
            String input = sc.nextLine();
            if (input.endsWith("!")) {
                System.out.println("...dude calm down.");
            } else if(input.endsWith("?")){
                System.out.println("...sure");
            } else if(input.trim().equalsIgnoreCase("")){
                System.out.println("Fine be that way!");
            } else if(input.equals("pop-can")){
                System.out.println("Be..Easy ✌🏽");
                break;
            } else {
                System.out.println("Whatever");
            }
        }
    }
}
