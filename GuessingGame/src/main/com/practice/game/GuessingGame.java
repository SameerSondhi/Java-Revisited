package com.practice.game;

import java.util.Random;

public class GuessingGame {
    private final int randomNumber = new Random().nextInt(10) + 1;
    private int counter = 0;
    public String guess(int guessedNumber) {
        counter++;
        String tryText = counter == 1 ? "try" : "tries";
        String winningMessage = String.format("You got it in %d %s", counter, tryText);
        String response = null;

        if(counter == 4 && guessedNumber != randomNumber){
            response = String.format("You did not get it and you've had %d %s. Game over.", counter, tryText);
        } else if(counter>4){
            response = "Sorry you are limited to only 4 tries";
        } else {
            String tooHighLowText = null;
            if(guessedNumber<randomNumber) {
                tooHighLowText = "- too low";
            } else if (guessedNumber>randomNumber){
                tooHighLowText = "- too high";
            }
            else{
                tooHighLowText = "";
            }
            String loseText = String.format("You did not get it %s", tooHighLowText).trim();
                return guessedNumber == getRandomNum() ? winningMessage : loseText;
            }
        return response;
    }

    public int getRandomNum() {
        return randomNumber;
    }

    public static void main(String[] args) {
        GuessingGame game = new GuessingGame();
        boolean continueLoop = true;
        do{
            String input = System.console().readLine("Enter a number: ");
            if("q".equals(input)){
                return;
            }
            String output = game.guess(Integer.parseInt(input));
            System.out.println(output);
            if(output.contains("You got it") || output.contains("over")){
                continueLoop = false;
            }
        }while(continueLoop);
    }
}
