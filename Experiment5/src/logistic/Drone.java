package logistic;

 class Drone extends Transport {
	 @Override
	 public double calculateTime(double distance) {
		 if (distance > 50) return -1; //Drone cannot go beyond 50 km
		 return distance / 120.0; //Drone speed = 120 km/h
	 }
@Override
public String getType() {
	return "Drone";
	}
}
