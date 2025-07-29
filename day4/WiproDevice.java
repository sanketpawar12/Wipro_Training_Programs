package day4;

abstract class Wiprodevice{
	abstract void deviceType();
	abstract void compileSpeed();
}

class Desktop1 extends Wiprodevice{
	public void deviceType() {
		System.out.println("Wipro provides device: DESKTOP");
	}
	public void compileSpeed() {
		System.out.println("Code is compiled faster in Desktop");
	}
}

class Laptop1 extends Wiprodevice{
	public void deviceType() {
		System.out.println("Wipro provides device: LAPTOP");
	}
	public void compileSpeed() {
		System.out.println("code is compiled faster in Laptop");
	}
}



