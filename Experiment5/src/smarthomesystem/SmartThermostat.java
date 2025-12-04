package smarthomesystem;

 class SmartThermostat implements SmartDevice {
	 private boolean isOn = false;
	 private int targetTemp = 25; // default temperature in Celsius
	 
	 @	Override 
	 public void turnOn() {
		 isOn = true;
		 System.out.println("Thermostat on (Target temp: " + targetTemp +  "℃)");
		 
	 }
	 @	Override
	 
public void turnOff() {
	isOn = false;
	System.out.println("Thermostat off");
	
	}
@Override 
public String getStatus() {
	return isOn ? "Thermostat is on (Target temp: " + targetTemp + "℃)" : "Thermostat is off ";
	
}
}
