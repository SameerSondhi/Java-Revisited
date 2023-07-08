public class PatternMatchingSwitch {
    public static void main(String[] args) {
        record Person(String firstName, String lastName, int age) {
        }
        String s1 = "Hello";
        Integer i1 = 34;
        String[] s2 = {"Hello", "World"};
        Person p1 = new Person("Jake", "Johnson", 40);
        Person p2 = new Person("Abe", "Johnson", 40);

        Object obj = null;
        switch (obj) {
            case String msg -> System.out.println(msg);
            case Integer num -> System.out.println(num);
            case Person p && p.firstName().length() > 3 -> System.out.println("Resembles Jake");
            case String[] arr -> System.out.println("Array of elements");
            case null -> System.out.println("null");
            default -> System.out.println("Neither");
        }
    }
}



