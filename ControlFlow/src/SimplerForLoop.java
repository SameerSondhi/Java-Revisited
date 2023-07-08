import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimplerForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        String[] fruits = {"apple", "orange", "pear", "plum"};

        for (int counter = 0; counter < fruits.length; counter++) {
            System.out.printf("The current fruit is %s%n", fruits[counter]);
        }
        // Enhanced For Loop
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Regex for-loops
        String people = """
                Smith, Fred, 1/1/1979
                McGuire, Jerry, 2/2/1980
                Flintstone, Fred, 3/3/1981
                Rubble, Barney, 4/4/1982
                Jetson, George, 5/5/1983
                """;
        String regex = "(?<lastName>\\w+),\\s*(?<firstName>\\w+),\\s*(?<dob>\\d{1,2}/\\d{1,2}/\\d{4})\\n";

        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(people);

        while (mat.find()) {
            System.out.printf("%s %s %s%n", mat.group("firstName"),mat.group("lastName"),mat.group("dob"));
        }
    }
}
