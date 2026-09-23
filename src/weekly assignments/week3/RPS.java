import java.util.Scanner;
public class RPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Choices: 1 = Rock, 2 = Paper, 3 = Scissors");
        System.out.print("Player 1 choice (1/2/3): ");
        int p1 = sc.nextInt();
        
        System.out.print("Player 2 choice (1/2/3): ");
        int p2 = sc.nextInt();

        if (p1 == p2) {
            System.out.println("Result: It's a Tie!");
        } else if ((p1 == 1 && p2 == 3) || 
                   (p1 == 2 && p2 == 1) || 
                   (p1 == 3 && p2 == 2)) {
            System.out.println("Result: Player 1 Wins!");
        } else {
            System.out.println("Result: Player 2 Wins!");
        }
    }
}