package Parent;
 class Car extends Vehicule{
	 
 private int seats;
	 public Car(String brand, double pricePerDay, int seats) {
		super(brand, pricePerDay);
		this.seats=seats;
	 }
		




	@Override
	
	public double calculateRent(int days) {
		if(days>= 3) {
			return days*pricePerDay*0.9; //10% discount
		}else {
			return 
			super.calculateRent(days);
		}
	}
@Override
public String getVehiculeInfo() {
	return super.getVehiculeInfo()+ "Seats:" + seats;
	
}
}
