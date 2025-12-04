package logistic;

class Truck extends Transport {
	@Override
	public double calculateTime (double distance) {
		return distance / 60.0; //Truck speed = 60 km/h
	}
	@Override
	public String getType() {
		return "Truck";
	}

}
