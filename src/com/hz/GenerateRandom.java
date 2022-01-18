package com.hz;

class GenerateRandom {
    public static void main( String args[] ) {
        int min = 1;
        int max = 3;

        ConsoleWriter writer = new ConsoleWriter();
        ConsoleReader reader = new ConsoleReader();

        //Generate random int value from 50 to 100
        System.out.println("Random value in int from "+min+" to "+max+ ":");
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);

        if(Integer.toString(random_int).equals("1")) {
            writer.write("Rock!");
        }
        else if (Integer.toString(random_int).equals("2")) {
            writer.write("Paper!");
        }
        else if (Integer.toString(random_int).equals("3")) {
            writer.write("Scissors!");
        }
    }
}