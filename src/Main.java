public class Main {

    static void roadtrip(Vehicle veh) {
        veh.drive();
    }

    public static void main(String[] args) {
        System.out.println("--Creating a vehicle");
        Vehicle v = new Vehicle();
        System.out.println("--Creating a car");
        Car c = new Car();

        System.out.println("--Going on a road trip taking a vehicle");
        roadtrip(v);
        System.out.println("--Going on a road trip taking a car");
        roadtrip(c);
    }
}