public class NumericWrapperClasses {
    public static void main(String[] args) {
        int num1 = 7;
        Integer num1B = Integer.valueOf(num1); // auto-boxing
        Double myDouble = Double.valueOf(234.56);
        Float myFloat = Float.valueOf(23.23f);
        Byte myByte = Byte.valueOf("23");

        int age = Integer.parseInt(args[0]);
        System.out.printf("You will be %d years of age in 15 years.%n", age+15);

        storeData(num1B);
    }

    /**
     * Takes in any type of data and stores it somewhere generically
     */
    public static void storeData(Object object){


    }
}
