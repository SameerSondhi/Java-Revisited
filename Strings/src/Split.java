public class Split {
    public static void main(String[] args) {
        String file = """
                Smith,Fred ,1/1/79,1111 ABC St.,Apple,CA
                McGuire,Jerry,2/2/80,2222 DEF St.,Orange,NV
                Flintstone,Fred ,3/3/81,3333 GHI St.,Pear,MO
                Rubble,Barney,4/4/82,4444 JKL St.,Pineapple,IL
                Jetson,George,5/5/83,5555 MNO St.,Grapefruit,NY
                """;
        String[] people = file.split("\n", 4);
        System.out.println(people.length);
        System.out.println(people[3]);
        String[]rubble = people[3].split(",");
        System.out.println(rubble[3]);

    }
}
