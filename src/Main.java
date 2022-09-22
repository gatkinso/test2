public class Main {

    static void roadtrip(Vehicle veh) {
        veh.drive();
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Car c = new Car();

        roadtrip(v);
        roadtrip(c);
    }
}