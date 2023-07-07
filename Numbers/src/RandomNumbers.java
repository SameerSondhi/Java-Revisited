import java.security.SecureRandom;
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt());

        SecureRandom secure = new SecureRandom();
        System.out.println(secure.nextInt(10));
    }
}
