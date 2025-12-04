package logistic;

public class Main {
	public static void main(String[] args) {
		Logistics logistics = new Logistics();
		
		Transport truck = new Truck();
		Transport drone = new Drone();
		Transport ship = new Ship();
		
		logistics.arrangeDelivery(truck, 120); //ok
		logistics.arrangeDelivery(drone, 80); //Not possible
		logistics.arrangeDelivery(drone, 40);// Ok
		logistics.arrangeDelivery(ship, 80);//Not possible
		logistics.arrangeDelivery(ship, 300);//Ok
}

}
