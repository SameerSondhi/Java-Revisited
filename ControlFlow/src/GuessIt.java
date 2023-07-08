import java.util.Random;

public class GuessIt {
    public static void main(String[] args) {
        int randomNum = new Random().nextInt(7) + 1;
        System.out.printf("Generated number is: %d%n", randomNum);

        if (randomNum <= 2) {
            System.out.println("Color: RED");
        }
        else if(randomNum > 4 && randomNum % 2 == 0){
            System.out.println("Color: BLUE");
        }
        else {
            System.out.println("Color: GREEN");
        }
    }
}
