package com.practice.game;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessingGameTest {

    private GuessingGame game;

    @BeforeEach
    void setUp() {
        game = new GuessingGame();
    }

    @Test
    public void testSimpleWinSituation(){
        int randomNum = game.getRandomNum();
        String message = game.guess(randomNum);
        assertEquals("You got it in 1 try", message);
    }

    @Test
    public void testOneWrongNegativeGuessSituation(){
        String message = game.guess(-5);
        assertEquals("You did not get it - too low", message);
    }

    @Test
    public void testOneWrongPositiveGuessSituation(){
        int randomNum = game.getRandomNum();
        String message = game.guess(randomNum+1);
        assertEquals("You did not get it - too high", message);
    }

    @Test
//    @RepeatedTest(10) // Repeat a test a number of times; can be used in place of @Test
    public void testRandomNumberGeneration (){
        int[] randomNums = new int[11];
        // Generate a game 50 times, and generate 50 random numbers
        for(int counter = 0; counter<100; counter++) {
            // Java will use the most local game instance
            GuessingGame localGame = new GuessingGame();
            // Using this.game will refer to the global instance
            int randomNum = localGame.getRandomNum();
            randomNums[randomNum] = 1;
        }

        int sum =0;
        for(int counter = 0; counter<11; counter++) {
            sum += randomNums[counter]; // Running total of the tally marks in the array
        }
        assertEquals(10, sum);
    }

    @Test
    public void testFourWrongGuesses(){
        makeThreeWrongGuesses();
        String message = game.guess(-3);
        assertEquals("You did not get it and you've had 4 tries. Game over.", message);

    }

    private void makeThreeWrongGuesses() {
        game.guess(-3);
        game.guess(-3);
        game.guess(-3);
    }

    @Test
    public void testThreeWrongGuessesAndOneCorrect(){
        makeThreeWrongGuesses();
        int correctAnswer = game.getRandomNum();
        String message = game.guess(correctAnswer);
        assertEquals("You got it in 4 tries", message);
    }
    @Test
    public void testTwoWrongGuessesAndOneCorrect(){
        game.guess(-3);
        game.guess(-3);
        int correctAnswer = game.getRandomNum();
        String message = game.guess(correctAnswer);
        assertEquals("You got it in 3 tries", message);
    }
    @Test
    public void testTenWrongGuesses(){
        game.guess(-3);
        game.guess(-3);
        game.guess(-3);
        game.guess(-3);
        game.guess(-3);
        game.guess(-3);
        game.guess(-3);
        game.guess(-3);
        game.guess(-3);
        String message = game.guess(-3);
        assertEquals("Sorry you are limited to only 4 tries", message);
    }
}
