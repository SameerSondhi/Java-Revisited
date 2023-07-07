import java.math.BigDecimal;
import java.math.BigInteger;

public class MoreBigDec {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("1024");
        byte b = num1.byteValue();
        System.out.println(num1.doubleValue());
        System.out.println(num1.intValue());
        System.out.println(num1.toString());


        BigInteger myInt = new BigInteger("1234567890123456789");
    }
}
