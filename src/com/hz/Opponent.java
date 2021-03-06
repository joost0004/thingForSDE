package com.hz;

import strategy.moveStrategy;
import strategy.rps;
import strategy.higherlower;

public final class Opponent {
    private static Opponent instance;
    private moveStrategy strategy;

    public String gameMode;
    public int amountOfWins = 0;
    private int amountOfLosses;

    public ConsoleWriter writer = new ConsoleWriter();
    public ConsoleReader reader = new ConsoleReader();

    public void setGameMode() {
        writer.write("Please insert gametype: '1' for higher/lower,'2' for rock paper scissors");
        String type = reader.readLine();

        if(type.equals("1")) {
            gameMode = "Higher/Lower";
        }
        else if (type.equals("2")) {
            gameMode = "Rock Paper Scissors";
        } else {
            writer.write("Choose something pls");
            this.setGameMode();
        }

        switch (gameMode) {
            case "Higher/Lower" -> strategy = new higherlower();
            case "Rock Paper Scissors" -> strategy = new rps();
        }

        writer.write("You chose " + gameMode);
    }

    public void playGame(Opponent opponent) {
        while (amountOfLosses < 3) {
            strategy.requestInput(opponent);
            strategy.compare(opponent);
            strategy.reply(opponent);
        }
    }

    public void addWin() {
        amountOfWins += 1;
    }

    public void addLoss() {
        amountOfLosses += 1;

        if (amountOfLosses == 3) {
            writer.write("Game over. You won " + amountOfWins + " times.");
        }
    }


}
