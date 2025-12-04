package smarthomesystem;

class HomeController {
	// Consoles all devices polymorphically
	public void controlAll(SmartDevice[] devices, boolean turnOn) {
		for (SmartDevice device : devices) {
			if (turnOn) {
				device.turnOn();
			} else {
				device.turnOff();
			}
		}
	}

}
