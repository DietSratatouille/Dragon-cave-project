//In this game, the player is in a land full of dragons. The dragons all live in caves with their large piles of collected treasure. Some dragons are friendly and share their treasure. Other dragons are hungry and eat anyone who enters their cave. The player approaches two caves, one with a friendly dragon and the other with a hungry dragon, but doesn’t know which dragon is in which cave. The player must choose between the two.
//
//
//
//        The program should look like this in the console, the player input is in bold:
//        You are in a land full of dragons. In front of you, you see two caves. In one cave, the dragon is friendly and will share his treasure with you. The other dragon is greedy and hungry and will eat you on sight.
//        Which cave will you go into? (1 or 2)
//        1
//        You approach the cave...
//        It is dark and spooky...
//        A large dragon jumps out in front of you! He opens his jaws and...
//        Gobbles you down in one bite!
//            Process finished with exit code 0
//            Questions for this assignment
//            Are dragons really real for real?
//            How does one get input from the player?


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("You are in a land full of dragons. In front of you,\n" +
                "\n" +
                "you see two caves. In one cave, the dragon is friendly\n" +
                "\n" +
                "and will share his treasure with you. The other dragon\n" +
                "\n" +
                "is greedy and hungry and will eat you on sight.\n" +
                "\n" +
                "Which cave will you go into? (1 or 2)");
        //create while loop for user to decide whether to continue and/or rerun the program
        //String contOpt;
        //System.out.println("Continue? Enter y/n");
        //Scanner userInput1 = new Scanner(System.in);
        //String choice1 = userInput2.next();
        //while (true ){


        Scanner userInput2 = new Scanner(System.in);
        String choice1 = userInput2.next();
        //String choice2 = userInput.next();
        if (choice1.equals("1")) {
            System.out.println("Good dragon; man gets paid \n o.O");
            System.out.println("  O");

        }
        else if (choice1.equals("2")) {
            System.out.println("Bad dragon; man gets eaten \n D:");

        }

    }
}
