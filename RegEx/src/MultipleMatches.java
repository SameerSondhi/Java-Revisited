import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleMatches {
        public static void main(String[] args) {
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

        mat.find();
        System.out.println(mat.group("lastName"));
        System.out.println(mat.group("firstName"));
        System.out.println(mat.group("dob"));

        mat.find();
        System.out.println(mat.group("lastName"));
        System.out.println(mat.group("firstName"));
        System.out.println(mat.group("dob"));

        mat.find();
        System.out.println(mat.group("lastName"));
        System.out.println(mat.group("firstName"));
        System.out.println(mat.group("dob"));

        mat.find();
        System.out.println(mat.group("lastName"));
        System.out.println(mat.group("firstName"));
        System.out.println(mat.group("dob"));
        }
}
