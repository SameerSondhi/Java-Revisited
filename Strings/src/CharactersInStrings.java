public class CharactersInStrings {
    public static void main(String[] args) {
        // charAt() method
        String myText = "Apples";
        System.out.println(myText.charAt(3));

        // compareTo() method
        String apple  = "Apple";
        String banana = "Banana";

        System.out.println(apple.compareTo(banana));
        System.out.println(compareStrings("Peaky", "Blinders"));

        // contains() method
        String newText = "Four score and seven years ago";
        System.out.println(newText.contains("seven"));
        System.out.println(newText.contains("sevens"));
    }

    public static int compareStrings(String text1, String text2){
        String lower1 = text1.toLowerCase();
        String lower2 = text2.toLowerCase();
        return lower1.compareToIgnoreCase(lower2);
    }
}
