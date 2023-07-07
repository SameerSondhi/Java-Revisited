public class StringsEquality {
    public static void main(String[] args) {
        String firstText = "Apple";
        String secondText = "Apple";
        StringBuffer thirdText = new StringBuffer("Apple");
        StringBuilder fourthText = new StringBuilder("Apple");

        System.out.println(firstText.contentEquals(secondText));
        System.out.println(firstText.contentEquals(thirdText));
        System.out.println(firstText.contentEquals(fourthText));

        // Both the data type and the content must be the same for equals()
        System.out.println(firstText.equals(secondText));
        System.out.println(firstText.equals(thirdText));
        System.out.println(firstText.equals(fourthText));
    }
}
