package Parent;

class Motorcycle extends Vehicule {
	
	private int displacement; //in cc
	public Motorcycle(String brand, double pricePerDay, int displacement) {
		super(brand, pricePerDay);
		this.displacement=displacement;
	
		
	}
	@Override 
	public double calculateRent(int days) {
		if (days>= 7) {
			return days*pricePerDay*0.85; //15% discount
			
		}else {
			return
					super.calculateRent(days);
		}
	}
	@Override 
	public String getVehiculeInfo() {
		return super.getVehiculeInfo()+",Displacement:"+ displacement+ "cc";
	}

}
