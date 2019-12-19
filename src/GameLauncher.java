import java.util.Scanner;

public class GameLauncher {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        GuessGame game = new GuessGame();
        game.start();
    }
}
