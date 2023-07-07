import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class CompoundInterest {

    private static final NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance();
    private static final NumberFormat percentageFormatter = NumberFormat.getPercentInstance();


    public static BigDecimal calculate(String principal, String rate, int years, String contribution) throws ParseException {
        // Balance(Y)   =   P(1 + r)Y   +   c[ ((1 + r)Y - 1) / r ]
        String rateAsPercent = percentageFormatter.parse(rate).toString();
        BigDecimal onePlusR = BigDecimal.ONE.add(new BigDecimal(rateAsPercent)); // 1+r
        BigDecimal onePlusRToPowerOfY = onePlusR.pow(years);
        BigDecimal minusOne = onePlusRToPowerOfY.subtract(BigDecimal.ONE);
        BigDecimal divideByRate = minusOne.divide(new BigDecimal(rateAsPercent));
        BigDecimal timesContribution = divideByRate.multiply(new BigDecimal(moneyFormatter.parse(contribution).toString()));
        BigDecimal pTimesRateToPower = onePlusRToPowerOfY.multiply(new BigDecimal(moneyFormatter.parse(principal).toString()));
        BigDecimal sum = pTimesRateToPower.add(timesContribution);
        return sum;
    }

    public static void main(String[] args) throws ParseException{
        DecimalFormat decimalFormat = new DecimalFormat("$###,###.##;$(#)");
        NumberFormat locale = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        BigDecimal balance = calculate("$10,000", "8%", 10, "$8,000");
        System.out.println(moneyFormatter.format(balance)); // US Dollar format
        System.out.println(decimalFormat.format(balance));
        System.out.println(decimalFormat.format(balance.negate()));
        System.out.println(locale.format(balance));

        DecimalFormat percentage = new DecimalFormat("#.###%");
        System.out.println(percentage.format(0.08175));

        // %f is a float, %n is a new line, .2 is two decimal places; , is a flag
        System.out.printf("$%,(.2f%n", balance);
        // Also this
        String money = String.format("$%,(.2f%n", balance);
        System.out.println(money);


    }

}
