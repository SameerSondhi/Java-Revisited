import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CaptureGroupsPartOne {
    public static void main(String[] args) {
        // ?: tells regex to not capture
        // ?<> to name the capture group
        String phoneNumber = "1.232.333.2365";
        String phoneNumber2 = "1 232 333-2365";
        // Keep in mind that when comments are enabled, whitespaces are ignored so be sure to include \\s
        String phoneNumberRegex = """
        # Regex to parse the parts of a phone number
        (?:(?<countryCode>\\d{1,2})[-.,\\s]?)? # Gets the country code
        (?:\\(?(?<areaCode>\\d{3})\\)?[-.,\\s]?) # Gets the area code
        (?:(?<exchange>\\d{3})[-.,\\s]?) # Gets the exchange
        (?<lineNumber>\\d{3,4}) # Gets the line number
        """;
        System.out.println(phoneNumber.matches(phoneNumberRegex));
        Pattern phoneNumberPattern = Pattern.compile(phoneNumberRegex, Pattern.COMMENTS);
        Matcher phoneNumberMatcher = phoneNumberPattern.matcher(phoneNumber2);

        if(phoneNumberMatcher.matches()){
            System.out.format("Country code: %s\n", phoneNumberMatcher.group("countryCode"));
            System.out.format("Area code: %s\n", phoneNumberMatcher.group("areaCode"));
            System.out.format("Exchange: %s\n", phoneNumberMatcher.group("exchange"));
            System.out.format("Line number: %s\n", phoneNumberMatcher.group("lineNumber"));
        }

    }
}
