package pl.kocan.singleton.patterns;

import java.io.Serializable;

public class GameEngine implements Serializable {

    private static final long serialVersionUID = 23232323;

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

    protected Object readResolve() {
        return getInstance();
    }

}
