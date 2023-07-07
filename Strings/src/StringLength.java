public class StringLength {
    public static void main(String[] args) {
        String text1 = "for";
        String text2 = "score";
        StringBuilder builder  = new StringBuilder(text1.length() + text2.length())
                .append(text1)
                .append(text2);
        System.out.println(builder.toString());

    }
}
