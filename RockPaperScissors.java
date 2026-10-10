import java.util.Scanner;
import java.util.Random;

class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] moves = {"Rock", "Paper", "Scissors"};
        String[] player = new String[5];
        String[] computer = new String[5];
        String[] result = new String[5];
        Random r = new Random();
        int wins = 0, losses = 0, draws = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Rock, Paper or Scissors: ");
            player[i] = sc.next();

            computer[i] = moves[r.nextInt(3)];

            if (player[i].equalsIgnoreCase(computer[i]))
                result[i] = "Draw";
            else if (
                (player[i].equalsIgnoreCase("Rock") && computer[i].equals("Scissors")) ||
                (player[i].equalsIgnoreCase("Paper") && computer[i].equals("Rock")) ||
                (player[i].equalsIgnoreCase("Scissors") && computer[i].equals("Paper"))
            )
                result[i] = "Player Wins";
            else
                result[i] = "Computer Wins";

            if (result[i].equals("Player Wins"))
                wins++;
            else if (result[i].equals("Computer Wins"))
                losses++;
            else
                draws++;

            System.out.println("Computer: " + computer[i] +
                    " | Result: " + result[i]);
        }

        System.out.println("\nRound | Player | Computer | Result");

        for (int i = 0; i < 5; i++)
            System.out.println((i + 1) + " | " + player[i] +
                    " | " + computer[i] + " | " + result[i]);

        System.out.println("Wins: " + wins + " | Losses: " + losses +
                " | Draws: " + draws + " | Win % = " +
                (wins * 100.0 / 5) + "%");

        sc.close();
    }
}
