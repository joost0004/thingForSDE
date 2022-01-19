package com.hz;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Opponent opponent = new Opponent();

        opponent.setGameMode();

        opponent.playGame(opponent);
    }
}
