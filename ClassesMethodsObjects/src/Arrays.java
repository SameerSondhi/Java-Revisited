import java.lang.reflect.Array;

public class Arrays {
    public static void main(String[] args) {
        // Create an array and initialize it with the days of the week
        String[] daysOfTheWeek = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println(daysOfTheWeek.length);
        System.out.println(daysOfTheWeek[3]);

        // Create an array and initialize it with numbers 1-10
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Create an array representing a tic-tac-toe board, using char as the data type
        // O X X
        // X O O
        // X O O

        char[][] ticTacToeBoard = {
                {'O', 'X', 'X'},
                {'X', 'O', 'O'},
                {'X', 'O', 'O'},
        };
        // Accessing and printing the bottom right character
        System.out.println(ticTacToeBoard[2][2]);

    }
    // Write a method that allows you to pass any number of Strings as parameters without using an array
    // This concept is called varargs
    // Use static keyword since there is no class for this method
    private static void varArgs(String...args) {
    }
    }

    // Create a method that you can call without creating an instance of its class

    class Exercise6 {
    public static void message(){
        System.out.println("This message can be printed without creating an instance of the Exercise6 class");
    }
    public static void main(String[] args){
        // Call the method on the class without creating an instance of the class
        Exercise6.message();
    }
    }
