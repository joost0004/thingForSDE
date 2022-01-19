package strategy;

import com.hz.GenerateRandom;
import com.hz.Opponent;
import adapter.StringToIntAdapter;

public class higherlower implements moveStrategy{

    GenerateRandom generator = new GenerateRandom();

    int newNumber = generator.generateHigherLower();

    String gameState = "null";
    int choice;
    int prevNumber;
    boolean firstMove = true;

    StringToIntAdapter adapter = new StringToIntAdapter();

    public void checkFirstMove(Opponent opponent) {
        if (firstMove == true) {
            opponent.writer.write("The number is " + newNumber + "!");
            firstMove = false;
            newNumber = generator.generateHigherLower();
        }
    }

    @Override
    public void requestInput(Opponent opponent) {
        this.checkFirstMove(opponent);
        opponent.writer.write("Please choose higher(1) or lower(2)!");
        choice = adapter.StringAdapter(opponent.reader.readLine());
    }

    @Override
    public void reply(Opponent opponent) {
        opponent.writer.write("The number is " + prevNumber + "! You " + gameState + "!");
    }

    @Override
    public void compare(Opponent opponent) {
        if (choice == 1 && newNumber > prevNumber) {
            gameState = "win";
        } else if (choice == 2 && newNumber > prevNumber) {
            gameState = "lose";
        } else if (choice == 1 && newNumber < prevNumber) {
            gameState = "lose";
        } else if (choice == 2 && newNumber < prevNumber) {
            gameState = "win";
        }

        prevNumber = newNumber;

        newNumber = generator.generateHigherLower();

        while (newNumber == prevNumber) {
            newNumber = generator.generateHigherLower();
        }

        if (gameState == "win") {
            opponent.addWin();
        }
        if (gameState == "lose") {
            opponent.addLoss();
        }
    }
}