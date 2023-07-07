public class BasicMath {
    public static void main(String[] args) {
        // Addition and subtraction are of equal precedence (left to right)
        System.out.println(7 - 10);

        // Multiplication
        System.out.println(7 * 4);

        // Division (forward slash) and left to right
        System.out.println(8 * 8 * (8 / 4));

        // If both numbers are integers, result will be an integer (result is a whole number)
        System.out.println(7 / 4);

        // Specifying to java that we want a more exact result (float or double)
        System.out.println(7d/4d);
            // OR
        // Highest level of precision makes the result that specific data type
        System.out.println(7f/4);
        System.out.println(7/4f);
        // Type casting
        System.out.println((double)7/4);
        System.out.println((float)7/4);

        // Double is more precise than float (64 bits vs 32 bits)
        // Order of operations
        System.out.println(2 + 3 * 5); // Multiplication comes first
        System.out.println(5 * (2+3)); // Parens operations come first







    }
}
