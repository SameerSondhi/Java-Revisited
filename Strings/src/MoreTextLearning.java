public class MoreTextLearning {
    public static void main(String[] args) {
        String firstName = "  Jake  ";
        // strip(), stripLeading, stripTrailing, stripIndent
        System.out.format("`%s`", firstName.strip());
        System.out.format("`%s`", firstName.stripLeading());
        System.out.format("`%s`", firstName.stripTrailing());

        String multiLine = """
                First line
                Second line
                Third line
                """;
        System.out.println(strip("   N  B   A  "));
    }
    public static String strip(String text){
        String newString = text.replace(" ", "");
        return newString;
    }

}
