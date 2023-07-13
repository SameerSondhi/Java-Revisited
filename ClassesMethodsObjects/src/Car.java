import java.time.Year;
// Create a class called Car
public class Car {
    // Create properties
    private String make;
    private String model;
    private Year modelYear;

    // Generate a constructor
    public Car(String make, String model, Year modelYear) {
        this.make = make;
        this.model = model;
        this.modelYear = modelYear;
    }

    // Use the toString method to print the car's properties
    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", modelYear=" + modelYear +
                '}';
    }
    // Main method, instance of car and then print them
    public static void main(String[] args) {
      Car lambo = new Car("Lamborghini", "Huracan", Year.of(2020));
        System.out.println(lambo);
    }
}
