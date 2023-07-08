import java.util.Random;

public class WhileLoops {
    public static void main(String[] args) {
        // Random number from 1 to 10 (without +1, it is from 0  to 9)
        int randomNum = new Random().nextInt(10) + 1;
        String inputAsString = null;
        while (!"q".equals(inputAsString)) {
            inputAsString = System.console().readLine("Please guess a number between 1 and 10 inclusively: ");
            if(inputAsString.matches("-?\\d{1,2}")) {
                int guessedNum = Integer.parseInt(inputAsString);
                if (guessedNum == randomNum) {
                    System.out.printf("The random number was %d. You got it!%n", randomNum);
                    return;
                } else {
                    System.out.printf("You didn't get it%n");
                }
            }
        }
    }
}
