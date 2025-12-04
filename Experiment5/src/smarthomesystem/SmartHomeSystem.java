package smarthomesystem;

public class SmartHomeSystem  {
public static void main(String[] args) {
	//create device objects
	SmartDevice light = new SmartLight();
	SmartDevice thermostat = new SmartThermostat();
	SmartDevice lock = new SmartLock();
	
	
	//Store devices in an array
	SmartDevice[] devices = { light, thermostat, lock };
	
	//create Home	controller object
	HomeController controller = new HomeController();
	
	
	// Test turning devices on
	System.out.println("Turning devices on:");
	controller.controlAll(devices, true);
	
	//Test turning devices off
	System.out.println("\nTurning devices off:");
	controller.controlAll(devices, false);
	
	}
}
