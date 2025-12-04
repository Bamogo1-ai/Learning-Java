package smarthomesystem;

 class SmartLock implements SmartDevice {
	 private boolean isLocked = true; // initially locked
	 
	 @Override 
	 public void turnOn() {
		 isLocked =  false;
		 System.out.println("Lock unlocked");
		 
	 }
	 
	 @Override 
	 public void turnOff() {
		 isLocked = true;
		 System.out.println("Lock locked");
		 
	 }
	 
	 @Override
	 public String getStatus() {
		 return isLocked ? "Lock is locked" : "Lock is unlocked";
		 	 }

}
