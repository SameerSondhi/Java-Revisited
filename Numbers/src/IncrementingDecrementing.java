public class IncrementingDecrementing {
    public static void main(String[] args) {
        int x = 1;
        System.out.println(x++); // Increments after and still prints 1
        System.out.println(++x); // Increments before and prints 2

        System.out.println(x--); // Decrements after and prints 1
        System.out.println(--x); // Decrements before and prints 0

        boolean bool = true;
        System.out.println(!bool); // Will print false
    }
}
