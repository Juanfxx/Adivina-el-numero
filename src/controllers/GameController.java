
package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import models.Game;

public class GameController {
    @FXML
    private TextField inputNumber;

    @FXML
    private Button guessButton;

    @FXML
    private Label feedbackLabel;

    private Game game;

    @FXML
    public void initialize() {
        game = new Game();
        feedbackLabel.setText("¡Adivina un número entre 1 y 100!");
    }

    @FXML
    private void handleGuess() {
        try {
            int guess = Integer.parseInt(inputNumber.getText());
            String feedback = game.guess(guess);
            feedbackLabel.setText(feedback);
            if (feedback.contains("Correcto")) {
                game.resetGame();
            }
        } catch (NumberFormatException e) {
            feedbackLabel.setText("Por favor, introduce un número válido.");
        }
        inputNumber.clear();
    }
}
