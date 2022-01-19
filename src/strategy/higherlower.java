package strategy;

import com.hz.Opponent;

public class higherlower implements moveStrategy{

    String gameState = "null";
    String choice = "higher";
    int prevNumber = 3;
    int newNumber = 7;

    @Override
    public void requestInput(Opponent opponent) {

    }

    @Override
    public void reply(Opponent opponent) {
        opponent.writer.write("The number was " + newNumber + "! You " + gameState + "! Please enter a new number between 1-10!");
    }

    @Override
    public void compare(Opponent opponent) {
        if (choice == "higher" && newNumber > prevNumber) {
            gameState = "win";
        } else if (choice == "lower" && newNumber > prevNumber) {
            gameState = "win";
        } else if (choice == "higher" && newNumber < prevNumber) {
            gameState = "lose";
        } else if (choice == "lower" && newNumber < prevNumber) {
            gameState = "win";
        }
    }
}