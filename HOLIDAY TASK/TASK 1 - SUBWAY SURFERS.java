import java.util.Scanner;
import java.util.Random;
public class Subway {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int playerLane = 2;
        int obstacleLane;
        boolean gameOver = false;
        int score = 0;
        System.out.println("**** Simple Subway Game ****");
        System.out.println("Controls: ");
        System.out.println("1 - Move Left");
        System.out.println("2 - Stay");
        System.out.println("3 - Move Right");
        System.out.println("--------------------------");
        while (!gameOver) {
            obstacleLane = rand.nextInt(3) + 1;

            System.out.println("\nObstacle in lane: " + obstacleLane);
            System.out.println("Your lane: " + playerLane);
            System.out.print("Enter move (1/2/3): ");

            int move = sc.nextInt();

            switch (move) {
                case 1:
                    if (playerLane > 1) {
                        playerLane--;
                    }
                    break;

                case 2:
                    break;

                case 3:
                    if (playerLane < 3) {
                        playerLane++;
                    }
                    break;

                default:
                    System.out.println("Invalid move!");
            }

            if (playerLane == obstacleLane) {
                gameOver = true;
                System.out.println("\nCrash! Game Over!");
            } else {
                score++;
                System.out.println("Safe! Score: " + score);
            }
        }

        System.out.println("\nFinal Score: " + score);
        sc.close();
    }
}