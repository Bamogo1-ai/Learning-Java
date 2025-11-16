package Parent;

 class Bicycle extends Vehicule {
	 private String type; //Electric or Regular

	public Bicycle(String brand, double pricePerDay, String type) {
		super(brand, pricePerDay);
		this.type=type;
	}
@Override
public String getVehiculeInfo() {
	return super.getVehiculeInfo()+ ",Type:" +type;
// No discount -no need to override calculateRent()	
	
	}

}

