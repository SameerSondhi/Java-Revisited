import java.util.Random;

public class DoWhileLoops {
    public static void main(String[] args) {
        // Random number from 1 to 10 (without +1, it is from 0  to 9)
        int randomNum = new Random().nextInt(10) + 1;
        System.out.println(randomNum);
        String inputAsString = null;
        int wrongGuesses = 1; // Global scope (if declared within loop --> local scope)
        int guessLimit = 5;
        do {
            inputAsString = System.console().readLine("Please guess a number between 1 and 10 inclusively: ");
            if (inputAsString.matches("-?\\d{1,2}")) {
                int guessedNum = Integer.parseInt(inputAsString);
                if (guessedNum == randomNum) {
                    String tryText = wrongGuesses > 1 ? "tries" : "try";
                    System.out.printf("The random number was %d. You got it in %d %s!%n", randomNum, wrongGuesses, tryText);
                    return;
                } else {
                    System.out.printf("You didn't get it.%n");
                    if(wrongGuesses==guessLimit) {
                        System.out.printf("You've tried %d times. All wrong guesses. Ending program now.%n", wrongGuesses);
                        return;
                    }
                    wrongGuesses++;
                }
            }
        }
            while (!"q".equals(inputAsString) && wrongGuesses <= guessLimit);
            }
        }
