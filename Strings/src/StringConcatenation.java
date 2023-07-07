public class StringConcatenation {
    public static void main(String[] args) {
        String string1 = "This is string1";
        String string2 = "This is string2";
        String string3 = "This is string3";

        System.out.println(string1 + string2);
        System.out.println(string1.concat(string2));

        // Using StringBuilder
        String finalString = new StringBuilder().append(string1).append(string2).toString();
        System.out.println(finalString);

        StringBuilder newString = new StringBuilder()
                .append(string1)
                .append(string2)
                .append(string3);
        System.out.println(newString);

        // Using StringBuffer
        String otherFinalString = new StringBuffer()
                .append(string1)
                .append(" ")
                .append(string2)
                .append(" ")
                .append(string3)
                .toString();
        System.out.println(otherFinalString);

        // Using format
        System.out.format("%s %s\n", string1, string2);
        // OR
        String yetAnotherString = String.format("%s %s", string2, string3);
        System.out.println(yetAnotherString);
    }
}
