import model.Vehicles;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        for (Vehicles vehicle : Vehicles.values()) {
            System.out.println(vehicle);
        }
    }
}