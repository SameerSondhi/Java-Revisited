public class PhoneNumberRegEx {
    public static void main(String[] args) {
        // Curly braces can be used to indicate the number of digits or characters
        // + to indicate one or more
        // * to indicate zero or more
        // ? to indicate zero or one
        // \\s to indicate spaces
        // {3,4} to indicate a range of 3 to 4 digits
        // {3,} to indicate at least 3 digits with no upper limit
        // (\d{3}[-.,\s]?){1,2} to make the regex apply once or twice
        System.out.println("(321) 333-7655".matches("[(]\\d{3}[)][-.,\\s]?\\d{3}[-.,\\s]?\\d{3,4}"));
        System.out.println("333-7655".matches("(\\d{3}[-.,\\s]?){1,2}\\d{3,4}"));

        System.out.println("1.232.333.2365".matches("(1[-.,\\s]?)?(\\d{3}[-.,\\s]?){1,2}\\d{3,4}"));
    }
}
