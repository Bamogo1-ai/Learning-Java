package Parent;

//==========================
// RentalService class (Overloading methods)
//==========================
class RentalService {

    // Overload 1: rentVehicle(Vehicule v, int days)
    public void rentVehicle(Vehicule v, int days) {
        System.out.println("Vehicle Info: " + v.getVehiculeInfo());
        System.out.println("Total Rent: ¥" + v.calculateRent(days));
        System.out.println("--------------------------");
    }

    // Overload 2: rentVehicle(Vehicule[] vehicles, String customerName)
    public void rentVehicle(Vehicule[] vehicules, String customerName) {
        System.out.println("Customer: " + customerName);
        double total = 0;

        for (Vehicule v : vehicules) {
            System.out.println("Vehicle Info: " + v.getVehiculeInfo());
            double rent = v.calculateRent(3); // Exemple: 3 jours
            System.out.println("Rent: ¥" + rent);
            total += rent;
        }

        System.out.println("Total Rent for " + customerName + ": ¥" + total);
        System.out.println("--------------------------");
    }

    // Overload 3: rentVehicle(Vehicule v, int days, boolean insurance)
    public void rentVehicle(Vehicule v, int days, boolean insurance) {
        double total = v.calculateRent(days);

        if (insurance) {
            total += 50;
        }

        System.out.println("Vehicle Info: " + v.getVehiculeInfo());
        System.out.println("Insurance: " + (insurance ? "Yes (+¥50)" : "No"));
        System.out.println("Final Total: ¥" + total);
        System.out.println("--------------------------");
    }
}
