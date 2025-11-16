package Parent;

public class VehicleRentalSystem {
    public static void main(String[] args) {

        // Create vehicle objects
        Vehicule car = new Car("Toyota", 300, 5);
        Vehicule bicycle = new Bicycle("Giant", 50, "Electric");
        Vehicule moto = new Motorcycle("Yamaha", 200, 150);

        // Create RentalService
        RentalService service = new RentalService();

        // Test method 1
        System.out.println("=== Single Vehicle Rental ===");
        service.rentVehicle(car, 4);

        // Test method 2
        System.out.println("=== Multiple Vehicle Rental ===");
        Vehicule[] vehicles = { car, bicycle, moto };
        service.rentVehicle(vehicles, "David Bamogo");

        // Test method 3
        System.out.println("=== Vehicle Rental with Insurance ===");
        service.rentVehicle(moto, 8, true);
    }
}
