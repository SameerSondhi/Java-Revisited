import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDec {
    public static void main(String[] args) {
        // Use BigDecimal for money calculations; it is slower than primitive data types however
        BigDecimal num = new BigDecimal("2.15");
        BigDecimal num2 = new BigDecimal("1.10");
        System.out.println(num.subtract(num2));

        System.out.println(new BigDecimal("0.3145683").add(new BigDecimal("5.321")));
        System.out.println(new BigDecimal("0.3145683").subtract(new BigDecimal("5.321")));
        System.out.println(new BigDecimal("0.3145683").multiply(new BigDecimal("5.321")));

        // setPrecision sets the number of non-zero digits
        MathContext mc = new MathContext(5, RoundingMode.HALF_UP);
        System.out.println(new BigDecimal("0.3145683").divide(new BigDecimal("5.321"), mc));
        System.out.println(new BigDecimal("49").sqrt(mc));


        System.out.println(new BigDecimal("7").max(new BigDecimal("13")));
        System.out.println(new BigDecimal("-7").abs());

        System.out.println(new BigDecimal("13").remainder(new BigDecimal(8)));
    }
}
