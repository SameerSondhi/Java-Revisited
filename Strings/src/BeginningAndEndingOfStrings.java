public class BeginningAndEndingOfStrings {
    public static void main(String[] args) {
        String filename = "  file001.txt".strip();
        System.out.println(filename.endsWith("txt"));
        System.out.println(filename.startsWith("file")); // Spaces matter

    }
}
