package strategy;

import com.hz.GenerateRandom;
import com.hz.Opponent;
import adapter.StringToIntAdapter;

public class rps implements moveStrategy {

    GenerateRandom generator = new GenerateRandom();

    int compChoice = generator.generateRPS();
    int playerChoice;
    String choice = "null";

    String gameState = "null";
    StringToIntAdapter adapter = new StringToIntAdapter();


    @Override
    public void requestInput(Opponent opponent) {
        opponent.writer.write("Please choose rock(1), paper(2), scissors(3)!");
        playerChoice = adapter.StringAdapter(opponent.reader.readLine());
    }

    @Override
    public void reply(Opponent opponent) {

        if (compChoice == 1) {
            choice = "rock";
        } else if (compChoice == 2) {
            choice = "paper";
        } else if (compChoice == 3) {
            choice = "scissors";
        }

        opponent.writer.write("The opponent chose " + choice + "! You " + gameState + "!");
    }

    @Override
    public void compare(Opponent opponent) {
        compChoice = generator.generateRPS();

        if (compChoice == 1 && playerChoice == 2) {
            gameState = "win";
        } else if (compChoice == 1 && playerChoice == 3) {
            gameState = "lose";
        } else if (compChoice == 2 && playerChoice == 1) {
            gameState = "lose";
        } else if (compChoice == 2 && playerChoice == 3) {
            gameState = "win";
        } else if (compChoice == 3 && playerChoice == 1) {
            gameState = "win";
        } else if (compChoice == 3 && playerChoice == 2) {
            gameState = "lose";
        } else if (compChoice == playerChoice) {
            gameState = "tie";
        }

        if (gameState == "win") {
            opponent.addWin();
        }
        if (gameState == "lose") {
            opponent.addLoss();
        }

    }
}