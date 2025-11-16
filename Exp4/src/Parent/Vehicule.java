package Parent;

 class Vehicule {
protected
String brand ;
protected double pricePerDay;


public Vehicule(String brand, double pricePerDay) {
	this.brand=brand;
	this.pricePerDay= pricePerDay;
	
}
public double calculateRent(int days) {
	return days*pricePerDay; //Default calculation
	
}
public String getVehiculeInfo() {
	return"Brand:"+pricePerDay;
	}
}
