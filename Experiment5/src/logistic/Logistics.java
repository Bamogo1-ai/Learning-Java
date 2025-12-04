package logistic;

 class Logistics {
	 public void arrangeDelivery(Transport transport, double distance) {
		 double time = transport.calculateTime(distance);
		 
		 System.out.println("Transport type: " + transport.getType());
		 if (time == -1) {
			 System.out.println("SORRY Delivery not possible for " + transport.getType() + " with distance " + distance +" km.\n");
			 
			
		 } else {
			 System.out.println("WELCOME Delivery time " + time + "hours\n");
			 
		 }
	 }

}
