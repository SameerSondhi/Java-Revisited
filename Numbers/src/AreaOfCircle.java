public class AreaOfCircle {
    public static void main(String[] args) {
        System.out.println(areaOfCircle(3));

    }

    /**
     * This method calculates the area of a circle
     * @param radius
     * @return
     */
    public static double areaOfCircle(double radius){
        return Math.PI * (Math.pow(radius, 2));
    }
}
