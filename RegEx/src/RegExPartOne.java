public class RegExPartOne {
    public static void main(String[] args) {
        // Three-letter word that does not start with c-z
        System.out.println("bat".matches("[^c-z]at"));

        // Word has one word character followed by "at"
        // Hyphen does not work here
        System.out.println("-at".matches("\\wat"));
        System.out.println("___".matches("\\w\\w\\w"));

        System.out.println("8".matches("\\d"));

    }
}
