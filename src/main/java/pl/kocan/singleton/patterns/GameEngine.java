package pl.kocan.singleton.patterns;

public class GameEngine {

    private int hp = 100;
    private String characterName = "";
    private static GameEngine instance;

    public GameEngine() {
    }

    public static GameEngine getInstance() {
        if (instance == null) {
            instance = new GameEngine();
        }
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
