import java.util.Random;

public class SwitchStatements {
    public static void main(String[] args) {
        int randomNum = new Random().nextInt(9) +1;
        System.out.printf("Generated number is: %d%n", randomNum);
        switch (randomNum){
            case 1:
                System.out.println("Color: RED");
                break;
            case 2, 3, 4:
                System.out.println("Color: BLUE");
                break;
            default:
                System.out.println("Color: GREEN");
        }
    }
}
