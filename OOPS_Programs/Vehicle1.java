package OOPS_Programs;

class Vehicle {
	void start() {
		System.out.println("Vehicle is started.");
	}
}

class Car extends Vehicle {
	void drive() {
		System.out.println("Car is driving.");
	}
}

public class Vehicle1 {
	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		c.drive();
	}
}
