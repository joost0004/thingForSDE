package strategy;

import com.hz.Opponent;

public class rps implements moveStrategy {

    String compChoice = "rock";
    int playerChoice = 2;
    String choice = "null";

    String gameState = "null";


    @Override
    public void reply(Opponent opponent) {
        opponent.writer.write("The opponent chose " + compChoice + "! You " + gameState + "! Please choose rock(1), paper(2), scissors(3)!");
    }

    @Override
    public void compare(Opponent opponent) {
        if (playerChoice == 1) {
            choice = "rock";
        } else if (playerChoice == 2) {
            choice = "paper";
        } else if (playerChoice == 3) {
            choice = "scissor";
        }

        if (compChoice == "rock" && choice == "paper") {
            gameState = "win";
        } else if (compChoice == "rock" && choice == "scissors") {
            gameState = "lose";
        } else if (compChoice == "paper" && choice == "rock") {
            gameState = "lose";
        } else if (compChoice == "paper" && choice == "scissors") {
            gameState = "win";
        } else if (compChoice == "scissors" && choice == "rock") {
            gameState = "lose";
        } else if (compChoice == "scissors" && choice == "paper") {
            gameState = "lose";
        } else if (compChoice == choice) {
            gameState = "tie";
        }
    }
}