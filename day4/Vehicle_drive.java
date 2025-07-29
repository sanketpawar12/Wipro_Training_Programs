package day4;

interface Vehicle_inter {
	void speed();
	void brand();
}

class Car1 implements Vehicle_inter{
	public void speed() {
		System.out.println("The speed of the car is : 35 km/hr");
	}
	public void brand() {
		System.out.println("The brand of the vehicle: BMW");
	}
}

class Bike1 implements Vehicle_inter{
	public void speed() {
		System.out.println("The speed of the bike is : 40 km/hr");
	}
	public void brand() {
		System.out.println("The brand of the bike is : Hero");
	}
}

public class Vehicle_drive{
	public static void main(String[] args) {
		Vehicle_inter v = new Car1();
		v.speed();
		v.brand();
		Vehicle_inter v1 = new Bike1();
		v1.speed();
		v1.brand();
	}
}
