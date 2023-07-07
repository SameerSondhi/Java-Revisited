public class SubString {
    public static void main(String[] args) {
        String fruit = "apple";
        // Method 1
        String newFruit = fruit.substring(0, 1).toUpperCase() + fruit.substring(1).toLowerCase();
        System.out.println(newFruit);

        // Method 2
        String firstPart = fruit.substring(0,1);
        String secondPart = fruit.substring(1);
        String finalString = firstPart.toUpperCase().concat(secondPart);
        System.out.println(finalString);

        // Method 3
        String stringBuilder = new StringBuilder()
                .append(firstPart.toUpperCase())
                .append(secondPart)
                .toString();

        // Method 4

    }
}
