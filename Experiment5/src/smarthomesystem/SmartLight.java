package smarthomesystem;

 class SmartLight implements SmartDevice {
	private boolean isOn = false;
	private int brightness = 100; // default brightness 
	
	@Override
	public void turnOn() {
		isOn = true;
		System.out.println("Light on (Brihtness: " + brightness + "%)");
		
	}
	public void tunrOff() {
		isOn = false;
		System.out.println("Light off");
		
	}
	@Override 
	public String getStatus() {
		return isOn ? "Light is on (Brightness: " + brightness + "%)"
 : "Light is off";
		}
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}
	
	}

