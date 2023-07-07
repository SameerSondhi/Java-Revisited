public class CentripetalForceCalculation {
    public static void main(String[] args) {
        System.out.println(pathVelocity(6.5, 3));
        System.out.println(centripetalAcceleration(1.67, 4.5));
        System.out.println(centripetalForce(6.5, 2.3));

        System.out.println(centripetalForce(2, 0.8, 3));
    }
    public static double pathVelocity(double radius, double period){
        double circumferenceOfCircle = 2 * Math.PI * radius;
        double pathVelocity = circumferenceOfCircle/period;
        return pathVelocity;
    }

    public static double centripetalAcceleration(double pathVelocity, double radius){
        return Math.pow(pathVelocity, 2)/radius;
    }

    public static double centripetalForce(double mass, double centripetalAcceleration){
        return mass * centripetalAcceleration;
    }

    public static double centripetalForce(double mass, double radius, double period){
        double pathVelocity = pathVelocity(radius, period);
        double centripetalAccel = centripetalAcceleration(pathVelocity, radius);
        double centripetalForce = centripetalForce(mass, centripetalAccel);
        return centripetalForce;
    }
}
