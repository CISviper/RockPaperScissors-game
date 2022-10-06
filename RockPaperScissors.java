import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Wanna to play? yes to start
        System.out.println("Let's play rock paper scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");
        String ready = scan.nextLine();

        // Setting up the game

        if (ready.equals("yes")) {
            System.out.println("\nGreat!");
            System.out.println("rock - paper - scissors, shoot!");
            String yourChoice = scan.nextLine();
            String computerChoice = computerChoice();
            String result = result(yourChoice, computerChoice);
            printResult(yourChoice, computerChoice, result);

        } else {
            System.out.println("Darn! Some other time.");
        }

        scan.close();
    }

    /*
     * Function name: computerChoice - picks randomly between rock paper and
     * scissors
     */
    public static String computerChoice() {
        double randomNumber = Math.random() * 3; // Random number generator range 0 - 2.9999
        int integer = (int) randomNumber; // cut off decimals randomNumber range 0 - 2

        switch (integer) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            case 2:
                return "scissors";
            default:
                return ""; // imposible. but must be in
        }
    }

    /* Win conditions */
    public static String result(String yourChoice, String computerChoice) {
        String result = "";
        if (yourChoice.equals("rock") && computerChoice.equals("scissors")) {
            result = "You win!";
        } else if (computerChoice.equals("rock") && yourChoice.equals("scissors")) {
            result = "You lose!";
        } else if (yourChoice.equals("paper") && computerChoice.equals("rock")) {
            result = "You win!";
        } else if (computerChoice.equals("paper") && yourChoice.equals("rock")) {
            result = "You lose!";
        } else if (yourChoice.equals("scissors") && computerChoice.equals("paper")) {
            result = "You win!";
        } else if (computerChoice.equals("scissors") && yourChoice.equals("paper")) {
            result = "You lose!";
        } else {
            result = "It's a tie";
        }

        return result;
    }

    /** printResult - It prints everything (your choice, computer choice, result) */
    public static void printResult(String yourChoice, String computerChoice, String result) {
        System.out.println("\nYou chose:\t" + yourChoice);
        System.out.println("\nComputer chose:\t" + computerChoice);
        System.out.println(result);
    }
}