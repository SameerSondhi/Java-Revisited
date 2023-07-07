import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParsingDocument {
    public static void main(String[] args) {
        String transcript = """
                Student Number:	1234598872			Grade:		11
                Birthdate:		01/02/2000			Gender:	M
                State ID:		8923827123
                                
                Cumulative GPA (Weighted)		3.82
                Cumulative GPA (Unweighted)	3.46
                """;
        String regex = """
                Student\\sNumber:\\s(?<studentNumber>\\d{10}).* # Grabs student number 
                Grade:\\s+(?<grade>\\d{1,2}).* # Grabs grade 
                Birthdate:\\s+(?<birthMonth>\\d{2})/(?<birthDay>\\d{2})/(?<birthYear>\\d{4}).* # Grabs birthdate
                Gender:\\s+(?<gender>\\w+)\\b.* # Grabs gender
                State\\sID:\\s+(?<stateId>\\d+).* # Grabs state ID
                Weighted\\)\\s+(?<weightedGPA>[\\d\\.)]+)\\b.* # Grabs weighted GPA
                Unweighted\\)\\s+(?<unweightedGPA>[\\d\\.)]+)\\b.* # Grabs unweighted GPA
                """;
        Pattern pat = Pattern.compile(regex, Pattern.DOTALL | Pattern.COMMENTS);
        Matcher mat = pat.matcher(transcript);

        if(mat.matches()){
            System.out.println(mat.group("studentNumber"));
            System.out.println(mat.group("grade"));
            System.out.println(mat.group("birthMonth"));
            System.out.println(mat.group("birthDay"));
            System.out.println(mat.group("birthYear"));
            System.out.println(mat.group("gender"));
            System.out.println(mat.group("stateId"));
            System.out.println(mat.group("weightedGPA"));
            System.out.println(mat.group("unweightedGPA"));

        }
    }
}
