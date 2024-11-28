
package models;

import java.util.Random;

public class Game {
    private int targetNumber;
    private int attempts;

    public Game() {
        resetGame();
    }

    public void resetGame() {
        Random random = new Random();
        targetNumber = random.nextInt(100) + 1;
        attempts = 0;
    }

    public String guess(int number) {
        attempts++;
        if (number < targetNumber) {
            return "El número es mayor.";
        } else if (number > targetNumber) {
            return "El número es menor.";
        } else {
            return "¡Correcto! Lo lograste en " + attempts + " intentos. El juego se reinicia.";
        }
    }
}
