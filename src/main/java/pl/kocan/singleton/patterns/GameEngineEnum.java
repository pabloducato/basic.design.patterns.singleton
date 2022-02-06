package pl.kocan.singleton.patterns;

public enum GameEngineEnum {

    INSTANCE("Duke");

    private int hp = 100;
    private String characterName = "";

    GameEngineEnum(String name) {
        this.characterName = name;
    }

    public void run() {
        while (true) {
            // czekamy na input gracza
            // zmianiamy stan gry
            // renderujemy grafikę
        }
    }

}
