
public class Main {
    private class C
    {

    }

    static void roadtrip(Vehicle avehicle) {
        avehicle.drive();
    }

    public static void main(String[] args) {
        System.out.println("--Creating a vehicle");

        System.out.println("--Creating a car");
        Vehicle v = new Car();

        System.out.println("--Going on a road trip taking a car");
        roadtrip(v);
    }
}