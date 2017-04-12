package design_patterns.comportamentale.template;

/**
 * Created by Serban on 05.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        AGameTemplate footballGame = new FootballGame();
        AGameTemplate basketballGame = new BasketballGame();

        footballGame.loadGame();
        System.out.println();
        basketballGame.loadGame();
    }
}
