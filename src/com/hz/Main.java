package com.hz;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ConsoleWriter writer = new ConsoleWriter();
        ConsoleReader reader = new ConsoleReader();

        writer.write("Please insert gametype: '1' for higher/lower,'2' for rock paper scissors");
        String type = reader.readLine();

        if(type.equals("1")) {
            writer.write("You chose higher/lower!");
        }
        else if (type.equals("2")) {
            writer.write("You chose rock paper scissors!");
        }
    }
}
