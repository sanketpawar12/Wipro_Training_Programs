package day4;

abstract class Vehicle1 {
	abstract void speed();
	abstract void brand();
}
class Car extends Vehicle1{
	void speed() {
		System.out.println("speed of the car : 4km/hr");
	}
	void brand() {
		System.out.println("brand is: audi");
	}
    }

class Bike extends Vehicle1{
	void speed() {
		System.out.println("speed of the bike: 10 km/hr");
	}
	void brand() {
		System.out.println("brand is : Honda");
	}

}
