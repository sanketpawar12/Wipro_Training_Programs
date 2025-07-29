package day4;

interface WiproSystems {
	void deviceType();
	void compileSpeed();
}
class Desktop implements WiproSystems{
	public void deviceType() {
		System.out.println("Wipro provides device: DESKTOP");
	}
	public void compileSpeed() {
		System.out.println("code is compiled faster in Desktop");
	}
}

class Laptop implements WiproSystems{
	public void deviceType() {
		System.out.println("Wipro provides device: LAPTOP");
	}
	public void compileSpeed() {
		System.out.println("code is compiled lower in laptop");
	}
}

public class WiproDevices{
	public static void main(String[] args) {
		WiproSystems laptop = new Laptop();
		laptop.deviceType();
		laptop.compileSpeed();
		
		WiproSystems desktop = new Desktop();
		desktop.deviceType();
		desktop.compileSpeed();
	}
}
