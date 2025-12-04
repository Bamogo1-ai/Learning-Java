package logistic;

 class Ship extends Transport {
	 @Override 
	 public double calculateTime(double distance) {
		 if (distance < 100) return -1; //ship only for long distance
		 return distance /30.0; //ship speed = 30 km/h
		 
	 }
	 @Override
	 public String getType() {
		 return "ship";
	 }

}
