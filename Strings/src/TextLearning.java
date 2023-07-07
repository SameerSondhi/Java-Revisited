public class TextLearning {
    public static void main(String[] args) {
        String fruit = "apple";
        String anotherFruit = "apple";

        String vegetable = new String("broccoli");
        String anotherVegetable = new String("broccoli");

        System.out.println(fruit == anotherFruit);
        System.out.println(vegetable == anotherVegetable);

        String myText = "mytext";
        System.out.println(myText.toUpperCase());

        String myText2 = "MYTEXT";
        System.out.println(myText2.toLowerCase());

        // Empty string
        String empty = " ";
        // isEmpty is if the length of string is 0 (White spaces are characters)
        System.out.println(empty.isEmpty());

        // isBlank checks whether length is 0 or if there are white spaces
        System.out.println(empty.isBlank());

        // replace is case sensitive
        String replaceText = "here is some unfiltered text";

        System.out.println(replaceText.replace("unfiltered", "filtered"));
        System.out.println(replaceText.replace('e', 'E'));

    }

}
