public class CharactersRegEx {
    public static void main(String[] args) {
        // each . represents any character
        // + is 1 or more
        // ? is 0 or 1
        // * is zero or more occurrences
        // ^ means not (so anything other than) when used inside []
        // Outside of [], ^ means matching the beginning of a line or string
        // $ means end of line or string
        // \\b boundary character --> area between a word and a non-word character (in any order)
        // \\w = word character, \\W = anything other than word characters (in this case numbers count as word characters)
        // \\d = numerical digits, \\D = non numerical characters
        // \\s = space, \\S = non-space (but a character needs to be there)
        System.out.println("cat".matches("\\D\\D\\D"));
    }
}
