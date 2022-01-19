package com.hz;

public final class Opponent {
    private static Opponent instance;

    public String gameMode;
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

        writer.write("You chose " + gameMode);
    }
}
