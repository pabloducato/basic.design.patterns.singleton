package pl.kocan.singleton.patterns;

public class GameEngine {

    private int hp = 100;
    private String characterName = "";
    private static GameEngine instance = new GameEngine();

    public GameEngine() {
    }

    public static GameEngine getInstance() {
        return instance;
    }

    public void run() {
        while (true) {
            // czekamy na input gracza
            // zmianiamy stan gry
            // renderujemy grafikę
        }
    }

}
